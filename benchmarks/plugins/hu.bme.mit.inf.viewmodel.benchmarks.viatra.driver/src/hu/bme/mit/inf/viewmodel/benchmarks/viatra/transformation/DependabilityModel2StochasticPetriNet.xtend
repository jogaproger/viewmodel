package hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.FailureRepairModel
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ImmediateRepairModel
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.ErrorModelTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.RailwayContainerTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.RequiredElementConnectionTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.TracedDependabilityQueries
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.FailedErrorModelTraceQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.RouteRequiresElementInRailwayModelQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.TracedErrorModelQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwayContainerQuerySpecification
import java.util.HashSet
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.rules.EventDrivenTransformationRuleGroup

class DependabilityModel2StochasticPetriNet extends HandCodedTransformation {

	val DependabilityModel dependabilityModel

	Dependability2StochasticPetriNetTrace traceModel

	RailwayContainerTraceMatcher railwayContainerTraceMatcher
	ErrorModelTraceMatcher errorModelTraceMatcher
	RequiredElementConnectionTraceMatcher requiredElementConnectionTraceMatcher

	new(RailwayContainer railwayContainer, DependabilityModel dependabilityModel, ResourceSet resourceSet) {
		super(railwayContainer, resourceSet)
		this.dependabilityModel = dependabilityModel
		traceModel.dependabilityModel = dependabilityModel
	}

	override protected createTraceModel(RailwayContainer railwayContainer) {
		traceModel = Dependability2StochasticPetriNetFactory.eINSTANCE.createDependability2StochasticPetriNetTrace => [
			it.railwayContainer = railwayContainer
		]
	}

	override getTraceLinkCount() {
		traceModel.traceLinks.size
	}

	override protected getQueryGroup() {
		val queries = new HashSet<IQuerySpecification<?>>
		queries += RailwayContainerQuerySpecification.instance
		queries += TracedDependabilityQueries.instance.specifications
		new GenericQueryGroup(queries)
	}

	override protected createMatchers(ViatraQueryEngine queryEngine) {
		railwayContainerTraceMatcher = RailwayContainerTraceMatcher.on(queryEngine)
		errorModelTraceMatcher = ErrorModelTraceMatcher.on(queryEngine)
		requiredElementConnectionTraceMatcher = RequiredElementConnectionTraceMatcher.on(queryEngine)
	}

	override protected getTransformationRuleGroup() {
		extension val StochasticPetriNetFactory = StochasticPetriNetFactory.eINSTANCE
		extension val Dependability2StochasticPetriNetFactory = Dependability2StochasticPetriNetFactory.eINSTANCE

		val railwayContainerRule = createRule.precondition(RailwayContainerQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			val petriNet = createPetriNet
			val traceLink = createRailwayContainer2PetriNet
			traceLink.railwayContainer = container
			traceLink.petriNet = petriNet
			targetResource.contents += petriNet
			traceModel.traceLinks += traceLink
		].action(CRUDActivationStateEnum.DELETED) [
			for (traceLink : railwayContainerTraceMatcher.getAllValuesOfTraceLink(traceModel, container)) {
				targetResource.contents -= traceLink.petriNet
				traceModel.traceLinks -= traceLink
			}
		].build

		val dependabilityModelRule = createRule.precondition(TracedErrorModelQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			val traceLink = createErrorModel2PetriNetModule
			traceLink.errorModel = model
			val up = createPlace => [tokens = 1]
			val down = createPlace
			traceLink.up = up
			traceLink.down = down
			var Transition repair
			switch (model) {
				FailureRepairModel: {
					val fail = createTimedTransition
					traceLink.nodes += fail
					traceLink.arcs += createArc(up, fail)
					traceLink.arcs += createArc(fail, down)
					repair = createTimedTransition
				}
				ImmediateRepairModel: {
					repair = createImmediateTransition
				}
				default:
					throw new IllegalArgumentException("Unknown ErrorModel: " + model)
			}
			traceLink.repair = repair
			traceLink.nodes += #[up, down, repair]
			petriNet.nodes += traceLink.nodes
			traceLink.arcs += createArc(down, repair)
			traceLink.arcs += createArc(repair, up)
			traceModel.traceLinks += traceLink
		].action(CRUDActivationStateEnum.DELETED) [
			for (traceLink : errorModelTraceMatcher.getAllValuesOfTraceLink(traceModel, model)) {
				removePetriNetModule(petriNet, traceLink)
			}
		].filter[match|match.traceModel == traceModel].build

		val failedErrorModelRule = createRule.precondition(FailedErrorModelTraceQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			traceLink.up.tokens = 0
			traceLink.down.tokens = 1
		].action(CRUDActivationStateEnum.DELETED) [
			traceLink.up.tokens = 1
			traceLink.down.tokens = 0
		].filter[match|match.traceModel == traceModel].build

		val connectionRule = createRule.precondition(RouteRequiresElementInRailwayModelQuerySpecification.instance).
			action(CRUDActivationStateEnum.CREATED) [
				val traceLink = createRequiredElement2Connection
				traceLink.source = sourceLink.errorModel
				traceLink.target = targetLink.errorModel
				val fail = createImmediateTransition
				traceLink.nodes += fail
				traceLink.arcs += createArc(targetLink.up, fail)
				traceLink.arcs += createArc(fail, targetLink.down)
				traceLink.arcs += createArc(sourceLink.down, fail)
				traceLink.arcs += createArc(fail, sourceLink.down)
				traceLink.arcs += createArc(sourceLink.up, targetLink.repair)
				traceLink.arcs += createArc(targetLink.repair, sourceLink.up)
				petriNet.nodes += traceLink.nodes
				traceModel.traceLinks += traceLink
			].action(CRUDActivationStateEnum.DELETED) [
				for (traceLink : requiredElementConnectionTraceMatcher.getAllValuesOfTraceLink(traceModel, sourceLink,
					targetLink)) {
					removePetriNetModule(petriNet, traceLink)
				}
			].filter[match|match.traceModel == traceModel].build

		new EventDrivenTransformationRuleGroup(railwayContainerRule, dependabilityModelRule, failedErrorModelRule,
			connectionRule)
	}

	private def createArc(ArcKind kind, Place place, Transition transition) {
		val arc = StochasticPetriNetFactory.eINSTANCE.createArc
		arc.kind = kind
		arc.place = place
		arc.transition = transition
		arc
	}

	private def createArc(Place place, Transition transition) {
		createArc(ArcKind.INPUT, place, transition)
	}

	private def createArc(Transition transition, Place place) {
		createArc(ArcKind.OUTPUT, place, transition)
	}

	private def void removePetriNetModule(PetriNet petriNet, PetriNetModuleTraceLink traceLink) {
		petriNet.nodes.removeAll(traceLink.nodes)
		EcoreUtil.removeAll(traceLink.arcs)
		traceModel.traceLinks -= traceLink
	}
}
