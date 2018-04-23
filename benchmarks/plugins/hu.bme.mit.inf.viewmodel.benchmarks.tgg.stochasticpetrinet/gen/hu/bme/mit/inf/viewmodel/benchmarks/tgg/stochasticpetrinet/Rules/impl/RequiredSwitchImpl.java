/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ImmediateTransition;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RequiredSwitchImpl extends AbstractRuleImpl implements RequiredSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getRequiredSwitch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer) {

		Object[] result1_black = RequiredSwitchImpl.pattern_RequiredSwitch_0_1_initialbindings_blackBBBBBB(this, match,
				srcRoute, srcSwitch, srcSwitchPosition, srcContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcRoute] = " + srcRoute + ", " + "[srcSwitch] = " + srcSwitch
					+ ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", " + "[srcContainer] = " + srcContainer
					+ ".");
		}

		Object[] result2_bindingAndBlack = RequiredSwitchImpl
				.pattern_RequiredSwitch_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, srcRoute, srcSwitch,
						srcSwitchPosition, srcContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcRoute] = " + srcRoute + ", " + "[srcSwitch] = " + srcSwitch
					+ ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", " + "[srcContainer] = " + srcContainer
					+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RequiredSwitchImpl.pattern_RequiredSwitch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RequiredSwitchImpl
					.pattern_RequiredSwitch_0_4_collectelementstobetranslated_blackBBBBB(match, srcRoute, srcSwitch,
							srcSwitchPosition, srcContainer);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[srcRoute] = "
								+ srcRoute + ", " + "[srcSwitch] = " + srcSwitch + ", " + "[srcSwitchPosition] = "
								+ srcSwitchPosition + ", " + "[srcContainer] = " + srcContainer + ".");
			}
			RequiredSwitchImpl.pattern_RequiredSwitch_0_4_collectelementstobetranslated_greenBBBFF(match, srcRoute,
					srcSwitchPosition);
			//nothing EMoflonEdge srcRoute__srcSwitchPosition____follows = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge srcSwitchPosition__srcRoute____route = (EMoflonEdge) result4_green[4];

			Object[] result5_black = RequiredSwitchImpl.pattern_RequiredSwitch_0_5_collectcontextelements_blackBBBBB(
					match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[srcRoute] = "
								+ srcRoute + ", " + "[srcSwitch] = " + srcSwitch + ", " + "[srcSwitchPosition] = "
								+ srcSwitchPosition + ", " + "[srcContainer] = " + srcContainer + ".");
			}
			RequiredSwitchImpl.pattern_RequiredSwitch_0_5_collectcontextelements_greenBBBBBFFF(match, srcRoute,
					srcSwitch, srcSwitchPosition, srcContainer);
			//nothing EMoflonEdge srcSwitchPosition__srcSwitch____target = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge srcSwitch__srcSwitchPosition____positions = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result5_green[7];

			// 
			RequiredSwitchImpl.pattern_RequiredSwitch_0_6_registerobjectstomatch_expressionBBBBBB(this, match, srcRoute,
					srcSwitch, srcSwitchPosition, srcContainer);
			return RequiredSwitchImpl.pattern_RequiredSwitch_0_7_expressionF();
		} else {
			return RequiredSwitchImpl.pattern_RequiredSwitch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = RequiredSwitchImpl
				.pattern_RequiredSwitch_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Transition trgRouteRepair = (Transition) result1_bindingAndBlack[0];
		Route srcRoute = (Route) result1_bindingAndBlack[1];
		Place trgRouteOperational = (Place) result1_bindingAndBlack[2];
		Place trgSwitchOperational = (Place) result1_bindingAndBlack[3];
		Place trgRouteFailed = (Place) result1_bindingAndBlack[4];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[5];
		Place trgSwitchFailed = (Place) result1_bindingAndBlack[6];
		Switch srcSwitch = (Switch) result1_bindingAndBlack[7];
		RouteToFailed routeFailedCorr = (RouteToFailed) result1_bindingAndBlack[8];
		SwitchPosition srcSwitchPosition = (SwitchPosition) result1_bindingAndBlack[9];
		RouteToRepair routeRepairCorr = (RouteToRepair) result1_bindingAndBlack[10];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[11];
		SwitchToOperational switchOperationalCorr = (SwitchToOperational) result1_bindingAndBlack[12];
		SwitchToFailed switchFailedCorr = (SwitchToFailed) result1_bindingAndBlack[13];
		RouteToOperational routeOperationalCorr = (RouteToOperational) result1_bindingAndBlack[14];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[15];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[16];
		Object[] result1_green = RequiredSwitchImpl.pattern_RequiredSwitch_1_1_performtransformation_greenBFBBBFBBFFFFF(
				trgRouteRepair, trgRouteOperational, trgSwitchOperational, trgRouteFailed, trgPetrinet,
				trgSwitchFailed);
		Arc trgSwitchOperationalToRouteRepair = (Arc) result1_green[1];
		ImmediateTransition trgRouteFail = (ImmediateTransition) result1_green[5];
		Arc trgRouteRepairToSwitchOperational = (Arc) result1_green[8];
		Arc trgRouteFailToSwitchFailed = (Arc) result1_green[9];
		Arc trgRouteFailToRouteFailed = (Arc) result1_green[10];
		Arc trgRouteOperationalToRouteFail = (Arc) result1_green[11];
		Arc trgSwitchFailedToRouteFail = (Arc) result1_green[12];

		Object[] result2_black = RequiredSwitchImpl.pattern_RequiredSwitch_1_2_collecttranslatedelements_blackBBBBBBB(
				trgSwitchOperationalToRouteRepair, trgRouteFail, trgRouteRepairToSwitchOperational,
				trgRouteFailToSwitchFailed, trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail,
				trgSwitchFailedToRouteFail);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: "
					+ "[trgSwitchOperationalToRouteRepair] = " + trgSwitchOperationalToRouteRepair + ", "
					+ "[trgRouteFail] = " + trgRouteFail + ", " + "[trgRouteRepairToSwitchOperational] = "
					+ trgRouteRepairToSwitchOperational + ", " + "[trgRouteFailToSwitchFailed] = "
					+ trgRouteFailToSwitchFailed + ", " + "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed
					+ ", " + "[trgRouteOperationalToRouteFail] = " + trgRouteOperationalToRouteFail + ", "
					+ "[trgSwitchFailedToRouteFail] = " + trgSwitchFailedToRouteFail + ".");
		}
		Object[] result2_green = RequiredSwitchImpl.pattern_RequiredSwitch_1_2_collecttranslatedelements_greenFBBBBBBB(
				trgSwitchOperationalToRouteRepair, trgRouteFail, trgRouteRepairToSwitchOperational,
				trgRouteFailToSwitchFailed, trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail,
				trgSwitchFailedToRouteFail);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RequiredSwitchImpl
				.pattern_RequiredSwitch_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBBB(ruleresult,
						trgRouteRepair, trgSwitchOperationalToRouteRepair, srcRoute, trgRouteOperational,
						trgSwitchOperational, trgRouteFailed, trgRouteFail, trgPetrinet, trgSwitchFailed, srcSwitch,
						routeFailedCorr, srcSwitchPosition, trgRouteRepairToSwitchOperational, routeRepairCorr,
						trgRouteFailToSwitchFailed, srcContainer, trgRouteFailToRouteFailed, switchOperationalCorr,
						trgRouteOperationalToRouteFail, switchFailedCorr, routeOperationalCorr,
						trgSwitchFailedToRouteFail, containerCorr);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[trgRouteRepair] = " + trgRouteRepair + ", " + "[trgSwitchOperationalToRouteRepair] = "
					+ trgSwitchOperationalToRouteRepair + ", " + "[srcRoute] = " + srcRoute + ", "
					+ "[trgRouteOperational] = " + trgRouteOperational + ", " + "[trgSwitchOperational] = "
					+ trgSwitchOperational + ", " + "[trgRouteFailed] = " + trgRouteFailed + ", " + "[trgRouteFail] = "
					+ trgRouteFail + ", " + "[trgPetrinet] = " + trgPetrinet + ", " + "[trgSwitchFailed] = "
					+ trgSwitchFailed + ", " + "[srcSwitch] = " + srcSwitch + ", " + "[routeFailedCorr] = "
					+ routeFailedCorr + ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", "
					+ "[trgRouteRepairToSwitchOperational] = " + trgRouteRepairToSwitchOperational + ", "
					+ "[routeRepairCorr] = " + routeRepairCorr + ", " + "[trgRouteFailToSwitchFailed] = "
					+ trgRouteFailToSwitchFailed + ", " + "[srcContainer] = " + srcContainer + ", "
					+ "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed + ", " + "[switchOperationalCorr] = "
					+ switchOperationalCorr + ", " + "[trgRouteOperationalToRouteFail] = "
					+ trgRouteOperationalToRouteFail + ", " + "[switchFailedCorr] = " + switchFailedCorr + ", "
					+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[trgSwitchFailedToRouteFail] = "
					+ trgSwitchFailedToRouteFail + ", " + "[containerCorr] = " + containerCorr + ".");
		}
		RequiredSwitchImpl.pattern_RequiredSwitch_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFF(
				ruleresult, trgRouteRepair, trgSwitchOperationalToRouteRepair, srcRoute, trgRouteOperational,
				trgSwitchOperational, trgRouteFailed, trgRouteFail, trgPetrinet, trgSwitchFailed, srcSwitchPosition,
				trgRouteRepairToSwitchOperational, trgRouteFailToSwitchFailed, trgRouteFailToRouteFailed,
				trgRouteOperationalToRouteFail, trgSwitchFailedToRouteFail);
		//nothing EMoflonEdge trgSwitchOperationalToRouteRepair__trgSwitchOperational____place = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge srcRoute__srcSwitchPosition____follows = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge srcSwitchPosition__srcRoute____route = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgRouteFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgPetrinet__trgRouteFail____nodes = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgSwitchOperationalToRouteRepair__trgRouteRepair____transition = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgRouteFailToSwitchFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToSwitchFailed____arcs = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgRouteRepairToSwitchOperational__trgSwitchOperational____place = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge trgRouteFailToSwitchFailed__trgSwitchFailed____place = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgSwitchFailedToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgRouteFail__trgSwitchFailedToRouteFail____arcs = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgSwitchFailedToRouteFail__trgSwitchFailed____place = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgRouteRepairToSwitchOperational__trgRouteRepair____transition = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgRouteRepair__trgRouteRepairToSwitchOperational____arcs = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[36];
		//nothing EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = (EMoflonEdge) result3_green[37];

		// 
		// 
		RequiredSwitchImpl.pattern_RequiredSwitch_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBBB(this,
				ruleresult, trgRouteRepair, trgSwitchOperationalToRouteRepair, srcRoute, trgRouteOperational,
				trgSwitchOperational, trgRouteFailed, trgRouteFail, trgPetrinet, trgSwitchFailed, srcSwitch,
				routeFailedCorr, srcSwitchPosition, trgRouteRepairToSwitchOperational, routeRepairCorr,
				trgRouteFailToSwitchFailed, srcContainer, trgRouteFailToRouteFailed, switchOperationalCorr,
				trgRouteOperationalToRouteFail, switchFailedCorr, routeOperationalCorr, trgSwitchFailedToRouteFail,
				containerCorr);
		return RequiredSwitchImpl.pattern_RequiredSwitch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = RequiredSwitchImpl
				.pattern_RequiredSwitch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = RequiredSwitchImpl
				.pattern_RequiredSwitch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = RequiredSwitchImpl.pattern_RequiredSwitch_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Route srcRoute = (Route) result2_binding[0];
		Switch srcSwitch = (Switch) result2_binding[1];
		SwitchPosition srcSwitchPosition = (SwitchPosition) result2_binding[2];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[3];
		for (Object[] result2_black : RequiredSwitchImpl.pattern_RequiredSwitch_2_2_corematch_blackFBFFFFFBFBFBFFFFB(
				srcRoute, srcSwitch, srcSwitchPosition, srcContainer, match)) {
			Transition trgRouteRepair = (Transition) result2_black[0];
			Place trgRouteOperational = (Place) result2_black[2];
			Place trgSwitchOperational = (Place) result2_black[3];
			Place trgRouteFailed = (Place) result2_black[4];
			PetriNet trgPetrinet = (PetriNet) result2_black[5];
			Place trgSwitchFailed = (Place) result2_black[6];
			RouteToFailed routeFailedCorr = (RouteToFailed) result2_black[8];
			RouteToRepair routeRepairCorr = (RouteToRepair) result2_black[10];
			SwitchToOperational switchOperationalCorr = (SwitchToOperational) result2_black[12];
			SwitchToFailed switchFailedCorr = (SwitchToFailed) result2_black[13];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result2_black[14];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[15];
			// ForEach 
			for (Object[] result3_black : RequiredSwitchImpl
					.pattern_RequiredSwitch_2_3_findcontext_blackBBBBBBBBBBBBBBBB(trgRouteRepair, srcRoute,
							trgRouteOperational, trgSwitchOperational, trgRouteFailed, trgPetrinet, trgSwitchFailed,
							srcSwitch, routeFailedCorr, srcSwitchPosition, routeRepairCorr, srcContainer,
							switchOperationalCorr, switchFailedCorr, routeOperationalCorr, containerCorr)) {
				Object[] result3_green = RequiredSwitchImpl
						.pattern_RequiredSwitch_2_3_findcontext_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(trgRouteRepair,
								srcRoute, trgRouteOperational, trgSwitchOperational, trgRouteFailed, trgPetrinet,
								trgSwitchFailed, srcSwitch, routeFailedCorr, srcSwitchPosition, routeRepairCorr,
								srcContainer, switchOperationalCorr, switchFailedCorr, routeOperationalCorr,
								containerCorr);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[16];
				//nothing EMoflonEdge srcRoute__srcSwitchPosition____follows = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge srcSwitchPosition__srcRoute____route = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge srcSwitchPosition__srcSwitch____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge srcSwitch__srcSwitchPosition____positions = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge routeFailedCorr__srcRoute____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge routeRepairCorr__trgRouteRepair____target = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge routeRepairCorr__srcRoute____source = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge switchOperationalCorr__srcSwitch____source = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge routeFailedCorr__trgRouteFailed____target = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge switchOperationalCorr__trgSwitchOperational____target = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge switchFailedCorr__trgSwitchFailed____target = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge routeOperationalCorr__srcRoute____source = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge switchFailedCorr__srcSwitch____source = (EMoflonEdge) result3_green[30];
				//nothing EMoflonEdge routeOperationalCorr__trgRouteOperational____target = (EMoflonEdge) result3_green[31];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[32];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[33];

				Object[] result4_bindingAndBlack = RequiredSwitchImpl
						.pattern_RequiredSwitch_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(this, isApplicableMatch,
								trgRouteRepair, srcRoute, trgRouteOperational, trgSwitchOperational, trgRouteFailed,
								trgPetrinet, trgSwitchFailed, srcSwitch, routeFailedCorr, srcSwitchPosition,
								routeRepairCorr, srcContainer, switchOperationalCorr, switchFailedCorr,
								routeOperationalCorr, containerCorr);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[trgRouteRepair] = "
							+ trgRouteRepair + ", " + "[srcRoute] = " + srcRoute + ", " + "[trgRouteOperational] = "
							+ trgRouteOperational + ", " + "[trgSwitchOperational] = " + trgSwitchOperational + ", "
							+ "[trgRouteFailed] = " + trgRouteFailed + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
							+ "[trgSwitchFailed] = " + trgSwitchFailed + ", " + "[srcSwitch] = " + srcSwitch + ", "
							+ "[routeFailedCorr] = " + routeFailedCorr + ", " + "[srcSwitchPosition] = "
							+ srcSwitchPosition + ", " + "[routeRepairCorr] = " + routeRepairCorr + ", "
							+ "[srcContainer] = " + srcContainer + ", " + "[switchOperationalCorr] = "
							+ switchOperationalCorr + ", " + "[switchFailedCorr] = " + switchFailedCorr + ", "
							+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[containerCorr] = "
							+ containerCorr + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (RequiredSwitchImpl.pattern_RequiredSwitch_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = RequiredSwitchImpl
							.pattern_RequiredSwitch_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					RequiredSwitchImpl.pattern_RequiredSwitch_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return RequiredSwitchImpl.pattern_RequiredSwitch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Route srcRoute, Switch srcSwitch,
			SwitchPosition srcSwitchPosition, RailwayContainer srcContainer) {
		match.registerObject("srcRoute", srcRoute);
		match.registerObject("srcSwitch", srcSwitch);
		match.registerObject("srcSwitchPosition", srcSwitchPosition);
		match.registerObject("srcContainer", srcContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Route srcRoute, Switch srcSwitch,
			SwitchPosition srcSwitchPosition, RailwayContainer srcContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Transition trgRouteRepair, Route srcRoute,
			Place trgRouteOperational, Place trgSwitchOperational, Place trgRouteFailed, PetriNet trgPetrinet,
			Place trgSwitchFailed, Switch srcSwitch, RouteToFailed routeFailedCorr, SwitchPosition srcSwitchPosition,
			RouteToRepair routeRepairCorr, RailwayContainer srcContainer, SwitchToOperational switchOperationalCorr,
			SwitchToFailed switchFailedCorr, RouteToOperational routeOperationalCorr,
			RailwayContainerToPetriNet containerCorr) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("trgRouteRepair", trgRouteRepair);
		isApplicableMatch.registerObject("srcRoute", srcRoute);
		isApplicableMatch.registerObject("trgRouteOperational", trgRouteOperational);
		isApplicableMatch.registerObject("trgSwitchOperational", trgSwitchOperational);
		isApplicableMatch.registerObject("trgRouteFailed", trgRouteFailed);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("trgSwitchFailed", trgSwitchFailed);
		isApplicableMatch.registerObject("srcSwitch", srcSwitch);
		isApplicableMatch.registerObject("routeFailedCorr", routeFailedCorr);
		isApplicableMatch.registerObject("srcSwitchPosition", srcSwitchPosition);
		isApplicableMatch.registerObject("routeRepairCorr", routeRepairCorr);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("switchOperationalCorr", switchOperationalCorr);
		isApplicableMatch.registerObject("switchFailedCorr", switchFailedCorr);
		isApplicableMatch.registerObject("routeOperationalCorr", routeOperationalCorr);
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgRouteRepair,
			EObject trgSwitchOperationalToRouteRepair, EObject srcRoute, EObject trgRouteOperational,
			EObject trgSwitchOperational, EObject trgRouteFailed, EObject trgRouteFail, EObject trgPetrinet,
			EObject trgSwitchFailed, EObject srcSwitch, EObject routeFailedCorr, EObject srcSwitchPosition,
			EObject trgRouteRepairToSwitchOperational, EObject routeRepairCorr, EObject trgRouteFailToSwitchFailed,
			EObject srcContainer, EObject trgRouteFailToRouteFailed, EObject switchOperationalCorr,
			EObject trgRouteOperationalToRouteFail, EObject switchFailedCorr, EObject routeOperationalCorr,
			EObject trgSwitchFailedToRouteFail, EObject containerCorr) {
		ruleresult.registerObject("trgRouteRepair", trgRouteRepair);
		ruleresult.registerObject("trgSwitchOperationalToRouteRepair", trgSwitchOperationalToRouteRepair);
		ruleresult.registerObject("srcRoute", srcRoute);
		ruleresult.registerObject("trgRouteOperational", trgRouteOperational);
		ruleresult.registerObject("trgSwitchOperational", trgSwitchOperational);
		ruleresult.registerObject("trgRouteFailed", trgRouteFailed);
		ruleresult.registerObject("trgRouteFail", trgRouteFail);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("trgSwitchFailed", trgSwitchFailed);
		ruleresult.registerObject("srcSwitch", srcSwitch);
		ruleresult.registerObject("routeFailedCorr", routeFailedCorr);
		ruleresult.registerObject("srcSwitchPosition", srcSwitchPosition);
		ruleresult.registerObject("trgRouteRepairToSwitchOperational", trgRouteRepairToSwitchOperational);
		ruleresult.registerObject("routeRepairCorr", routeRepairCorr);
		ruleresult.registerObject("trgRouteFailToSwitchFailed", trgRouteFailToSwitchFailed);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgRouteFailToRouteFailed", trgRouteFailToRouteFailed);
		ruleresult.registerObject("switchOperationalCorr", switchOperationalCorr);
		ruleresult.registerObject("trgRouteOperationalToRouteFail", trgRouteOperationalToRouteFail);
		ruleresult.registerObject("switchFailedCorr", switchFailedCorr);
		ruleresult.registerObject("routeOperationalCorr", routeOperationalCorr);
		ruleresult.registerObject("trgSwitchFailedToRouteFail", trgSwitchFailedToRouteFail);
		ruleresult.registerObject("containerCorr", containerCorr);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_follows) {

		Object[] result1_bindingAndBlack = RequiredSwitchImpl
				.pattern_RequiredSwitch_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = RequiredSwitchImpl.pattern_RequiredSwitch_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : RequiredSwitchImpl
				.pattern_RequiredSwitch_10_2_testcorematchandDECs_blackFFFFB(_edge_follows)) {
			Route srcRoute = (Route) result2_black[0];
			Switch srcSwitch = (Switch) result2_black[1];
			SwitchPosition srcSwitchPosition = (SwitchPosition) result2_black[2];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[3];
			Object[] result2_green = RequiredSwitchImpl
					.pattern_RequiredSwitch_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RequiredSwitchImpl
					.pattern_RequiredSwitch_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer)) {
				// 
				if (RequiredSwitchImpl
						.pattern_RequiredSwitch_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = RequiredSwitchImpl
							.pattern_RequiredSwitch_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					RequiredSwitchImpl.pattern_RequiredSwitch_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return RequiredSwitchImpl.pattern_RequiredSwitch_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("RequiredSwitch");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("trgSwitchOperationalToRouteRepair", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteRepairToSwitchOperational", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToSwitchFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToRouteFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteOperationalToRouteFail", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSwitchFailedToRouteFail", "kind", ArcKind.INPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer) {// 
		Object[] result1_black = RequiredSwitchImpl.pattern_RequiredSwitch_13_1_matchtggpattern_blackBBBB(srcRoute,
				srcSwitch, srcSwitchPosition, srcContainer);
		if (result1_black != null) {
			return RequiredSwitchImpl.pattern_RequiredSwitch_13_2_expressionF();
		} else {
			return RequiredSwitchImpl.pattern_RequiredSwitch_13_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_FWD__MATCH_ROUTE_SWITCH_SWITCHPOSITION_RAILWAYCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (Route) arguments.get(1), (Switch) arguments.get(2),
					(SwitchPosition) arguments.get(3), (RailwayContainer) arguments.get(4));
		case RulesPackage.REQUIRED_SWITCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ROUTE_SWITCH_SWITCHPOSITION_RAILWAYCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Route) arguments.get(1), (Switch) arguments.get(2),
					(SwitchPosition) arguments.get(3), (RailwayContainer) arguments.get(4));
			return null;
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ROUTE_SWITCH_SWITCHPOSITION_RAILWAYCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Route) arguments.get(1),
					(Switch) arguments.get(2), (SwitchPosition) arguments.get(3), (RailwayContainer) arguments.get(4));
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TRANSITION_ROUTE_PLACE_PLACE_PLACE_PETRINET_PLACE_SWITCH_ROUTETOFAILED_SWITCHPOSITION_ROUTETOREPAIR_RAILWAYCONTAINER_SWITCHTOOPERATIONAL_SWITCHTOFAILED_ROUTETOOPERATIONAL_RAILWAYCONTAINERTOPETRINET:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Transition) arguments.get(1),
					(Route) arguments.get(2), (Place) arguments.get(3), (Place) arguments.get(4),
					(Place) arguments.get(5), (PetriNet) arguments.get(6), (Place) arguments.get(7),
					(Switch) arguments.get(8), (RouteToFailed) arguments.get(9), (SwitchPosition) arguments.get(10),
					(RouteToRepair) arguments.get(11), (RailwayContainer) arguments.get(12),
					(SwitchToOperational) arguments.get(13), (SwitchToFailed) arguments.get(14),
					(RouteToOperational) arguments.get(15), (RailwayContainerToPetriNet) arguments.get(16));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18), (EObject) arguments.get(19),
					(EObject) arguments.get(20), (EObject) arguments.get(21), (EObject) arguments.get(22),
					(EObject) arguments.get(23));
			return null;
		case RulesPackage.REQUIRED_SWITCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQUIRED_SWITCH___CHECK_DEC_FWD__ROUTE_SWITCH_SWITCHPOSITION_RAILWAYCONTAINER:
			return checkDEC_FWD((Route) arguments.get(0), (Switch) arguments.get(1), (SwitchPosition) arguments.get(2),
					(RailwayContainer) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RequiredSwitch_0_1_initialbindings_blackBBBBBB(RequiredSwitch _this,
			Match match, Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer) {
		return new Object[] { _this, match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer };
	}

	public static final Object[] pattern_RequiredSwitch_0_2_SolveCSP_bindingFBBBBBB(RequiredSwitch _this, Match match,
			Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcRoute, srcSwitch, srcSwitchPosition,
				srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSwitch_0_2_SolveCSP_bindingAndBlackFBBBBBB(RequiredSwitch _this,
			Match match, Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer) {
		Object[] result_pattern_RequiredSwitch_0_2_SolveCSP_binding = pattern_RequiredSwitch_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer);
		if (result_pattern_RequiredSwitch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSwitch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_RequiredSwitch_0_2_SolveCSP_black = pattern_RequiredSwitch_0_2_SolveCSP_blackB(csp);
			if (result_pattern_RequiredSwitch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredSwitch_0_3_CheckCSP_expressionFBB(RequiredSwitch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer) {
		return new Object[] { match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer };
	}

	public static final Object[] pattern_RequiredSwitch_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			Route srcRoute, SwitchPosition srcSwitchPosition) {
		EMoflonEdge srcRoute__srcSwitchPosition____follows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcRoute____route = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcRoute__srcSwitchPosition____follows_name_prime = "follows";
		String srcSwitchPosition__srcRoute____route_name_prime = "route";
		srcRoute__srcSwitchPosition____follows.setSrc(srcRoute);
		srcRoute__srcSwitchPosition____follows.setTrg(srcSwitchPosition);
		match.getToBeTranslatedEdges().add(srcRoute__srcSwitchPosition____follows);
		srcSwitchPosition__srcRoute____route.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcRoute____route.setTrg(srcRoute);
		match.getToBeTranslatedEdges().add(srcSwitchPosition__srcRoute____route);
		srcRoute__srcSwitchPosition____follows.setName(srcRoute__srcSwitchPosition____follows_name_prime);
		srcSwitchPosition__srcRoute____route.setName(srcSwitchPosition__srcRoute____route_name_prime);
		return new Object[] { match, srcRoute, srcSwitchPosition, srcRoute__srcSwitchPosition____follows,
				srcSwitchPosition__srcRoute____route };
	}

	public static final Object[] pattern_RequiredSwitch_0_5_collectcontextelements_blackBBBBB(Match match,
			Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer) {
		return new Object[] { match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer };
	}

	public static final Object[] pattern_RequiredSwitch_0_5_collectcontextelements_greenBBBBBFFF(Match match,
			Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer) {
		EMoflonEdge srcSwitchPosition__srcSwitch____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitch__srcSwitchPosition____positions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcRoute);
		match.getContextNodes().add(srcSwitch);
		match.getContextNodes().add(srcSwitchPosition);
		match.getContextNodes().add(srcContainer);
		String srcSwitchPosition__srcSwitch____target_name_prime = "target";
		String srcSwitch__srcSwitchPosition____positions_name_prime = "positions";
		String srcContainer__srcRoute____routes_name_prime = "routes";
		srcSwitchPosition__srcSwitch____target.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcSwitch____target.setTrg(srcSwitch);
		match.getContextEdges().add(srcSwitchPosition__srcSwitch____target);
		srcSwitch__srcSwitchPosition____positions.setSrc(srcSwitch);
		srcSwitch__srcSwitchPosition____positions.setTrg(srcSwitchPosition);
		match.getContextEdges().add(srcSwitch__srcSwitchPosition____positions);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		match.getContextEdges().add(srcContainer__srcRoute____routes);
		srcSwitchPosition__srcSwitch____target.setName(srcSwitchPosition__srcSwitch____target_name_prime);
		srcSwitch__srcSwitchPosition____positions.setName(srcSwitch__srcSwitchPosition____positions_name_prime);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer,
				srcSwitchPosition__srcSwitch____target, srcSwitch__srcSwitchPosition____positions,
				srcContainer__srcRoute____routes };
	}

	public static final void pattern_RequiredSwitch_0_6_registerobjectstomatch_expressionBBBBBB(RequiredSwitch _this,
			Match match, Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer) {
		_this.registerObjectsToMatch_FWD(match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer);

	}

	public static final boolean pattern_RequiredSwitch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredSwitch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_1_1_performtransformation_bindingFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("trgRouteRepair");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcRoute");
		EObject _localVariable_2 = isApplicableMatch.getObject("trgRouteOperational");
		EObject _localVariable_3 = isApplicableMatch.getObject("trgSwitchOperational");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgRouteFailed");
		EObject _localVariable_5 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_6 = isApplicableMatch.getObject("trgSwitchFailed");
		EObject _localVariable_7 = isApplicableMatch.getObject("srcSwitch");
		EObject _localVariable_8 = isApplicableMatch.getObject("routeFailedCorr");
		EObject _localVariable_9 = isApplicableMatch.getObject("srcSwitchPosition");
		EObject _localVariable_10 = isApplicableMatch.getObject("routeRepairCorr");
		EObject _localVariable_11 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_12 = isApplicableMatch.getObject("switchOperationalCorr");
		EObject _localVariable_13 = isApplicableMatch.getObject("switchFailedCorr");
		EObject _localVariable_14 = isApplicableMatch.getObject("routeOperationalCorr");
		EObject _localVariable_15 = isApplicableMatch.getObject("containerCorr");
		EObject tmpTrgRouteRepair = _localVariable_0;
		EObject tmpSrcRoute = _localVariable_1;
		EObject tmpTrgRouteOperational = _localVariable_2;
		EObject tmpTrgSwitchOperational = _localVariable_3;
		EObject tmpTrgRouteFailed = _localVariable_4;
		EObject tmpTrgPetrinet = _localVariable_5;
		EObject tmpTrgSwitchFailed = _localVariable_6;
		EObject tmpSrcSwitch = _localVariable_7;
		EObject tmpRouteFailedCorr = _localVariable_8;
		EObject tmpSrcSwitchPosition = _localVariable_9;
		EObject tmpRouteRepairCorr = _localVariable_10;
		EObject tmpSrcContainer = _localVariable_11;
		EObject tmpSwitchOperationalCorr = _localVariable_12;
		EObject tmpSwitchFailedCorr = _localVariable_13;
		EObject tmpRouteOperationalCorr = _localVariable_14;
		EObject tmpContainerCorr = _localVariable_15;
		if (tmpTrgRouteRepair instanceof Transition) {
			Transition trgRouteRepair = (Transition) tmpTrgRouteRepair;
			if (tmpSrcRoute instanceof Route) {
				Route srcRoute = (Route) tmpSrcRoute;
				if (tmpTrgRouteOperational instanceof Place) {
					Place trgRouteOperational = (Place) tmpTrgRouteOperational;
					if (tmpTrgSwitchOperational instanceof Place) {
						Place trgSwitchOperational = (Place) tmpTrgSwitchOperational;
						if (tmpTrgRouteFailed instanceof Place) {
							Place trgRouteFailed = (Place) tmpTrgRouteFailed;
							if (tmpTrgPetrinet instanceof PetriNet) {
								PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
								if (tmpTrgSwitchFailed instanceof Place) {
									Place trgSwitchFailed = (Place) tmpTrgSwitchFailed;
									if (tmpSrcSwitch instanceof Switch) {
										Switch srcSwitch = (Switch) tmpSrcSwitch;
										if (tmpRouteFailedCorr instanceof RouteToFailed) {
											RouteToFailed routeFailedCorr = (RouteToFailed) tmpRouteFailedCorr;
											if (tmpSrcSwitchPosition instanceof SwitchPosition) {
												SwitchPosition srcSwitchPosition = (SwitchPosition) tmpSrcSwitchPosition;
												if (tmpRouteRepairCorr instanceof RouteToRepair) {
													RouteToRepair routeRepairCorr = (RouteToRepair) tmpRouteRepairCorr;
													if (tmpSrcContainer instanceof RailwayContainer) {
														RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
														if (tmpSwitchOperationalCorr instanceof SwitchToOperational) {
															SwitchToOperational switchOperationalCorr = (SwitchToOperational) tmpSwitchOperationalCorr;
															if (tmpSwitchFailedCorr instanceof SwitchToFailed) {
																SwitchToFailed switchFailedCorr = (SwitchToFailed) tmpSwitchFailedCorr;
																if (tmpRouteOperationalCorr instanceof RouteToOperational) {
																	RouteToOperational routeOperationalCorr = (RouteToOperational) tmpRouteOperationalCorr;
																	if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
																		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
																		return new Object[] { trgRouteRepair, srcRoute,
																				trgRouteOperational,
																				trgSwitchOperational, trgRouteFailed,
																				trgPetrinet, trgSwitchFailed, srcSwitch,
																				routeFailedCorr, srcSwitchPosition,
																				routeRepairCorr, srcContainer,
																				switchOperationalCorr, switchFailedCorr,
																				routeOperationalCorr, containerCorr,
																				isApplicableMatch };
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_1_performtransformation_blackBBBBBBBBBBBBBBBBFBB(
			Transition trgRouteRepair, Route srcRoute, Place trgRouteOperational, Place trgSwitchOperational,
			Place trgRouteFailed, PetriNet trgPetrinet, Place trgSwitchFailed, Switch srcSwitch,
			RouteToFailed routeFailedCorr, SwitchPosition srcSwitchPosition, RouteToRepair routeRepairCorr,
			RailwayContainer srcContainer, SwitchToOperational switchOperationalCorr, SwitchToFailed switchFailedCorr,
			RouteToOperational routeOperationalCorr, RailwayContainerToPetriNet containerCorr, RequiredSwitch _this,
			IsApplicableMatch isApplicableMatch) {
		if (!trgRouteOperational.equals(trgSwitchOperational)) {
			if (!trgRouteOperational.equals(trgSwitchFailed)) {
				if (!trgRouteFailed.equals(trgRouteOperational)) {
					if (!trgRouteFailed.equals(trgSwitchOperational)) {
						if (!trgRouteFailed.equals(trgSwitchFailed)) {
							if (!trgSwitchFailed.equals(trgSwitchOperational)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { trgRouteRepair, srcRoute, trgRouteOperational,
												trgSwitchOperational, trgRouteFailed, trgPetrinet, trgSwitchFailed,
												srcSwitch, routeFailedCorr, srcSwitchPosition, routeRepairCorr,
												srcContainer, switchOperationalCorr, switchFailedCorr,
												routeOperationalCorr, containerCorr, csp, _this, isApplicableMatch };
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
			RequiredSwitch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_RequiredSwitch_1_1_performtransformation_binding = pattern_RequiredSwitch_1_1_performtransformation_bindingFFFFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_RequiredSwitch_1_1_performtransformation_binding != null) {
			Transition trgRouteRepair = (Transition) result_pattern_RequiredSwitch_1_1_performtransformation_binding[0];
			Route srcRoute = (Route) result_pattern_RequiredSwitch_1_1_performtransformation_binding[1];
			Place trgRouteOperational = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[2];
			Place trgSwitchOperational = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[3];
			Place trgRouteFailed = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[4];
			PetriNet trgPetrinet = (PetriNet) result_pattern_RequiredSwitch_1_1_performtransformation_binding[5];
			Place trgSwitchFailed = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[6];
			Switch srcSwitch = (Switch) result_pattern_RequiredSwitch_1_1_performtransformation_binding[7];
			RouteToFailed routeFailedCorr = (RouteToFailed) result_pattern_RequiredSwitch_1_1_performtransformation_binding[8];
			SwitchPosition srcSwitchPosition = (SwitchPosition) result_pattern_RequiredSwitch_1_1_performtransformation_binding[9];
			RouteToRepair routeRepairCorr = (RouteToRepair) result_pattern_RequiredSwitch_1_1_performtransformation_binding[10];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_RequiredSwitch_1_1_performtransformation_binding[11];
			SwitchToOperational switchOperationalCorr = (SwitchToOperational) result_pattern_RequiredSwitch_1_1_performtransformation_binding[12];
			SwitchToFailed switchFailedCorr = (SwitchToFailed) result_pattern_RequiredSwitch_1_1_performtransformation_binding[13];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result_pattern_RequiredSwitch_1_1_performtransformation_binding[14];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_RequiredSwitch_1_1_performtransformation_binding[15];

			Object[] result_pattern_RequiredSwitch_1_1_performtransformation_black = pattern_RequiredSwitch_1_1_performtransformation_blackBBBBBBBBBBBBBBBBFBB(
					trgRouteRepair, srcRoute, trgRouteOperational, trgSwitchOperational, trgRouteFailed, trgPetrinet,
					trgSwitchFailed, srcSwitch, routeFailedCorr, srcSwitchPosition, routeRepairCorr, srcContainer,
					switchOperationalCorr, switchFailedCorr, routeOperationalCorr, containerCorr, _this,
					isApplicableMatch);
			if (result_pattern_RequiredSwitch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_RequiredSwitch_1_1_performtransformation_black[16];

				return new Object[] { trgRouteRepair, srcRoute, trgRouteOperational, trgSwitchOperational,
						trgRouteFailed, trgPetrinet, trgSwitchFailed, srcSwitch, routeFailedCorr, srcSwitchPosition,
						routeRepairCorr, srcContainer, switchOperationalCorr, switchFailedCorr, routeOperationalCorr,
						containerCorr, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_1_performtransformation_greenBFBBBFBBFFFFF(
			Transition trgRouteRepair, Place trgRouteOperational, Place trgSwitchOperational, Place trgRouteFailed,
			PetriNet trgPetrinet, Place trgSwitchFailed) {
		Arc trgSwitchOperationalToRouteRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		ImmediateTransition trgRouteFail = StochasticPetriNetFactory.eINSTANCE.createImmediateTransition();
		Arc trgRouteRepairToSwitchOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToSwitchFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToRouteFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteOperationalToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSwitchFailedToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		ArcKind trgSwitchOperationalToRouteRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteRepairToSwitchOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteFailToSwitchFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteFailToRouteFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteOperationalToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgSwitchFailedToRouteFail_kind_prime = ArcKind.INPUT;
		trgSwitchOperationalToRouteRepair.setPlace(trgSwitchOperational);
		trgSwitchOperationalToRouteRepair.setTransition(trgRouteRepair);
		trgRouteFail.setPetriNet(trgPetrinet);
		trgRouteRepairToSwitchOperational.setPlace(trgSwitchOperational);
		trgRouteRepairToSwitchOperational.setTransition(trgRouteRepair);
		trgRouteFailToSwitchFailed.setTransition(trgRouteFail);
		trgRouteFailToSwitchFailed.setPlace(trgSwitchFailed);
		trgRouteFailToRouteFailed.setPlace(trgRouteFailed);
		trgRouteFailToRouteFailed.setTransition(trgRouteFail);
		trgRouteOperationalToRouteFail.setPlace(trgRouteOperational);
		trgRouteOperationalToRouteFail.setTransition(trgRouteFail);
		trgSwitchFailedToRouteFail.setTransition(trgRouteFail);
		trgSwitchFailedToRouteFail.setPlace(trgSwitchFailed);
		trgSwitchOperationalToRouteRepair.setKind(trgSwitchOperationalToRouteRepair_kind_prime);
		trgRouteRepairToSwitchOperational.setKind(trgRouteRepairToSwitchOperational_kind_prime);
		trgRouteFailToSwitchFailed.setKind(trgRouteFailToSwitchFailed_kind_prime);
		trgRouteFailToRouteFailed.setKind(trgRouteFailToRouteFailed_kind_prime);
		trgRouteOperationalToRouteFail.setKind(trgRouteOperationalToRouteFail_kind_prime);
		trgSwitchFailedToRouteFail.setKind(trgSwitchFailedToRouteFail_kind_prime);
		return new Object[] { trgRouteRepair, trgSwitchOperationalToRouteRepair, trgRouteOperational,
				trgSwitchOperational, trgRouteFailed, trgRouteFail, trgPetrinet, trgSwitchFailed,
				trgRouteRepairToSwitchOperational, trgRouteFailToSwitchFailed, trgRouteFailToRouteFailed,
				trgRouteOperationalToRouteFail, trgSwitchFailedToRouteFail };
	}

	public static final Object[] pattern_RequiredSwitch_1_2_collecttranslatedelements_blackBBBBBBB(
			Arc trgSwitchOperationalToRouteRepair, ImmediateTransition trgRouteFail,
			Arc trgRouteRepairToSwitchOperational, Arc trgRouteFailToSwitchFailed, Arc trgRouteFailToRouteFailed,
			Arc trgRouteOperationalToRouteFail, Arc trgSwitchFailedToRouteFail) {
		if (!trgRouteRepairToSwitchOperational.equals(trgSwitchOperationalToRouteRepair)) {
			if (!trgRouteRepairToSwitchOperational.equals(trgSwitchFailedToRouteFail)) {
				if (!trgRouteFailToSwitchFailed.equals(trgSwitchOperationalToRouteRepair)) {
					if (!trgRouteFailToSwitchFailed.equals(trgRouteRepairToSwitchOperational)) {
						if (!trgRouteFailToSwitchFailed.equals(trgRouteOperationalToRouteFail)) {
							if (!trgRouteFailToSwitchFailed.equals(trgSwitchFailedToRouteFail)) {
								if (!trgRouteFailToRouteFailed.equals(trgSwitchOperationalToRouteRepair)) {
									if (!trgRouteFailToRouteFailed.equals(trgRouteRepairToSwitchOperational)) {
										if (!trgRouteFailToRouteFailed.equals(trgRouteFailToSwitchFailed)) {
											if (!trgRouteFailToRouteFailed.equals(trgRouteOperationalToRouteFail)) {
												if (!trgRouteFailToRouteFailed.equals(trgSwitchFailedToRouteFail)) {
													if (!trgRouteOperationalToRouteFail
															.equals(trgSwitchOperationalToRouteRepair)) {
														if (!trgRouteOperationalToRouteFail
																.equals(trgRouteRepairToSwitchOperational)) {
															if (!trgRouteOperationalToRouteFail
																	.equals(trgSwitchFailedToRouteFail)) {
																if (!trgSwitchFailedToRouteFail
																		.equals(trgSwitchOperationalToRouteRepair)) {
																	return new Object[] {
																			trgSwitchOperationalToRouteRepair,
																			trgRouteFail,
																			trgRouteRepairToSwitchOperational,
																			trgRouteFailToSwitchFailed,
																			trgRouteFailToRouteFailed,
																			trgRouteOperationalToRouteFail,
																			trgSwitchFailedToRouteFail };
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_2_collecttranslatedelements_greenFBBBBBBB(
			Arc trgSwitchOperationalToRouteRepair, ImmediateTransition trgRouteFail,
			Arc trgRouteRepairToSwitchOperational, Arc trgRouteFailToSwitchFailed, Arc trgRouteFailToRouteFailed,
			Arc trgRouteOperationalToRouteFail, Arc trgSwitchFailedToRouteFail) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgSwitchOperationalToRouteRepair);
		ruleresult.getCreatedElements().add(trgRouteFail);
		ruleresult.getCreatedElements().add(trgRouteRepairToSwitchOperational);
		ruleresult.getCreatedElements().add(trgRouteFailToSwitchFailed);
		ruleresult.getCreatedElements().add(trgRouteFailToRouteFailed);
		ruleresult.getCreatedElements().add(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedElements().add(trgSwitchFailedToRouteFail);
		return new Object[] { ruleresult, trgSwitchOperationalToRouteRepair, trgRouteFail,
				trgRouteRepairToSwitchOperational, trgRouteFailToSwitchFailed, trgRouteFailToRouteFailed,
				trgRouteOperationalToRouteFail, trgSwitchFailedToRouteFail };
	}

	public static final Object[] pattern_RequiredSwitch_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject trgRouteRepair, EObject trgSwitchOperationalToRouteRepair,
			EObject srcRoute, EObject trgRouteOperational, EObject trgSwitchOperational, EObject trgRouteFailed,
			EObject trgRouteFail, EObject trgPetrinet, EObject trgSwitchFailed, EObject srcSwitch,
			EObject routeFailedCorr, EObject srcSwitchPosition, EObject trgRouteRepairToSwitchOperational,
			EObject routeRepairCorr, EObject trgRouteFailToSwitchFailed, EObject srcContainer,
			EObject trgRouteFailToRouteFailed, EObject switchOperationalCorr, EObject trgRouteOperationalToRouteFail,
			EObject switchFailedCorr, EObject routeOperationalCorr, EObject trgSwitchFailedToRouteFail,
			EObject containerCorr) {
		if (!trgRouteRepair.equals(trgSwitchOperationalToRouteRepair)) {
			if (!trgRouteRepair.equals(trgSwitchOperational)) {
				if (!trgRouteRepair.equals(trgSwitchFailed)) {
					if (!trgRouteRepair.equals(trgRouteRepairToSwitchOperational)) {
						if (!trgRouteRepair.equals(trgSwitchFailedToRouteFail)) {
							if (!srcRoute.equals(trgRouteRepair)) {
								if (!srcRoute.equals(trgSwitchOperationalToRouteRepair)) {
									if (!srcRoute.equals(trgRouteOperational)) {
										if (!srcRoute.equals(trgSwitchOperational)) {
											if (!srcRoute.equals(trgRouteFailed)) {
												if (!srcRoute.equals(trgRouteFail)) {
													if (!srcRoute.equals(trgPetrinet)) {
														if (!srcRoute.equals(trgSwitchFailed)) {
															if (!srcRoute.equals(srcSwitch)) {
																if (!srcRoute.equals(srcSwitchPosition)) {
																	if (!srcRoute.equals(
																			trgRouteRepairToSwitchOperational)) {
																		if (!srcRoute
																				.equals(trgRouteFailToSwitchFailed)) {
																			if (!srcRoute.equals(
																					trgRouteFailToRouteFailed)) {
																				if (!srcRoute.equals(
																						switchOperationalCorr)) {
																					if (!srcRoute.equals(
																							trgRouteOperationalToRouteFail)) {
																						if (!srcRoute.equals(
																								switchFailedCorr)) {
																							if (!srcRoute.equals(
																									trgSwitchFailedToRouteFail)) {
																								if (!trgRouteOperational
																										.equals(trgRouteRepair)) {
																									if (!trgRouteOperational
																											.equals(trgSwitchOperationalToRouteRepair)) {
																										if (!trgRouteOperational
																												.equals(trgSwitchOperational)) {
																											if (!trgRouteOperational
																													.equals(trgSwitchFailed)) {
																												if (!trgRouteOperational
																														.equals(trgRouteRepairToSwitchOperational)) {
																													if (!trgRouteOperational
																															.equals(trgRouteOperationalToRouteFail)) {
																														if (!trgRouteOperational
																																.equals(trgSwitchFailedToRouteFail)) {
																															if (!trgSwitchOperational
																																	.equals(trgSwitchOperationalToRouteRepair)) {
																																if (!trgRouteFailed
																																		.equals(trgRouteRepair)) {
																																	if (!trgRouteFailed
																																			.equals(trgSwitchOperationalToRouteRepair)) {
																																		if (!trgRouteFailed
																																				.equals(trgRouteOperational)) {
																																			if (!trgRouteFailed
																																					.equals(trgSwitchOperational)) {
																																				if (!trgRouteFailed
																																						.equals(trgSwitchFailed)) {
																																					if (!trgRouteFailed
																																							.equals(trgRouteRepairToSwitchOperational)) {
																																						if (!trgRouteFailed
																																								.equals(trgRouteOperationalToRouteFail)) {
																																							if (!trgRouteFailed
																																									.equals(trgSwitchFailedToRouteFail)) {
																																								if (!trgRouteFail
																																										.equals(trgRouteRepair)) {
																																									if (!trgRouteFail
																																											.equals(trgSwitchOperationalToRouteRepair)) {
																																										if (!trgRouteFail
																																												.equals(trgRouteOperational)) {
																																											if (!trgRouteFail
																																													.equals(trgSwitchOperational)) {
																																												if (!trgRouteFail
																																														.equals(trgRouteFailed)) {
																																													if (!trgRouteFail
																																															.equals(trgSwitchFailed)) {
																																														if (!trgRouteFail
																																																.equals(trgRouteRepairToSwitchOperational)) {
																																															if (!trgRouteFail
																																																	.equals(trgRouteFailToSwitchFailed)) {
																																																if (!trgRouteFail
																																																		.equals(trgRouteFailToRouteFailed)) {
																																																	if (!trgRouteFail
																																																			.equals(trgRouteOperationalToRouteFail)) {
																																																		if (!trgRouteFail
																																																				.equals(trgSwitchFailedToRouteFail)) {
																																																			if (!trgPetrinet
																																																					.equals(trgRouteRepair)) {
																																																				if (!trgPetrinet
																																																						.equals(trgSwitchOperationalToRouteRepair)) {
																																																					if (!trgPetrinet
																																																							.equals(trgRouteOperational)) {
																																																						if (!trgPetrinet
																																																								.equals(trgSwitchOperational)) {
																																																							if (!trgPetrinet
																																																									.equals(trgRouteFailed)) {
																																																								if (!trgPetrinet
																																																										.equals(trgRouteFail)) {
																																																									if (!trgPetrinet
																																																											.equals(trgSwitchFailed)) {
																																																										if (!trgPetrinet
																																																												.equals(trgRouteRepairToSwitchOperational)) {
																																																											if (!trgPetrinet
																																																													.equals(trgRouteFailToSwitchFailed)) {
																																																												if (!trgPetrinet
																																																														.equals(trgRouteFailToRouteFailed)) {
																																																													if (!trgPetrinet
																																																															.equals(trgRouteOperationalToRouteFail)) {
																																																														if (!trgPetrinet
																																																																.equals(trgSwitchFailedToRouteFail)) {
																																																															if (!trgSwitchFailed
																																																																	.equals(trgSwitchOperationalToRouteRepair)) {
																																																																if (!trgSwitchFailed
																																																																		.equals(trgSwitchOperational)) {
																																																																	if (!trgSwitchFailed
																																																																			.equals(trgSwitchFailedToRouteFail)) {
																																																																		if (!srcSwitch
																																																																				.equals(trgRouteRepair)) {
																																																																			if (!srcSwitch
																																																																					.equals(trgSwitchOperationalToRouteRepair)) {
																																																																				if (!srcSwitch
																																																																						.equals(trgRouteOperational)) {
																																																																					if (!srcSwitch
																																																																							.equals(trgSwitchOperational)) {
																																																																						if (!srcSwitch
																																																																								.equals(trgRouteFailed)) {
																																																																							if (!srcSwitch
																																																																									.equals(trgRouteFail)) {
																																																																								if (!srcSwitch
																																																																										.equals(trgPetrinet)) {
																																																																									if (!srcSwitch
																																																																											.equals(trgSwitchFailed)) {
																																																																										if (!srcSwitch
																																																																												.equals(srcSwitchPosition)) {
																																																																											if (!srcSwitch
																																																																													.equals(trgRouteRepairToSwitchOperational)) {
																																																																												if (!srcSwitch
																																																																														.equals(trgRouteFailToSwitchFailed)) {
																																																																													if (!srcSwitch
																																																																															.equals(trgRouteFailToRouteFailed)) {
																																																																														if (!srcSwitch
																																																																																.equals(switchOperationalCorr)) {
																																																																															if (!srcSwitch
																																																																																	.equals(trgRouteOperationalToRouteFail)) {
																																																																																if (!srcSwitch
																																																																																		.equals(switchFailedCorr)) {
																																																																																	if (!srcSwitch
																																																																																			.equals(trgSwitchFailedToRouteFail)) {
																																																																																		if (!routeFailedCorr
																																																																																				.equals(trgRouteRepair)) {
																																																																																			if (!routeFailedCorr
																																																																																					.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																				if (!routeFailedCorr
																																																																																						.equals(srcRoute)) {
																																																																																					if (!routeFailedCorr
																																																																																							.equals(trgRouteOperational)) {
																																																																																						if (!routeFailedCorr
																																																																																								.equals(trgSwitchOperational)) {
																																																																																							if (!routeFailedCorr
																																																																																									.equals(trgRouteFailed)) {
																																																																																								if (!routeFailedCorr
																																																																																										.equals(trgRouteFail)) {
																																																																																									if (!routeFailedCorr
																																																																																											.equals(trgPetrinet)) {
																																																																																										if (!routeFailedCorr
																																																																																												.equals(trgSwitchFailed)) {
																																																																																											if (!routeFailedCorr
																																																																																													.equals(srcSwitch)) {
																																																																																												if (!routeFailedCorr
																																																																																														.equals(srcSwitchPosition)) {
																																																																																													if (!routeFailedCorr
																																																																																															.equals(trgRouteRepairToSwitchOperational)) {
																																																																																														if (!routeFailedCorr
																																																																																																.equals(routeRepairCorr)) {
																																																																																															if (!routeFailedCorr
																																																																																																	.equals(trgRouteFailToSwitchFailed)) {
																																																																																																if (!routeFailedCorr
																																																																																																		.equals(srcContainer)) {
																																																																																																	if (!routeFailedCorr
																																																																																																			.equals(trgRouteFailToRouteFailed)) {
																																																																																																		if (!routeFailedCorr
																																																																																																				.equals(switchOperationalCorr)) {
																																																																																																			if (!routeFailedCorr
																																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																																				if (!routeFailedCorr
																																																																																																						.equals(switchFailedCorr)) {
																																																																																																					if (!routeFailedCorr
																																																																																																							.equals(routeOperationalCorr)) {
																																																																																																						if (!routeFailedCorr
																																																																																																								.equals(trgSwitchFailedToRouteFail)) {
																																																																																																							if (!srcSwitchPosition
																																																																																																									.equals(trgRouteRepair)) {
																																																																																																								if (!srcSwitchPosition
																																																																																																										.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																									if (!srcSwitchPosition
																																																																																																											.equals(trgRouteOperational)) {
																																																																																																										if (!srcSwitchPosition
																																																																																																												.equals(trgSwitchOperational)) {
																																																																																																											if (!srcSwitchPosition
																																																																																																													.equals(trgRouteFailed)) {
																																																																																																												if (!srcSwitchPosition
																																																																																																														.equals(trgRouteFail)) {
																																																																																																													if (!srcSwitchPosition
																																																																																																															.equals(trgPetrinet)) {
																																																																																																														if (!srcSwitchPosition
																																																																																																																.equals(trgSwitchFailed)) {
																																																																																																															if (!srcSwitchPosition
																																																																																																																	.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																if (!srcSwitchPosition
																																																																																																																		.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																	if (!srcSwitchPosition
																																																																																																																			.equals(trgRouteFailToRouteFailed)) {
																																																																																																																		if (!srcSwitchPosition
																																																																																																																				.equals(switchOperationalCorr)) {
																																																																																																																			if (!srcSwitchPosition
																																																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																				if (!srcSwitchPosition
																																																																																																																						.equals(switchFailedCorr)) {
																																																																																																																					if (!srcSwitchPosition
																																																																																																																							.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																						if (!trgRouteRepairToSwitchOperational
																																																																																																																								.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																							if (!trgRouteRepairToSwitchOperational
																																																																																																																									.equals(trgSwitchOperational)) {
																																																																																																																								if (!trgRouteRepairToSwitchOperational
																																																																																																																										.equals(trgSwitchFailed)) {
																																																																																																																									if (!trgRouteRepairToSwitchOperational
																																																																																																																											.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																										if (!routeRepairCorr
																																																																																																																												.equals(trgRouteRepair)) {
																																																																																																																											if (!routeRepairCorr
																																																																																																																													.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																												if (!routeRepairCorr
																																																																																																																														.equals(srcRoute)) {
																																																																																																																													if (!routeRepairCorr
																																																																																																																															.equals(trgRouteOperational)) {
																																																																																																																														if (!routeRepairCorr
																																																																																																																																.equals(trgSwitchOperational)) {
																																																																																																																															if (!routeRepairCorr
																																																																																																																																	.equals(trgRouteFailed)) {
																																																																																																																																if (!routeRepairCorr
																																																																																																																																		.equals(trgRouteFail)) {
																																																																																																																																	if (!routeRepairCorr
																																																																																																																																			.equals(trgPetrinet)) {
																																																																																																																																		if (!routeRepairCorr
																																																																																																																																				.equals(trgSwitchFailed)) {
																																																																																																																																			if (!routeRepairCorr
																																																																																																																																					.equals(srcSwitch)) {
																																																																																																																																				if (!routeRepairCorr
																																																																																																																																						.equals(srcSwitchPosition)) {
																																																																																																																																					if (!routeRepairCorr
																																																																																																																																							.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																						if (!routeRepairCorr
																																																																																																																																								.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																							if (!routeRepairCorr
																																																																																																																																									.equals(srcContainer)) {
																																																																																																																																								if (!routeRepairCorr
																																																																																																																																										.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																									if (!routeRepairCorr
																																																																																																																																											.equals(switchOperationalCorr)) {
																																																																																																																																										if (!routeRepairCorr
																																																																																																																																												.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																											if (!routeRepairCorr
																																																																																																																																													.equals(switchFailedCorr)) {
																																																																																																																																												if (!routeRepairCorr
																																																																																																																																														.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																													if (!trgRouteFailToSwitchFailed
																																																																																																																																															.equals(trgRouteRepair)) {
																																																																																																																																														if (!trgRouteFailToSwitchFailed
																																																																																																																																																.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																															if (!trgRouteFailToSwitchFailed
																																																																																																																																																	.equals(trgRouteOperational)) {
																																																																																																																																																if (!trgRouteFailToSwitchFailed
																																																																																																																																																		.equals(trgSwitchOperational)) {
																																																																																																																																																	if (!trgRouteFailToSwitchFailed
																																																																																																																																																			.equals(trgRouteFailed)) {
																																																																																																																																																		if (!trgRouteFailToSwitchFailed
																																																																																																																																																				.equals(trgSwitchFailed)) {
																																																																																																																																																			if (!trgRouteFailToSwitchFailed
																																																																																																																																																					.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																				if (!trgRouteFailToSwitchFailed
																																																																																																																																																						.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																					if (!trgRouteFailToSwitchFailed
																																																																																																																																																							.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																						if (!srcContainer
																																																																																																																																																								.equals(trgRouteRepair)) {
																																																																																																																																																							if (!srcContainer
																																																																																																																																																									.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																								if (!srcContainer
																																																																																																																																																										.equals(srcRoute)) {
																																																																																																																																																									if (!srcContainer
																																																																																																																																																											.equals(trgRouteOperational)) {
																																																																																																																																																										if (!srcContainer
																																																																																																																																																												.equals(trgSwitchOperational)) {
																																																																																																																																																											if (!srcContainer
																																																																																																																																																													.equals(trgRouteFailed)) {
																																																																																																																																																												if (!srcContainer
																																																																																																																																																														.equals(trgRouteFail)) {
																																																																																																																																																													if (!srcContainer
																																																																																																																																																															.equals(trgPetrinet)) {
																																																																																																																																																														if (!srcContainer
																																																																																																																																																																.equals(trgSwitchFailed)) {
																																																																																																																																																															if (!srcContainer
																																																																																																																																																																	.equals(srcSwitch)) {
																																																																																																																																																																if (!srcContainer
																																																																																																																																																																		.equals(srcSwitchPosition)) {
																																																																																																																																																																	if (!srcContainer
																																																																																																																																																																			.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																		if (!srcContainer
																																																																																																																																																																				.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																			if (!srcContainer
																																																																																																																																																																					.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																				if (!srcContainer
																																																																																																																																																																						.equals(switchOperationalCorr)) {
																																																																																																																																																																					if (!srcContainer
																																																																																																																																																																							.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																						if (!srcContainer
																																																																																																																																																																								.equals(switchFailedCorr)) {
																																																																																																																																																																							if (!srcContainer
																																																																																																																																																																									.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																								if (!trgRouteFailToRouteFailed
																																																																																																																																																																										.equals(trgRouteRepair)) {
																																																																																																																																																																									if (!trgRouteFailToRouteFailed
																																																																																																																																																																											.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																										if (!trgRouteFailToRouteFailed
																																																																																																																																																																												.equals(trgRouteOperational)) {
																																																																																																																																																																											if (!trgRouteFailToRouteFailed
																																																																																																																																																																													.equals(trgSwitchOperational)) {
																																																																																																																																																																												if (!trgRouteFailToRouteFailed
																																																																																																																																																																														.equals(trgRouteFailed)) {
																																																																																																																																																																													if (!trgRouteFailToRouteFailed
																																																																																																																																																																															.equals(trgSwitchFailed)) {
																																																																																																																																																																														if (!trgRouteFailToRouteFailed
																																																																																																																																																																																.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																															if (!trgRouteFailToRouteFailed
																																																																																																																																																																																	.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																if (!trgRouteFailToRouteFailed
																																																																																																																																																																																		.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																	if (!trgRouteFailToRouteFailed
																																																																																																																																																																																			.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																		if (!switchOperationalCorr
																																																																																																																																																																																				.equals(trgRouteRepair)) {
																																																																																																																																																																																			if (!switchOperationalCorr
																																																																																																																																																																																					.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																				if (!switchOperationalCorr
																																																																																																																																																																																						.equals(trgRouteOperational)) {
																																																																																																																																																																																					if (!switchOperationalCorr
																																																																																																																																																																																							.equals(trgSwitchOperational)) {
																																																																																																																																																																																						if (!switchOperationalCorr
																																																																																																																																																																																								.equals(trgRouteFailed)) {
																																																																																																																																																																																							if (!switchOperationalCorr
																																																																																																																																																																																									.equals(trgRouteFail)) {
																																																																																																																																																																																								if (!switchOperationalCorr
																																																																																																																																																																																										.equals(trgPetrinet)) {
																																																																																																																																																																																									if (!switchOperationalCorr
																																																																																																																																																																																											.equals(trgSwitchFailed)) {
																																																																																																																																																																																										if (!switchOperationalCorr
																																																																																																																																																																																												.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																											if (!switchOperationalCorr
																																																																																																																																																																																													.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																												if (!switchOperationalCorr
																																																																																																																																																																																														.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																													if (!switchOperationalCorr
																																																																																																																																																																																															.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																														if (!switchOperationalCorr
																																																																																																																																																																																																.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																															if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																	.equals(trgRouteRepair)) {
																																																																																																																																																																																																if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																		.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																	if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																			.equals(trgSwitchOperational)) {
																																																																																																																																																																																																		if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																				.equals(trgSwitchFailed)) {
																																																																																																																																																																																																			if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																					.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																				if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																						.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																					if (!switchFailedCorr
																																																																																																																																																																																																							.equals(trgRouteRepair)) {
																																																																																																																																																																																																						if (!switchFailedCorr
																																																																																																																																																																																																								.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																							if (!switchFailedCorr
																																																																																																																																																																																																									.equals(trgRouteOperational)) {
																																																																																																																																																																																																								if (!switchFailedCorr
																																																																																																																																																																																																										.equals(trgSwitchOperational)) {
																																																																																																																																																																																																									if (!switchFailedCorr
																																																																																																																																																																																																											.equals(trgRouteFailed)) {
																																																																																																																																																																																																										if (!switchFailedCorr
																																																																																																																																																																																																												.equals(trgRouteFail)) {
																																																																																																																																																																																																											if (!switchFailedCorr
																																																																																																																																																																																																													.equals(trgPetrinet)) {
																																																																																																																																																																																																												if (!switchFailedCorr
																																																																																																																																																																																																														.equals(trgSwitchFailed)) {
																																																																																																																																																																																																													if (!switchFailedCorr
																																																																																																																																																																																																															.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																														if (!switchFailedCorr
																																																																																																																																																																																																																.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																															if (!switchFailedCorr
																																																																																																																																																																																																																	.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																if (!switchFailedCorr
																																																																																																																																																																																																																		.equals(switchOperationalCorr)) {
																																																																																																																																																																																																																	if (!switchFailedCorr
																																																																																																																																																																																																																			.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																		if (!switchFailedCorr
																																																																																																																																																																																																																				.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																			if (!routeOperationalCorr
																																																																																																																																																																																																																					.equals(trgRouteRepair)) {
																																																																																																																																																																																																																				if (!routeOperationalCorr
																																																																																																																																																																																																																						.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																					if (!routeOperationalCorr
																																																																																																																																																																																																																							.equals(srcRoute)) {
																																																																																																																																																																																																																						if (!routeOperationalCorr
																																																																																																																																																																																																																								.equals(trgRouteOperational)) {
																																																																																																																																																																																																																							if (!routeOperationalCorr
																																																																																																																																																																																																																									.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																								if (!routeOperationalCorr
																																																																																																																																																																																																																										.equals(trgRouteFailed)) {
																																																																																																																																																																																																																									if (!routeOperationalCorr
																																																																																																																																																																																																																											.equals(trgRouteFail)) {
																																																																																																																																																																																																																										if (!routeOperationalCorr
																																																																																																																																																																																																																												.equals(trgPetrinet)) {
																																																																																																																																																																																																																											if (!routeOperationalCorr
																																																																																																																																																																																																																													.equals(trgSwitchFailed)) {
																																																																																																																																																																																																																												if (!routeOperationalCorr
																																																																																																																																																																																																																														.equals(srcSwitch)) {
																																																																																																																																																																																																																													if (!routeOperationalCorr
																																																																																																																																																																																																																															.equals(srcSwitchPosition)) {
																																																																																																																																																																																																																														if (!routeOperationalCorr
																																																																																																																																																																																																																																.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																															if (!routeOperationalCorr
																																																																																																																																																																																																																																	.equals(routeRepairCorr)) {
																																																																																																																																																																																																																																if (!routeOperationalCorr
																																																																																																																																																																																																																																		.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																																																	if (!routeOperationalCorr
																																																																																																																																																																																																																																			.equals(srcContainer)) {
																																																																																																																																																																																																																																		if (!routeOperationalCorr
																																																																																																																																																																																																																																				.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																																			if (!routeOperationalCorr
																																																																																																																																																																																																																																					.equals(switchOperationalCorr)) {
																																																																																																																																																																																																																																				if (!routeOperationalCorr
																																																																																																																																																																																																																																						.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																					if (!routeOperationalCorr
																																																																																																																																																																																																																																							.equals(switchFailedCorr)) {
																																																																																																																																																																																																																																						if (!routeOperationalCorr
																																																																																																																																																																																																																																								.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																																							if (!trgSwitchFailedToRouteFail
																																																																																																																																																																																																																																									.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																																								if (!trgSwitchFailedToRouteFail
																																																																																																																																																																																																																																										.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																																									if (!containerCorr
																																																																																																																																																																																																																																											.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																										if (!containerCorr
																																																																																																																																																																																																																																												.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																																											if (!containerCorr
																																																																																																																																																																																																																																													.equals(srcRoute)) {
																																																																																																																																																																																																																																												if (!containerCorr
																																																																																																																																																																																																																																														.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																													if (!containerCorr
																																																																																																																																																																																																																																															.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																																														if (!containerCorr
																																																																																																																																																																																																																																																.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																															if (!containerCorr
																																																																																																																																																																																																																																																	.equals(trgRouteFail)) {
																																																																																																																																																																																																																																																if (!containerCorr
																																																																																																																																																																																																																																																		.equals(trgPetrinet)) {
																																																																																																																																																																																																																																																	if (!containerCorr
																																																																																																																																																																																																																																																			.equals(trgSwitchFailed)) {
																																																																																																																																																																																																																																																		if (!containerCorr
																																																																																																																																																																																																																																																				.equals(srcSwitch)) {
																																																																																																																																																																																																																																																			if (!containerCorr
																																																																																																																																																																																																																																																					.equals(routeFailedCorr)) {
																																																																																																																																																																																																																																																				if (!containerCorr
																																																																																																																																																																																																																																																						.equals(srcSwitchPosition)) {
																																																																																																																																																																																																																																																					if (!containerCorr
																																																																																																																																																																																																																																																							.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																																																						if (!containerCorr
																																																																																																																																																																																																																																																								.equals(routeRepairCorr)) {
																																																																																																																																																																																																																																																							if (!containerCorr
																																																																																																																																																																																																																																																									.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																																																																								if (!containerCorr
																																																																																																																																																																																																																																																										.equals(srcContainer)) {
																																																																																																																																																																																																																																																									if (!containerCorr
																																																																																																																																																																																																																																																											.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																																																										if (!containerCorr
																																																																																																																																																																																																																																																												.equals(switchOperationalCorr)) {
																																																																																																																																																																																																																																																											if (!containerCorr
																																																																																																																																																																																																																																																													.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																																												if (!containerCorr
																																																																																																																																																																																																																																																														.equals(switchFailedCorr)) {
																																																																																																																																																																																																																																																													if (!containerCorr
																																																																																																																																																																																																																																																															.equals(routeOperationalCorr)) {
																																																																																																																																																																																																																																																														if (!containerCorr
																																																																																																																																																																																																																																																																.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																																																															return new Object[] {
																																																																																																																																																																																																																																																																	ruleresult,
																																																																																																																																																																																																																																																																	trgRouteRepair,
																																																																																																																																																																																																																																																																	trgSwitchOperationalToRouteRepair,
																																																																																																																																																																																																																																																																	srcRoute,
																																																																																																																																																																																																																																																																	trgRouteOperational,
																																																																																																																																																																																																																																																																	trgSwitchOperational,
																																																																																																																																																																																																																																																																	trgRouteFailed,
																																																																																																																																																																																																																																																																	trgRouteFail,
																																																																																																																																																																																																																																																																	trgPetrinet,
																																																																																																																																																																																																																																																																	trgSwitchFailed,
																																																																																																																																																																																																																																																																	srcSwitch,
																																																																																																																																																																																																																																																																	routeFailedCorr,
																																																																																																																																																																																																																																																																	srcSwitchPosition,
																																																																																																																																																																																																																																																																	trgRouteRepairToSwitchOperational,
																																																																																																																																																																																																																																																																	routeRepairCorr,
																																																																																																																																																																																																																																																																	trgRouteFailToSwitchFailed,
																																																																																																																																																																																																																																																																	srcContainer,
																																																																																																																																																																																																																																																																	trgRouteFailToRouteFailed,
																																																																																																																																																																																																																																																																	switchOperationalCorr,
																																																																																																																																																																																																																																																																	trgRouteOperationalToRouteFail,
																																																																																																																																																																																																																																																																	switchFailedCorr,
																																																																																																																																																																																																																																																																	routeOperationalCorr,
																																																																																																																																																																																																																																																																	trgSwitchFailedToRouteFail,
																																																																																																																																																																																																																																																																	containerCorr };
																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																															}
																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																															}
																																																																																																																																																																																																																														}
																																																																																																																																																																																																																													}
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										}
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																								}
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				}
																																																																																																																																																																																																																			}
																																																																																																																																																																																																																		}
																																																																																																																																																																																																																	}
																																																																																																																																																																																																																}
																																																																																																																																																																																																															}
																																																																																																																																																																																																														}
																																																																																																																																																																																																													}
																																																																																																																																																																																																												}
																																																																																																																																																																																																											}
																																																																																																																																																																																																										}
																																																																																																																																																																																																									}
																																																																																																																																																																																																								}
																																																																																																																																																																																																							}
																																																																																																																																																																																																						}
																																																																																																																																																																																																					}
																																																																																																																																																																																																				}
																																																																																																																																																																																																			}
																																																																																																																																																																																																		}
																																																																																																																																																																																																	}
																																																																																																																																																																																																}
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject trgRouteRepair, EObject trgSwitchOperationalToRouteRepair,
			EObject srcRoute, EObject trgRouteOperational, EObject trgSwitchOperational, EObject trgRouteFailed,
			EObject trgRouteFail, EObject trgPetrinet, EObject trgSwitchFailed, EObject srcSwitchPosition,
			EObject trgRouteRepairToSwitchOperational, EObject trgRouteFailToSwitchFailed,
			EObject trgRouteFailToRouteFailed, EObject trgRouteOperationalToRouteFail,
			EObject trgSwitchFailedToRouteFail) {
		EMoflonEdge trgSwitchOperationalToRouteRepair__trgSwitchOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSwitchPosition____follows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcRoute____route = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRouteFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSwitchOperationalToRouteRepair__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSwitchFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToSwitchFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSwitchOperational__trgSwitchOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSwitchFailed__trgSwitchFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSwitchFailedToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgSwitchFailedToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSwitchFailedToRouteFail__trgSwitchFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSwitchOperational__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgRouteRepairToSwitchOperational____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "RequiredSwitch";
		String trgSwitchOperationalToRouteRepair__trgSwitchOperational____place_name_prime = "place";
		String srcRoute__srcSwitchPosition____follows_name_prime = "follows";
		String srcSwitchPosition__srcRoute____route_name_prime = "route";
		String trgRouteFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRouteFail____nodes_name_prime = "nodes";
		String trgSwitchOperationalToRouteRepair__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs_name_prime = "arcs";
		String trgRouteFailToSwitchFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToSwitchFailed____arcs_name_prime = "arcs";
		String trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime = "place";
		String trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime = "arcs";
		String trgRouteRepairToSwitchOperational__trgSwitchOperational____place_name_prime = "place";
		String trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime = "place";
		String trgRouteFailToSwitchFailed__trgSwitchFailed____place_name_prime = "place";
		String trgSwitchFailedToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgSwitchFailedToRouteFail____arcs_name_prime = "arcs";
		String trgSwitchFailedToRouteFail__trgSwitchFailed____place_name_prime = "place";
		String trgRouteRepairToSwitchOperational__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgRouteRepairToSwitchOperational____arcs_name_prime = "arcs";
		String trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime = "arcs";
		trgSwitchOperationalToRouteRepair__trgSwitchOperational____place.setSrc(trgSwitchOperationalToRouteRepair);
		trgSwitchOperationalToRouteRepair__trgSwitchOperational____place.setTrg(trgSwitchOperational);
		ruleresult.getCreatedEdges().add(trgSwitchOperationalToRouteRepair__trgSwitchOperational____place);
		srcRoute__srcSwitchPosition____follows.setSrc(srcRoute);
		srcRoute__srcSwitchPosition____follows.setTrg(srcSwitchPosition);
		ruleresult.getTranslatedEdges().add(srcRoute__srcSwitchPosition____follows);
		srcSwitchPosition__srcRoute____route.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcRoute____route.setTrg(srcRoute);
		ruleresult.getTranslatedEdges().add(srcSwitchPosition__srcRoute____route);
		trgRouteFail__trgPetrinet____petriNet.setSrc(trgRouteFail);
		trgRouteFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgPetrinet____petriNet);
		trgPetrinet__trgRouteFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRouteFail____nodes.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRouteFail____nodes);
		trgSwitchOperationalToRouteRepair__trgRouteRepair____transition.setSrc(trgSwitchOperationalToRouteRepair);
		trgSwitchOperationalToRouteRepair__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgSwitchOperationalToRouteRepair__trgRouteRepair____transition);
		trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs.setTrg(trgSwitchOperationalToRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs);
		trgRouteFailToSwitchFailed__trgRouteFail____transition.setSrc(trgRouteFailToSwitchFailed);
		trgRouteFailToSwitchFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToSwitchFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToSwitchFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToSwitchFailed____arcs.setTrg(trgRouteFailToSwitchFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToSwitchFailed____arcs);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setTrg(trgRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFailed____place);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setTrg(trgRouteFailToRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToRouteFailed____arcs);
		trgRouteRepairToSwitchOperational__trgSwitchOperational____place.setSrc(trgRouteRepairToSwitchOperational);
		trgRouteRepairToSwitchOperational__trgSwitchOperational____place.setTrg(trgSwitchOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSwitchOperational__trgSwitchOperational____place);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setTrg(trgRouteOperational);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteOperational____place);
		trgRouteFailToSwitchFailed__trgSwitchFailed____place.setSrc(trgRouteFailToSwitchFailed);
		trgRouteFailToSwitchFailed__trgSwitchFailed____place.setTrg(trgSwitchFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToSwitchFailed__trgSwitchFailed____place);
		trgSwitchFailedToRouteFail__trgRouteFail____transition.setSrc(trgSwitchFailedToRouteFail);
		trgSwitchFailedToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgSwitchFailedToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgSwitchFailedToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgSwitchFailedToRouteFail____arcs.setTrg(trgSwitchFailedToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgSwitchFailedToRouteFail____arcs);
		trgSwitchFailedToRouteFail__trgSwitchFailed____place.setSrc(trgSwitchFailedToRouteFail);
		trgSwitchFailedToRouteFail__trgSwitchFailed____place.setTrg(trgSwitchFailed);
		ruleresult.getCreatedEdges().add(trgSwitchFailedToRouteFail__trgSwitchFailed____place);
		trgRouteRepairToSwitchOperational__trgRouteRepair____transition.setSrc(trgRouteRepairToSwitchOperational);
		trgRouteRepairToSwitchOperational__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSwitchOperational__trgRouteRepair____transition);
		trgRouteRepair__trgRouteRepairToSwitchOperational____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgRouteRepairToSwitchOperational____arcs.setTrg(trgRouteRepairToSwitchOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgRouteRepairToSwitchOperational____arcs);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setTrg(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteOperationalToRouteFail____arcs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgSwitchOperationalToRouteRepair__trgSwitchOperational____place
				.setName(trgSwitchOperationalToRouteRepair__trgSwitchOperational____place_name_prime);
		srcRoute__srcSwitchPosition____follows.setName(srcRoute__srcSwitchPosition____follows_name_prime);
		srcSwitchPosition__srcRoute____route.setName(srcSwitchPosition__srcRoute____route_name_prime);
		trgRouteFail__trgPetrinet____petriNet.setName(trgRouteFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRouteFail____nodes.setName(trgPetrinet__trgRouteFail____nodes_name_prime);
		trgSwitchOperationalToRouteRepair__trgRouteRepair____transition
				.setName(trgSwitchOperationalToRouteRepair__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs
				.setName(trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs_name_prime);
		trgRouteFailToSwitchFailed__trgRouteFail____transition
				.setName(trgRouteFailToSwitchFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToSwitchFailed____arcs
				.setName(trgRouteFail__trgRouteFailToSwitchFailed____arcs_name_prime);
		trgRouteFailToRouteFailed__trgRouteFailed____place
				.setName(trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime);
		trgRouteFailToRouteFailed__trgRouteFail____transition
				.setName(trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToRouteFailed____arcs
				.setName(trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime);
		trgRouteRepairToSwitchOperational__trgSwitchOperational____place
				.setName(trgRouteRepairToSwitchOperational__trgSwitchOperational____place_name_prime);
		trgRouteOperationalToRouteFail__trgRouteOperational____place
				.setName(trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime);
		trgRouteFailToSwitchFailed__trgSwitchFailed____place
				.setName(trgRouteFailToSwitchFailed__trgSwitchFailed____place_name_prime);
		trgSwitchFailedToRouteFail__trgRouteFail____transition
				.setName(trgSwitchFailedToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgSwitchFailedToRouteFail____arcs
				.setName(trgRouteFail__trgSwitchFailedToRouteFail____arcs_name_prime);
		trgSwitchFailedToRouteFail__trgSwitchFailed____place
				.setName(trgSwitchFailedToRouteFail__trgSwitchFailed____place_name_prime);
		trgRouteRepairToSwitchOperational__trgRouteRepair____transition
				.setName(trgRouteRepairToSwitchOperational__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgRouteRepairToSwitchOperational____arcs
				.setName(trgRouteRepair__trgRouteRepairToSwitchOperational____arcs_name_prime);
		trgRouteOperationalToRouteFail__trgRouteFail____transition
				.setName(trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs
				.setName(trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime);
		return new Object[] { ruleresult, trgRouteRepair, trgSwitchOperationalToRouteRepair, srcRoute,
				trgRouteOperational, trgSwitchOperational, trgRouteFailed, trgRouteFail, trgPetrinet, trgSwitchFailed,
				srcSwitchPosition, trgRouteRepairToSwitchOperational, trgRouteFailToSwitchFailed,
				trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail, trgSwitchFailedToRouteFail,
				trgSwitchOperationalToRouteRepair__trgSwitchOperational____place,
				srcRoute__srcSwitchPosition____follows, srcSwitchPosition__srcRoute____route,
				trgRouteFail__trgPetrinet____petriNet, trgPetrinet__trgRouteFail____nodes,
				trgSwitchOperationalToRouteRepair__trgRouteRepair____transition,
				trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs,
				trgRouteFailToSwitchFailed__trgRouteFail____transition,
				trgRouteFail__trgRouteFailToSwitchFailed____arcs, trgRouteFailToRouteFailed__trgRouteFailed____place,
				trgRouteFailToRouteFailed__trgRouteFail____transition, trgRouteFail__trgRouteFailToRouteFailed____arcs,
				trgRouteRepairToSwitchOperational__trgSwitchOperational____place,
				trgRouteOperationalToRouteFail__trgRouteOperational____place,
				trgRouteFailToSwitchFailed__trgSwitchFailed____place,
				trgSwitchFailedToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgSwitchFailedToRouteFail____arcs, trgSwitchFailedToRouteFail__trgSwitchFailed____place,
				trgRouteRepairToSwitchOperational__trgRouteRepair____transition,
				trgRouteRepair__trgRouteRepairToSwitchOperational____arcs,
				trgRouteOperationalToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgRouteOperationalToRouteFail____arcs };
	}

	public static final void pattern_RequiredSwitch_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBBB(
			RequiredSwitch _this, PerformRuleResult ruleresult, EObject trgRouteRepair,
			EObject trgSwitchOperationalToRouteRepair, EObject srcRoute, EObject trgRouteOperational,
			EObject trgSwitchOperational, EObject trgRouteFailed, EObject trgRouteFail, EObject trgPetrinet,
			EObject trgSwitchFailed, EObject srcSwitch, EObject routeFailedCorr, EObject srcSwitchPosition,
			EObject trgRouteRepairToSwitchOperational, EObject routeRepairCorr, EObject trgRouteFailToSwitchFailed,
			EObject srcContainer, EObject trgRouteFailToRouteFailed, EObject switchOperationalCorr,
			EObject trgRouteOperationalToRouteFail, EObject switchFailedCorr, EObject routeOperationalCorr,
			EObject trgSwitchFailedToRouteFail, EObject containerCorr) {
		_this.registerObjects_FWD(ruleresult, trgRouteRepair, trgSwitchOperationalToRouteRepair, srcRoute,
				trgRouteOperational, trgSwitchOperational, trgRouteFailed, trgRouteFail, trgPetrinet, trgSwitchFailed,
				srcSwitch, routeFailedCorr, srcSwitchPosition, trgRouteRepairToSwitchOperational, routeRepairCorr,
				trgRouteFailToSwitchFailed, srcContainer, trgRouteFailToRouteFailed, switchOperationalCorr,
				trgRouteOperationalToRouteFail, switchFailedCorr, routeOperationalCorr, trgSwitchFailedToRouteFail,
				containerCorr);

	}

	public static final PerformRuleResult pattern_RequiredSwitch_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_2_1_preparereturnvalue_bindingFB(RequiredSwitch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			RequiredSwitch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_2_1_preparereturnvalue_bindingAndBlackFFB(
			RequiredSwitch _this) {
		Object[] result_pattern_RequiredSwitch_2_1_preparereturnvalue_binding = pattern_RequiredSwitch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredSwitch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_RequiredSwitch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredSwitch_2_1_preparereturnvalue_black = pattern_RequiredSwitch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_RequiredSwitch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_RequiredSwitch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "RequiredSwitch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_RequiredSwitch_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcRoute");
		EObject _localVariable_1 = match.getObject("srcSwitch");
		EObject _localVariable_2 = match.getObject("srcSwitchPosition");
		EObject _localVariable_3 = match.getObject("srcContainer");
		EObject tmpSrcRoute = _localVariable_0;
		EObject tmpSrcSwitch = _localVariable_1;
		EObject tmpSrcSwitchPosition = _localVariable_2;
		EObject tmpSrcContainer = _localVariable_3;
		if (tmpSrcRoute instanceof Route) {
			Route srcRoute = (Route) tmpSrcRoute;
			if (tmpSrcSwitch instanceof Switch) {
				Switch srcSwitch = (Switch) tmpSrcSwitch;
				if (tmpSrcSwitchPosition instanceof SwitchPosition) {
					SwitchPosition srcSwitchPosition = (SwitchPosition) tmpSrcSwitchPosition;
					if (tmpSrcContainer instanceof RailwayContainer) {
						RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
						return new Object[] { srcRoute, srcSwitch, srcSwitchPosition, srcContainer, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_RequiredSwitch_2_2_corematch_blackFBFFFFFBFBFBFFFFB(Route srcRoute,
			Switch srcSwitch, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RouteToFailed routeFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcRoute, RouteToFailed.class, "source")) {
			Place trgRouteFailed = routeFailedCorr.getTarget();
			if (trgRouteFailed != null) {
				for (RouteToRepair routeRepairCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcRoute, RouteToRepair.class, "source")) {
					Transition trgRouteRepair = routeRepairCorr.getTarget();
					if (trgRouteRepair != null) {
						for (SwitchToOperational switchOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(srcSwitch, SwitchToOperational.class, "source")) {
							Place trgSwitchOperational = switchOperationalCorr.getTarget();
							if (trgSwitchOperational != null) {
								if (!trgRouteFailed.equals(trgSwitchOperational)) {
									for (RouteToOperational routeOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(srcRoute, RouteToOperational.class, "source")) {
										Place trgRouteOperational = routeOperationalCorr.getTarget();
										if (trgRouteOperational != null) {
											if (!trgRouteOperational.equals(trgSwitchOperational)) {
												if (!trgRouteFailed.equals(trgRouteOperational)) {
													for (SwitchToFailed switchFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(srcSwitch, SwitchToFailed.class,
																	"source")) {
														Place trgSwitchFailed = switchFailedCorr.getTarget();
														if (trgSwitchFailed != null) {
															if (!trgRouteOperational.equals(trgSwitchFailed)) {
																if (!trgRouteFailed.equals(trgSwitchFailed)) {
																	if (!trgSwitchFailed.equals(trgSwitchOperational)) {
																		for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(srcContainer,
																						RailwayContainerToPetriNet.class,
																						"source")) {
																			PetriNet trgPetrinet = containerCorr
																					.getTarget();
																			if (trgPetrinet != null) {
																				_result.add(new Object[] {
																						trgRouteRepair, srcRoute,
																						trgRouteOperational,
																						trgSwitchOperational,
																						trgRouteFailed, trgPetrinet,
																						trgSwitchFailed, srcSwitch,
																						routeFailedCorr,
																						srcSwitchPosition,
																						routeRepairCorr, srcContainer,
																						switchOperationalCorr,
																						switchFailedCorr,
																						routeOperationalCorr,
																						containerCorr, match });
																			}

																		}
																	}
																}
															}
														}

													}
												}
											}
										}

									}
								}
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_RequiredSwitch_2_3_findcontext_blackBBBBBBBBBBBBBBBB(
			Transition trgRouteRepair, Route srcRoute, Place trgRouteOperational, Place trgSwitchOperational,
			Place trgRouteFailed, PetriNet trgPetrinet, Place trgSwitchFailed, Switch srcSwitch,
			RouteToFailed routeFailedCorr, SwitchPosition srcSwitchPosition, RouteToRepair routeRepairCorr,
			RailwayContainer srcContainer, SwitchToOperational switchOperationalCorr, SwitchToFailed switchFailedCorr,
			RouteToOperational routeOperationalCorr, RailwayContainerToPetriNet containerCorr) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!trgRouteOperational.equals(trgSwitchOperational)) {
			if (!trgRouteOperational.equals(trgSwitchFailed)) {
				if (!trgRouteFailed.equals(trgRouteOperational)) {
					if (!trgRouteFailed.equals(trgSwitchOperational)) {
						if (!trgRouteFailed.equals(trgSwitchFailed)) {
							if (!trgSwitchFailed.equals(trgSwitchOperational)) {
								if (srcRoute.getFollows().contains(srcSwitchPosition)) {
									if (srcSwitch.equals(srcSwitchPosition.getTarget())) {
										if (srcRoute.equals(routeFailedCorr.getSource())) {
											if (trgRouteRepair.equals(routeRepairCorr.getTarget())) {
												if (srcRoute.equals(routeRepairCorr.getSource())) {
													if (srcSwitch.equals(switchOperationalCorr.getSource())) {
														if (srcContainer.getRoutes().contains(srcRoute)) {
															if (trgRouteFailed.equals(routeFailedCorr.getTarget())) {
																if (trgSwitchOperational
																		.equals(switchOperationalCorr.getTarget())) {
																	if (trgSwitchFailed
																			.equals(switchFailedCorr.getTarget())) {
																		if (srcRoute.equals(
																				routeOperationalCorr.getSource())) {
																			if (srcSwitch.equals(
																					switchFailedCorr.getSource())) {
																				if (trgRouteOperational
																						.equals(routeOperationalCorr
																								.getTarget())) {
																					if (trgPetrinet.equals(containerCorr
																							.getTarget())) {
																						if (srcContainer
																								.equals(containerCorr
																										.getSource())) {
																							_result.add(new Object[] {
																									trgRouteRepair,
																									srcRoute,
																									trgRouteOperational,
																									trgSwitchOperational,
																									trgRouteFailed,
																									trgPetrinet,
																									trgSwitchFailed,
																									srcSwitch,
																									routeFailedCorr,
																									srcSwitchPosition,
																									routeRepairCorr,
																									srcContainer,
																									switchOperationalCorr,
																									switchFailedCorr,
																									routeOperationalCorr,
																									containerCorr });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_2_3_findcontext_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			Transition trgRouteRepair, Route srcRoute, Place trgRouteOperational, Place trgSwitchOperational,
			Place trgRouteFailed, PetriNet trgPetrinet, Place trgSwitchFailed, Switch srcSwitch,
			RouteToFailed routeFailedCorr, SwitchPosition srcSwitchPosition, RouteToRepair routeRepairCorr,
			RailwayContainer srcContainer, SwitchToOperational switchOperationalCorr, SwitchToFailed switchFailedCorr,
			RouteToOperational routeOperationalCorr, RailwayContainerToPetriNet containerCorr) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcRoute__srcSwitchPosition____follows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcRoute____route = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcSwitch____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitch__srcSwitchPosition____positions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__trgRouteRepair____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchOperationalCorr__srcSwitch____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__trgRouteFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchOperationalCorr__trgSwitchOperational____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge switchFailedCorr__trgSwitchFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchFailedCorr__srcSwitch____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__trgRouteOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcRoute__srcSwitchPosition____follows_name_prime = "follows";
		String srcSwitchPosition__srcRoute____route_name_prime = "route";
		String srcSwitchPosition__srcSwitch____target_name_prime = "target";
		String srcSwitch__srcSwitchPosition____positions_name_prime = "positions";
		String routeFailedCorr__srcRoute____source_name_prime = "source";
		String routeRepairCorr__trgRouteRepair____target_name_prime = "target";
		String routeRepairCorr__srcRoute____source_name_prime = "source";
		String switchOperationalCorr__srcSwitch____source_name_prime = "source";
		String srcContainer__srcRoute____routes_name_prime = "routes";
		String routeFailedCorr__trgRouteFailed____target_name_prime = "target";
		String switchOperationalCorr__trgSwitchOperational____target_name_prime = "target";
		String switchFailedCorr__trgSwitchFailed____target_name_prime = "target";
		String routeOperationalCorr__srcRoute____source_name_prime = "source";
		String switchFailedCorr__srcSwitch____source_name_prime = "source";
		String routeOperationalCorr__trgRouteOperational____target_name_prime = "target";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String containerCorr__srcContainer____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(srcRoute);
		isApplicableMatch.getAllContextElements().add(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(trgSwitchOperational);
		isApplicableMatch.getAllContextElements().add(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(trgSwitchFailed);
		isApplicableMatch.getAllContextElements().add(srcSwitch);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(switchOperationalCorr);
		isApplicableMatch.getAllContextElements().add(switchFailedCorr);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr);
		isApplicableMatch.getAllContextElements().add(containerCorr);
		srcRoute__srcSwitchPosition____follows.setSrc(srcRoute);
		srcRoute__srcSwitchPosition____follows.setTrg(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(srcRoute__srcSwitchPosition____follows);
		srcSwitchPosition__srcRoute____route.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcRoute____route.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition__srcRoute____route);
		srcSwitchPosition__srcSwitch____target.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcSwitch____target.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition__srcSwitch____target);
		srcSwitch__srcSwitchPosition____positions.setSrc(srcSwitch);
		srcSwitch__srcSwitchPosition____positions.setTrg(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(srcSwitch__srcSwitchPosition____positions);
		routeFailedCorr__srcRoute____source.setSrc(routeFailedCorr);
		routeFailedCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__srcRoute____source);
		routeRepairCorr__trgRouteRepair____target.setSrc(routeRepairCorr);
		routeRepairCorr__trgRouteRepair____target.setTrg(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__trgRouteRepair____target);
		routeRepairCorr__srcRoute____source.setSrc(routeRepairCorr);
		routeRepairCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__srcRoute____source);
		switchOperationalCorr__srcSwitch____source.setSrc(switchOperationalCorr);
		switchOperationalCorr__srcSwitch____source.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(switchOperationalCorr__srcSwitch____source);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRoute____routes);
		routeFailedCorr__trgRouteFailed____target.setSrc(routeFailedCorr);
		routeFailedCorr__trgRouteFailed____target.setTrg(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__trgRouteFailed____target);
		switchOperationalCorr__trgSwitchOperational____target.setSrc(switchOperationalCorr);
		switchOperationalCorr__trgSwitchOperational____target.setTrg(trgSwitchOperational);
		isApplicableMatch.getAllContextElements().add(switchOperationalCorr__trgSwitchOperational____target);
		switchFailedCorr__trgSwitchFailed____target.setSrc(switchFailedCorr);
		switchFailedCorr__trgSwitchFailed____target.setTrg(trgSwitchFailed);
		isApplicableMatch.getAllContextElements().add(switchFailedCorr__trgSwitchFailed____target);
		routeOperationalCorr__srcRoute____source.setSrc(routeOperationalCorr);
		routeOperationalCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__srcRoute____source);
		switchFailedCorr__srcSwitch____source.setSrc(switchFailedCorr);
		switchFailedCorr__srcSwitch____source.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(switchFailedCorr__srcSwitch____source);
		routeOperationalCorr__trgRouteOperational____target.setSrc(routeOperationalCorr);
		routeOperationalCorr__trgRouteOperational____target.setTrg(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__trgRouteOperational____target);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		srcRoute__srcSwitchPosition____follows.setName(srcRoute__srcSwitchPosition____follows_name_prime);
		srcSwitchPosition__srcRoute____route.setName(srcSwitchPosition__srcRoute____route_name_prime);
		srcSwitchPosition__srcSwitch____target.setName(srcSwitchPosition__srcSwitch____target_name_prime);
		srcSwitch__srcSwitchPosition____positions.setName(srcSwitch__srcSwitchPosition____positions_name_prime);
		routeFailedCorr__srcRoute____source.setName(routeFailedCorr__srcRoute____source_name_prime);
		routeRepairCorr__trgRouteRepair____target.setName(routeRepairCorr__trgRouteRepair____target_name_prime);
		routeRepairCorr__srcRoute____source.setName(routeRepairCorr__srcRoute____source_name_prime);
		switchOperationalCorr__srcSwitch____source.setName(switchOperationalCorr__srcSwitch____source_name_prime);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		routeFailedCorr__trgRouteFailed____target.setName(routeFailedCorr__trgRouteFailed____target_name_prime);
		switchOperationalCorr__trgSwitchOperational____target
				.setName(switchOperationalCorr__trgSwitchOperational____target_name_prime);
		switchFailedCorr__trgSwitchFailed____target.setName(switchFailedCorr__trgSwitchFailed____target_name_prime);
		routeOperationalCorr__srcRoute____source.setName(routeOperationalCorr__srcRoute____source_name_prime);
		switchFailedCorr__srcSwitch____source.setName(switchFailedCorr__srcSwitch____source_name_prime);
		routeOperationalCorr__trgRouteOperational____target
				.setName(routeOperationalCorr__trgRouteOperational____target_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		return new Object[] { trgRouteRepair, srcRoute, trgRouteOperational, trgSwitchOperational, trgRouteFailed,
				trgPetrinet, trgSwitchFailed, srcSwitch, routeFailedCorr, srcSwitchPosition, routeRepairCorr,
				srcContainer, switchOperationalCorr, switchFailedCorr, routeOperationalCorr, containerCorr,
				isApplicableMatch, srcRoute__srcSwitchPosition____follows, srcSwitchPosition__srcRoute____route,
				srcSwitchPosition__srcSwitch____target, srcSwitch__srcSwitchPosition____positions,
				routeFailedCorr__srcRoute____source, routeRepairCorr__trgRouteRepair____target,
				routeRepairCorr__srcRoute____source, switchOperationalCorr__srcSwitch____source,
				srcContainer__srcRoute____routes, routeFailedCorr__trgRouteFailed____target,
				switchOperationalCorr__trgSwitchOperational____target, switchFailedCorr__trgSwitchFailed____target,
				routeOperationalCorr__srcRoute____source, switchFailedCorr__srcSwitch____source,
				routeOperationalCorr__trgRouteOperational____target, containerCorr__trgPetrinet____target,
				containerCorr__srcContainer____source };
	}

	public static final Object[] pattern_RequiredSwitch_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(RequiredSwitch _this,
			IsApplicableMatch isApplicableMatch, Transition trgRouteRepair, Route srcRoute, Place trgRouteOperational,
			Place trgSwitchOperational, Place trgRouteFailed, PetriNet trgPetrinet, Place trgSwitchFailed,
			Switch srcSwitch, RouteToFailed routeFailedCorr, SwitchPosition srcSwitchPosition,
			RouteToRepair routeRepairCorr, RailwayContainer srcContainer, SwitchToOperational switchOperationalCorr,
			SwitchToFailed switchFailedCorr, RouteToOperational routeOperationalCorr,
			RailwayContainerToPetriNet containerCorr) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, trgRouteRepair, srcRoute,
				trgRouteOperational, trgSwitchOperational, trgRouteFailed, trgPetrinet, trgSwitchFailed, srcSwitch,
				routeFailedCorr, srcSwitchPosition, routeRepairCorr, srcContainer, switchOperationalCorr,
				switchFailedCorr, routeOperationalCorr, containerCorr);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, trgRouteRepair, srcRoute, trgRouteOperational,
					trgSwitchOperational, trgRouteFailed, trgPetrinet, trgSwitchFailed, srcSwitch, routeFailedCorr,
					srcSwitchPosition, routeRepairCorr, srcContainer, switchOperationalCorr, switchFailedCorr,
					routeOperationalCorr, containerCorr };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSwitch_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
			RequiredSwitch _this, IsApplicableMatch isApplicableMatch, Transition trgRouteRepair, Route srcRoute,
			Place trgRouteOperational, Place trgSwitchOperational, Place trgRouteFailed, PetriNet trgPetrinet,
			Place trgSwitchFailed, Switch srcSwitch, RouteToFailed routeFailedCorr, SwitchPosition srcSwitchPosition,
			RouteToRepair routeRepairCorr, RailwayContainer srcContainer, SwitchToOperational switchOperationalCorr,
			SwitchToFailed switchFailedCorr, RouteToOperational routeOperationalCorr,
			RailwayContainerToPetriNet containerCorr) {
		Object[] result_pattern_RequiredSwitch_2_4_solveCSP_binding = pattern_RequiredSwitch_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, trgRouteRepair, srcRoute, trgRouteOperational, trgSwitchOperational,
				trgRouteFailed, trgPetrinet, trgSwitchFailed, srcSwitch, routeFailedCorr, srcSwitchPosition,
				routeRepairCorr, srcContainer, switchOperationalCorr, switchFailedCorr, routeOperationalCorr,
				containerCorr);
		if (result_pattern_RequiredSwitch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSwitch_2_4_solveCSP_binding[0];

			Object[] result_pattern_RequiredSwitch_2_4_solveCSP_black = pattern_RequiredSwitch_2_4_solveCSP_blackB(csp);
			if (result_pattern_RequiredSwitch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, trgRouteRepair, srcRoute, trgRouteOperational,
						trgSwitchOperational, trgRouteFailed, trgPetrinet, trgSwitchFailed, srcSwitch, routeFailedCorr,
						srcSwitchPosition, routeRepairCorr, srcContainer, switchOperationalCorr, switchFailedCorr,
						routeOperationalCorr, containerCorr };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredSwitch_2_5_checkCSP_expressionFBB(RequiredSwitch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_RequiredSwitch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "RequiredSwitch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_RequiredSwitch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_10_1_preparereturnvalue_bindingFB(RequiredSwitch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			RequiredSwitch _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_10_1_preparereturnvalue_bindingAndBlackFFBF(
			RequiredSwitch _this) {
		Object[] result_pattern_RequiredSwitch_10_1_preparereturnvalue_binding = pattern_RequiredSwitch_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredSwitch_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_RequiredSwitch_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredSwitch_10_1_preparereturnvalue_black = pattern_RequiredSwitch_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_RequiredSwitch_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_RequiredSwitch_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_RequiredSwitch_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_RequiredSwitch_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_follows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcRoute = _edge_follows.getSrc();
		if (tmpSrcRoute instanceof Route) {
			Route srcRoute = (Route) tmpSrcRoute;
			EObject tmpSrcSwitchPosition = _edge_follows.getTrg();
			if (tmpSrcSwitchPosition instanceof SwitchPosition) {
				SwitchPosition srcSwitchPosition = (SwitchPosition) tmpSrcSwitchPosition;
				if (srcRoute.getFollows().contains(srcSwitchPosition)) {
					Switch srcSwitch = srcSwitchPosition.getTarget();
					if (srcSwitch != null) {
						for (RailwayContainer srcContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(srcRoute, RailwayContainer.class, "routes")) {
							_result.add(new Object[] { srcRoute, srcSwitch, srcSwitchPosition, srcContainer,
									_edge_follows });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_RequiredSwitch_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			RequiredSwitch _this, Match match, Route srcRoute, Switch srcSwitch, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcRoute, srcSwitch, srcSwitchPosition, srcContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_RequiredSwitch_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			RequiredSwitch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_RequiredSwitch_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_13_1_matchtggpattern_blackBBBB(Route srcRoute, Switch srcSwitch,
			SwitchPosition srcSwitchPosition, RailwayContainer srcContainer) {
		if (srcRoute.getFollows().contains(srcSwitchPosition)) {
			if (srcSwitch.equals(srcSwitchPosition.getTarget())) {
				if (srcContainer.getRoutes().contains(srcRoute)) {
					return new Object[] { srcRoute, srcSwitch, srcSwitchPosition, srcContainer };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredSwitch_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredSwitch_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RequiredSwitchImpl
