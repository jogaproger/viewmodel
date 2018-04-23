/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet/model/Stochasticpetrinet.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RequiredExitSemaphoreImpl <em>Required Exit Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RequiredExitSemaphoreImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getRequiredExitSemaphore()
	 * @generated
	 */
	int REQUIRED_EXIT_SEMAPHORE = 0;

	/**
	 * The number of structural features of the '<em>Required Exit Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___IS_APPROPRIATE_FWD__MATCH_RAILWAYCONTAINER_SEMAPHORE_ROUTE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_RAILWAYCONTAINER_SEMAPHORE_ROUTE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_RAILWAYCONTAINER_SEMAPHORE_ROUTE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINERTOPETRINET_RAILWAYCONTAINER_SEMAPHORE_ROUTETOREPAIR_ROUTETOOPERATIONAL_ROUTETOFAILED_PLACE_TRANSITION_PLACE_PLACE_SEMAPHORETOFAILED_ROUTE_SEMAPHORETOOPERATIONAL_PETRINET_PLACE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE___CHECK_DEC_FWD__RAILWAYCONTAINER_SEMAPHORE_ROUTE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Required Exit Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXIT_SEMAPHORE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SwitchPositionImpl <em>Switch Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SwitchPositionImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getSwitchPosition()
	 * @generated
	 */
	int SWITCH_POSITION = 1;

	/**
	 * The number of structural features of the '<em>Switch Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___IS_APPROPRIATE_FWD__MATCH_SWITCHPOSITION_SWITCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SWITCHPOSITION_SWITCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SWITCHPOSITION_SWITCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SWITCHPOSITION_SWITCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION___CHECK_DEC_FWD__SWITCHPOSITION_SWITCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Switch Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_POSITION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RailwayContainerImpl <em>Railway Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RailwayContainerImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getRailwayContainer()
	 * @generated
	 */
	int RAILWAY_CONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Railway Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___IS_APPROPRIATE_FWD__MATCH_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Railway Container 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___IS_APPROPRIATE_FWD_RAILWAY_CONTAINER_0__RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER___CHECK_DEC_FWD__RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Railway Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RequiredSwitchImpl <em>Required Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RequiredSwitchImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getRequiredSwitch()
	 * @generated
	 */
	int REQUIRED_SWITCH = 3;

	/**
	 * The number of structural features of the '<em>Required Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___IS_APPROPRIATE_FWD__MATCH_ROUTE_SWITCH_SWITCHPOSITION_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ROUTE_SWITCH_SWITCHPOSITION_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ROUTE_SWITCH_SWITCHPOSITION_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TRANSITION_ROUTE_PLACE_PLACE_PLACE_PETRINET_PLACE_SWITCH_ROUTETOFAILED_SWITCHPOSITION_ROUTETOREPAIR_RAILWAYCONTAINER_SWITCHTOOPERATIONAL_SWITCHTOFAILED_ROUTETOOPERATIONAL_RAILWAYCONTAINERTOPETRINET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH___CHECK_DEC_FWD__ROUTE_SWITCH_SWITCHPOSITION_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Required Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SWITCH_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RequiredSensorImpl <em>Required Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RequiredSensorImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getRequiredSensor()
	 * @generated
	 */
	int REQUIRED_SENSOR = 4;

	/**
	 * The number of structural features of the '<em>Required Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___IS_APPROPRIATE_FWD__MATCH_RAILWAYCONTAINER_SENSOR_ROUTE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_RAILWAYCONTAINER_SENSOR_ROUTE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_RAILWAYCONTAINER_SENSOR_ROUTE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINER_RAILWAYCONTAINERTOPETRINET_ROUTETOOPERATIONAL_ROUTETOREPAIR_PLACE_PLACE_SENSORTOOPERATIONAL_TRANSITION_SENSORTOFAILED_PLACE_SENSOR_ROUTE_PLACE_ROUTETOFAILED_PETRINET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR___CHECK_DEC_FWD__RAILWAYCONTAINER_SENSOR_ROUTE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Required Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SENSOR_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SensorMonitorsImpl <em>Sensor Monitors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SensorMonitorsImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getSensorMonitors()
	 * @generated
	 */
	int SENSOR_MONITORS = 5;

	/**
	 * The number of structural features of the '<em>Sensor Monitors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___IS_APPROPRIATE_FWD__MATCH_TRACKELEMENT_SENSOR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TRACKELEMENT_SENSOR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TRACKELEMENT_SENSOR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TRACKELEMENT_SENSOR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS___CHECK_DEC_FWD__TRACKELEMENT_SENSOR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Sensor Monitors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MONITORS_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SegmentImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 6;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___IS_APPROPRIATE_FWD__MATCH_REGION_SEGMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_REGION_SEGMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_REGION_SEGMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_REGION_SEGMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT___CHECK_DEC_FWD__REGION_SEGMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RegionImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 7;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_APPROPRIATE_FWD__MATCH_REGION_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_REGION_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_REGION_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_REGION_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___CHECK_DEC_FWD__REGION_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SwitchImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 8;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___IS_APPROPRIATE_FWD__MATCH_SWITCH_RAILWAYCONTAINER_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SWITCH_RAILWAYCONTAINER_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SWITCH_RAILWAYCONTAINER_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SWITCH_PETRINET_RAILWAYCONTAINER_REGION_RAILWAYCONTAINERTOPETRINET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH___CHECK_DEC_FWD__SWITCH_RAILWAYCONTAINER_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SemaphoreImpl <em>Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SemaphoreImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getSemaphore()
	 * @generated
	 */
	int SEMAPHORE = 9;

	/**
	 * The number of structural features of the '<em>Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___IS_APPROPRIATE_FWD__MATCH_SEMAPHORE_RAILWAYCONTAINER_SEGMENT_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEMAPHORE_RAILWAYCONTAINER_SEGMENT_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEMAPHORE_RAILWAYCONTAINER_SEGMENT_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINERTOPETRINET_SEMAPHORE_RAILWAYCONTAINER_SEGMENT_PETRINET_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE___CHECK_DEC_FWD__SEMAPHORE_RAILWAYCONTAINER_SEGMENT_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RouteImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 10;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___IS_APPROPRIATE_FWD__MATCH_ROUTE_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ROUTE_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ROUTE_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PETRINET_ROUTE_RAILWAYCONTAINER_RAILWAYCONTAINERTOPETRINET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___CHECK_DEC_FWD__ROUTE_RAILWAYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.SensorImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 11;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___IS_APPROPRIATE_FWD__MATCH_RAILWAYCONTAINER_SENSOR_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_RAILWAYCONTAINER_SENSOR_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_RAILWAYCONTAINER_SENSOR_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PETRINET_RAILWAYCONTAINER_RAILWAYCONTAINERTOPETRINET_SENSOR_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___IS_APPROPRIATE_FWD_EMOFLON_EDGE_10__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___CHECK_DEC_FWD__RAILWAYCONTAINER_SENSOR_REGION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.TrackElementConnectsToImpl <em>Track Element Connects To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.TrackElementConnectsToImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getTrackElementConnectsTo()
	 * @generated
	 */
	int TRACK_ELEMENT_CONNECTS_TO = 12;

	/**
	 * The number of structural features of the '<em>Track Element Connects To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___IS_APPROPRIATE_FWD__MATCH_TRACKELEMENT_TRACKELEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TRACKELEMENT_TRACKELEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TRACKELEMENT_TRACKELEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TRACKELEMENT_TRACKELEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO___CHECK_DEC_FWD__TRACKELEMENT_TRACKELEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Track Element Connects To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_CONNECTS_TO_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RequiredEntrySemaphoreImpl <em>Required Entry Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RequiredEntrySemaphoreImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl.RulesPackageImpl#getRequiredEntrySemaphore()
	 * @generated
	 */
	int REQUIRED_ENTRY_SEMAPHORE = 13;

	/**
	 * The number of structural features of the '<em>Required Entry Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_FWD__MATCH_RAILWAYCONTAINER_ROUTE_SEMAPHORE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_RAILWAYCONTAINER_ROUTE_SEMAPHORE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_RAILWAYCONTAINER_ROUTE_SEMAPHORE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ROUTETOREPAIR_SEMAPHORETOOPERATIONAL_PLACE_RAILWAYCONTAINER_SEMAPHORETOFAILED_PLACE_ROUTETOFAILED_PLACE_PLACE_PETRINET_ROUTE_RAILWAYCONTAINERTOPETRINET_SEMAPHORE_ROUTETOOPERATIONAL_TRANSITION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE___CHECK_DEC_FWD__RAILWAYCONTAINER_ROUTE_SEMAPHORE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The number of operations of the '<em>Required Entry Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ENTRY_SEMAPHORE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore <em>Required Exit Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Exit Semaphore</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore
	 * @generated
	 */
	EClass getRequiredExitSemaphore();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__IsAppropriate_FWD__Match_RailwayContainer_Semaphore_Route();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__RegisterObjectsToMatch_FWD__Match_RailwayContainer_Semaphore_Route();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__IsAppropriate_solveCsp_FWD__Match_RailwayContainer_Semaphore_Route();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__IsApplicable_solveCsp_FWD__IsApplicableMatch_RailwayContainerToPetriNet_RailwayContainer_Semaphore_RouteToRepair_RouteToOperational_RouteToFailed_Place_Transition_Place_Place_SemaphoreToFailed_Route_SemaphoreToOperational_PetriNet_Place();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isAppropriate_FWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isAppropriate_FWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route)
	 * @generated
	 */
	EOperation getRequiredExitSemaphore__CheckDEC_FWD__RailwayContainer_Semaphore_Route();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition <em>Switch Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Position</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition
	 * @generated
	 */
	EClass getSwitchPosition();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch)
	 * @generated
	 */
	EOperation getSwitchPosition__IsAppropriate_FWD__Match_SwitchPosition_Switch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSwitchPosition__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSwitchPosition__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch)
	 * @generated
	 */
	EOperation getSwitchPosition__RegisterObjectsToMatch_FWD__Match_SwitchPosition_Switch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch)
	 * @generated
	 */
	EOperation getSwitchPosition__IsAppropriate_solveCsp_FWD__Match_SwitchPosition_Switch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSwitchPosition__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch)
	 * @generated
	 */
	EOperation getSwitchPosition__IsApplicable_solveCsp_FWD__IsApplicableMatch_SwitchPosition_Switch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSwitchPosition__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSwitchPosition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSwitchPosition__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isAppropriate_FWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isAppropriate_FWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSwitchPosition__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSwitchPosition__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSwitchPosition__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch)
	 * @generated
	 */
	EOperation getSwitchPosition__CheckDEC_FWD__SwitchPosition_Switch();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer <em>Railway Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway Container</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer
	 * @generated
	 */
	EClass getRailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRailwayContainer__IsAppropriate_FWD__Match_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getRailwayContainer__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRailwayContainer__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRailwayContainer__RegisterObjectsToMatch_FWD__Match_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRailwayContainer__IsAppropriate_solveCsp_FWD__Match_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRailwayContainer__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRailwayContainer__IsApplicable_solveCsp_FWD__IsApplicableMatch_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRailwayContainer__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getRailwayContainer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRailwayContainer__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isAppropriate_FWD_RailwayContainer_0(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Appropriate FWD Railway Container 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Railway Container 0</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isAppropriate_FWD_RailwayContainer_0(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRailwayContainer__IsAppropriate_FWD_RailwayContainer_0__RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getRailwayContainer__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRailwayContainer__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRailwayContainer__CheckDEC_FWD__RailwayContainer();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch <em>Required Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Switch</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch
	 * @generated
	 */
	EClass getRequiredSwitch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRequiredSwitch__IsAppropriate_FWD__Match_Route_Switch_SwitchPosition_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getRequiredSwitch__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredSwitch__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRequiredSwitch__RegisterObjectsToMatch_FWD__Match_Route_Switch_SwitchPosition_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRequiredSwitch__IsAppropriate_solveCsp_FWD__Match_Route_Switch_SwitchPosition_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRequiredSwitch__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet)
	 * @generated
	 */
	EOperation getRequiredSwitch__IsApplicable_solveCsp_FWD__IsApplicableMatch_Transition_Route_Place_Place_Place_PetriNet_Place_Switch_RouteToFailed_SwitchPosition_RouteToRepair_RailwayContainer_SwitchToOperational_SwitchToFailed_RouteToOperational_RailwayContainerToPetriNet();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRequiredSwitch__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getRequiredSwitch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredSwitch__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isAppropriate_FWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isAppropriate_FWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getRequiredSwitch__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getRequiredSwitch__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredSwitch__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRequiredSwitch__CheckDEC_FWD__Route_Switch_SwitchPosition_RailwayContainer();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor <em>Required Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Sensor</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor
	 * @generated
	 */
	EClass getRequiredSensor();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route)
	 * @generated
	 */
	EOperation getRequiredSensor__IsAppropriate_FWD__Match_RailwayContainer_Sensor_Route();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getRequiredSensor__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredSensor__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route)
	 * @generated
	 */
	EOperation getRequiredSensor__RegisterObjectsToMatch_FWD__Match_RailwayContainer_Sensor_Route();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route)
	 * @generated
	 */
	EOperation getRequiredSensor__IsAppropriate_solveCsp_FWD__Match_RailwayContainer_Sensor_Route();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRequiredSensor__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet)
	 * @generated
	 */
	EOperation getRequiredSensor__IsApplicable_solveCsp_FWD__IsApplicableMatch_RailwayContainer_RailwayContainerToPetriNet_RouteToOperational_RouteToRepair_Place_Place_SensorToOperational_Transition_SensorToFailed_Place_Sensor_Route_Place_RouteToFailed_PetriNet();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRequiredSensor__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getRequiredSensor__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredSensor__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isAppropriate_FWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isAppropriate_FWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getRequiredSensor__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getRequiredSensor__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredSensor__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route)
	 * @generated
	 */
	EOperation getRequiredSensor__CheckDEC_FWD__RailwayContainer_Sensor_Route();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors <em>Sensor Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Monitors</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors
	 * @generated
	 */
	EClass getSensorMonitors();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor)
	 * @generated
	 */
	EOperation getSensorMonitors__IsAppropriate_FWD__Match_TrackElement_Sensor();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSensorMonitors__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSensorMonitors__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor)
	 * @generated
	 */
	EOperation getSensorMonitors__RegisterObjectsToMatch_FWD__Match_TrackElement_Sensor();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor)
	 * @generated
	 */
	EOperation getSensorMonitors__IsAppropriate_solveCsp_FWD__Match_TrackElement_Sensor();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSensorMonitors__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor)
	 * @generated
	 */
	EOperation getSensorMonitors__IsApplicable_solveCsp_FWD__IsApplicableMatch_TrackElement_Sensor();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSensorMonitors__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSensorMonitors__RegisterObjects_FWD__PerformRuleResult_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSensorMonitors__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isAppropriate_FWD_EMoflonEdge_4(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isAppropriate_FWD_EMoflonEdge_4(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSensorMonitors__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSensorMonitors__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSensorMonitors__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor)
	 * @generated
	 */
	EOperation getSensorMonitors__CheckDEC_FWD__TrackElement_Sensor();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment)
	 * @generated
	 */
	EOperation getSegment__IsAppropriate_FWD__Match_Region_Segment();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSegment__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSegment__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment)
	 * @generated
	 */
	EOperation getSegment__RegisterObjectsToMatch_FWD__Match_Region_Segment();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment)
	 * @generated
	 */
	EOperation getSegment__IsAppropriate_solveCsp_FWD__Match_Region_Segment();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSegment__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment)
	 * @generated
	 */
	EOperation getSegment__IsApplicable_solveCsp_FWD__IsApplicableMatch_Region_Segment();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSegment__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSegment__RegisterObjects_FWD__PerformRuleResult_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSegment__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isAppropriate_FWD_EMoflonEdge_5(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isAppropriate_FWD_EMoflonEdge_5(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSegment__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSegment__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSegment__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment)
	 * @generated
	 */
	EOperation getSegment__CheckDEC_FWD__Region_Segment();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRegion__IsAppropriate_FWD__Match_Region_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getRegion__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRegion__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRegion__RegisterObjectsToMatch_FWD__Match_Region_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRegion__IsAppropriate_solveCsp_FWD__Match_Region_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRegion__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRegion__IsApplicable_solveCsp_FWD__IsApplicableMatch_Region_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRegion__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getRegion__RegisterObjects_FWD__PerformRuleResult_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRegion__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isAppropriate_FWD_EMoflonEdge_6(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isAppropriate_FWD_EMoflonEdge_6(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getRegion__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getRegion__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRegion__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRegion__CheckDEC_FWD__Region_RailwayContainer();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSwitch__IsAppropriate_FWD__Match_Switch_RailwayContainer_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSwitch__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSwitch__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSwitch__RegisterObjectsToMatch_FWD__Match_Switch_RailwayContainer_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSwitch__IsAppropriate_solveCsp_FWD__Match_Switch_RailwayContainer_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSwitch__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet)
	 * @generated
	 */
	EOperation getSwitch__IsApplicable_solveCsp_FWD__IsApplicableMatch_Switch_PetriNet_RailwayContainer_Region_RailwayContainerToPetriNet();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSwitch__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSwitch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSwitch__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isAppropriate_FWD_EMoflonEdge_7(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isAppropriate_FWD_EMoflonEdge_7(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSwitch__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSwitch__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSwitch__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSwitch__CheckDEC_FWD__Switch_RailwayContainer_Region();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore
	 * @generated
	 */
	EClass getSemaphore();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSemaphore__IsAppropriate_FWD__Match_Semaphore_RailwayContainer_Segment_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSemaphore__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSemaphore__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSemaphore__RegisterObjectsToMatch_FWD__Match_Semaphore_RailwayContainer_Segment_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSemaphore__IsAppropriate_solveCsp_FWD__Match_Semaphore_RailwayContainer_Segment_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSemaphore__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSemaphore__IsApplicable_solveCsp_FWD__IsApplicableMatch_RailwayContainerToPetriNet_Semaphore_RailwayContainer_Segment_PetriNet_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSemaphore__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSemaphore__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSemaphore__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isAppropriate_FWD_EMoflonEdge_8(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isAppropriate_FWD_EMoflonEdge_8(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSemaphore__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSemaphore__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSemaphore__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSemaphore__CheckDEC_FWD__Semaphore_RailwayContainer_Segment_Region();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRoute__IsAppropriate_FWD__Match_Route_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getRoute__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRoute__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRoute__RegisterObjectsToMatch_FWD__Match_Route_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRoute__IsAppropriate_solveCsp_FWD__Match_Route_RailwayContainer();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRoute__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet)
	 * @generated
	 */
	EOperation getRoute__IsApplicable_solveCsp_FWD__IsApplicableMatch_PetriNet_Route_RailwayContainer_RailwayContainerToPetriNet();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRoute__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getRoute__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRoute__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isAppropriate_FWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isAppropriate_FWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getRoute__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getRoute__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRoute__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer)
	 * @generated
	 */
	EOperation getRoute__CheckDEC_FWD__Route_RailwayContainer();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSensor__IsAppropriate_FWD__Match_RailwayContainer_Sensor_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSensor__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSensor__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSensor__RegisterObjectsToMatch_FWD__Match_RailwayContainer_Sensor_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSensor__IsAppropriate_solveCsp_FWD__Match_RailwayContainer_Sensor_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSensor__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSensor__IsApplicable_solveCsp_FWD__IsApplicableMatch_PetriNet_RailwayContainer_RailwayContainerToPetriNet_Sensor_Region();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSensor__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSensor__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSensor__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isAppropriate_FWD_EMoflonEdge_10(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 10</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isAppropriate_FWD_EMoflonEdge_10(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSensor__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSensor__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSensor__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region)
	 * @generated
	 */
	EOperation getSensor__CheckDEC_FWD__RailwayContainer_Sensor_Region();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo <em>Track Element Connects To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Element Connects To</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo
	 * @generated
	 */
	EClass getTrackElementConnectsTo();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__IsAppropriate_FWD__Match_TrackElement_TrackElement();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__RegisterObjectsToMatch_FWD__Match_TrackElement_TrackElement();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__IsAppropriate_solveCsp_FWD__Match_TrackElement_TrackElement();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__IsApplicable_solveCsp_FWD__IsApplicableMatch_TrackElement_TrackElement();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__RegisterObjects_FWD__PerformRuleResult_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isAppropriate_FWD_EMoflonEdge_11(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 11</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isAppropriate_FWD_EMoflonEdge_11(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement)
	 * @generated
	 */
	EOperation getTrackElementConnectsTo__CheckDEC_FWD__TrackElement_TrackElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore <em>Required Entry Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Entry Semaphore</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore
	 * @generated
	 */
	EClass getRequiredEntrySemaphore();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isAppropriate_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__IsAppropriate_FWD__Match_RailwayContainer_Route_Semaphore();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__RegisterObjectsToMatch_FWD__Match_RailwayContainer_Route_Semaphore();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__IsAppropriate_solveCsp_FWD__Match_RailwayContainer_Route_Semaphore();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore, hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational, hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__IsApplicable_solveCsp_FWD__IsApplicableMatch_RouteToRepair_SemaphoreToOperational_Place_RailwayContainer_SemaphoreToFailed_Place_RouteToFailed_Place_Place_PetriNet_Route_RailwayContainerToPetriNet_Semaphore_RouteToOperational_Transition();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isAppropriate_FWD_EMoflonEdge_12(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 12</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isAppropriate_FWD_EMoflonEdge_12(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore#checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore)
	 * @generated
	 */
	EOperation getRequiredEntrySemaphore__CheckDEC_FWD__RailwayContainer_Route_Semaphore();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
