/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robot.RobotFactory
 * @model kind="package"
 * @generated
 */
public interface RobotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://robot/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotPackage eINSTANCE = robot.impl.RobotPackageImpl.init();

	/**
	 * The meta object id for the '{@link robot.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.MissionImpl
	 * @see robot.impl.RobotPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link robot.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.OperationImpl
	 * @see robot.impl.RobotPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.SequenceImpl
	 * @see robot.impl.RobotPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OPERATIONS = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.MovementImpl <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.MovementImpl
	 * @see robot.impl.RobotPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT__DURATION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ForwardImpl
	 * @see robot.impl.RobotPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__DURATION = MOVEMENT__DURATION;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.BackwardImpl <em>Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.BackwardImpl
	 * @see robot.impl.RobotPackageImpl#getBackward()
	 * @generated
	 */
	int BACKWARD = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD__DURATION = MOVEMENT__DURATION;

	/**
	 * The number of structural features of the '<em>Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.TurnLeftImpl <em>Turn Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.TurnLeftImpl
	 * @see robot.impl.RobotPackageImpl#getTurnLeft()
	 * @generated
	 */
	int TURN_LEFT = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__DURATION = MOVEMENT__DURATION;

	/**
	 * The number of structural features of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.TurnRightImpl <em>Turn Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.TurnRightImpl
	 * @see robot.impl.RobotPackageImpl#getTurnRight()
	 * @generated
	 */
	int TURN_RIGHT = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT__DURATION = MOVEMENT__DURATION;

	/**
	 * The number of structural features of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.AlternativeImpl
	 * @see robot.impl.RobotPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 8;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CONSEQUENCE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ALTERNATIVE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CONDITION = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link robot.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.EventImpl
	 * @see robot.impl.RobotPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 9;

	/**
	 * The feature id for the '<em><b>At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onleave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ONLEAVE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONDITION = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link robot.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ConditionImpl
	 * @see robot.impl.RobotPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 10;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.impl.ValuesImpl <em>Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ValuesImpl
	 * @see robot.impl.RobotPackageImpl#getValues()
	 * @generated
	 */
	int VALUES = 11;

	/**
	 * The number of structural features of the '<em>Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.SensorImpl
	 * @see robot.impl.RobotPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.TIntegerImpl <em>TInteger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.TIntegerImpl
	 * @see robot.impl.RobotPackageImpl#getTInteger()
	 * @generated
	 */
	int TINTEGER = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGER__VALUE = VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TInteger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGER_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.TStringImpl <em>TString</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.TStringImpl
	 * @see robot.impl.RobotPackageImpl#getTString()
	 * @generated
	 */
	int TSTRING = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRING__VALUE = VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TString</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRING_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.TFloatImpl <em>TFloat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.TFloatImpl
	 * @see robot.impl.RobotPackageImpl#getTFloat()
	 * @generated
	 */
	int TFLOAT = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOAT__VALUE = VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TFloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOAT_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.TBooleanImpl <em>TBoolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.TBooleanImpl
	 * @see robot.impl.RobotPackageImpl#getTBoolean()
	 * @generated
	 */
	int TBOOLEAN = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOLEAN__VALUE = VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TBoolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOLEAN_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.OperatorImpl
	 * @see robot.impl.RobotPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link robot.impl.DifferentImpl <em>Different</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.DifferentImpl
	 * @see robot.impl.RobotPackageImpl#getDifferent()
	 * @generated
	 */
	int DIFFERENT = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT__TYPE = OPERATOR__TYPE;

	/**
	 * The number of structural features of the '<em>Different</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.EchoImpl <em>Echo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.EchoImpl
	 * @see robot.impl.RobotPackageImpl#getEcho()
	 * @generated
	 */
	int ECHO = 19;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHO__PARAM = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Echo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHO_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.VarImpl
	 * @see robot.impl.RobotPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__VALUE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__NAME = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link robot.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.VariableImpl
	 * @see robot.impl.RobotPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = VALUES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.StopImpl
	 * @see robot.impl.RobotPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 22;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__DURATION = MOVEMENT__DURATION;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.SleepImpl <em>Sleep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.SleepImpl
	 * @see robot.impl.RobotPackageImpl#getSleep()
	 * @generated
	 */
	int SLEEP = 23;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP__DURATION = MOVEMENT__DURATION;

	/**
	 * The number of structural features of the '<em>Sleep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLEEP_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.WheneverImpl <em>Whenever</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.WheneverImpl
	 * @see robot.impl.RobotPackageImpl#getWhenever()
	 * @generated
	 */
	int WHENEVER = 24;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHENEVER__CONDITION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Whenever</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHENEVER__WHENEVER = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHENEVER__ELSE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Whenever</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHENEVER_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link robot.impl.AffectationImpl <em>Affectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.AffectationImpl
	 * @see robot.impl.RobotPackageImpl#getAffectation()
	 * @generated
	 */
	int AFFECTATION = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__VALUE = VAR__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__NAME = VAR__NAME;

	/**
	 * The number of structural features of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_FEATURE_COUNT = VAR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.DeclarationImpl
	 * @see robot.impl.RobotPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__VALUE = VAR__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = VAR__NAME;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = VAR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.WhileImpl
	 * @see robot.impl.RobotPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 27;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__OPERATION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link robot.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.ValueImpl
	 * @see robot.impl.RobotPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 28;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VARIABLE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link robot.impl.CompareImpl <em>Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.impl.CompareImpl
	 * @see robot.impl.RobotPackageImpl#getCompare()
	 * @generated
	 */
	int COMPARE = 29;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__OPERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__CONDITION2 = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__CONDITION1 = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link robot.EOperator <em>EOperator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.EOperator
	 * @see robot.impl.RobotPackageImpl#getEOperator()
	 * @generated
	 */
	int EOPERATOR = 30;

	/**
	 * The meta object id for the '{@link robot.ESensor <em>ESensor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.ESensor
	 * @see robot.impl.RobotPackageImpl#getESensor()
	 * @generated
	 */
	int ESENSOR = 31;


	/**
	 * Returns the meta object for class '{@link robot.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see robot.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Mission#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see robot.Mission#getSequence()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Sequence();

	/**
	 * Returns the meta object for class '{@link robot.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see robot.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.Sequence#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see robot.Sequence#getOperations()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Operations();

	/**
	 * Returns the meta object for class '{@link robot.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see robot.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link robot.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement</em>'.
	 * @see robot.Movement
	 * @generated
	 */
	EClass getMovement();

	/**
	 * Returns the meta object for the attribute '{@link robot.Movement#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see robot.Movement#getDuration()
	 * @see #getMovement()
	 * @generated
	 */
	EAttribute getMovement_Duration();

	/**
	 * Returns the meta object for class '{@link robot.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see robot.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for class '{@link robot.Backward <em>Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backward</em>'.
	 * @see robot.Backward
	 * @generated
	 */
	EClass getBackward();

	/**
	 * Returns the meta object for class '{@link robot.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Left</em>'.
	 * @see robot.TurnLeft
	 * @generated
	 */
	EClass getTurnLeft();

	/**
	 * Returns the meta object for class '{@link robot.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Right</em>'.
	 * @see robot.TurnRight
	 * @generated
	 */
	EClass getTurnRight();

	/**
	 * Returns the meta object for class '{@link robot.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see robot.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Alternative#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consequence</em>'.
	 * @see robot.Alternative#getConsequence()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Consequence();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Alternative#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative</em>'.
	 * @see robot.Alternative#getAlternative()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Alternative();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Alternative#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robot.Alternative#getCondition()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Condition();

	/**
	 * Returns the meta object for class '{@link robot.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see robot.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Event#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>At</em>'.
	 * @see robot.Event#getAt()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_At();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Event#getOnleave <em>Onleave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Onleave</em>'.
	 * @see robot.Event#getOnleave()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Onleave();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Event#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robot.Event#getCondition()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Condition();

	/**
	 * Returns the meta object for class '{@link robot.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see robot.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link robot.Values <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Values</em>'.
	 * @see robot.Values
	 * @generated
	 */
	EClass getValues();

	/**
	 * Returns the meta object for class '{@link robot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see robot.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link robot.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robot.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for class '{@link robot.TInteger <em>TInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInteger</em>'.
	 * @see robot.TInteger
	 * @generated
	 */
	EClass getTInteger();

	/**
	 * Returns the meta object for the attribute '{@link robot.TInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robot.TInteger#getValue()
	 * @see #getTInteger()
	 * @generated
	 */
	EAttribute getTInteger_Value();

	/**
	 * Returns the meta object for class '{@link robot.TString <em>TString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TString</em>'.
	 * @see robot.TString
	 * @generated
	 */
	EClass getTString();

	/**
	 * Returns the meta object for the attribute '{@link robot.TString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robot.TString#getValue()
	 * @see #getTString()
	 * @generated
	 */
	EAttribute getTString_Value();

	/**
	 * Returns the meta object for class '{@link robot.TFloat <em>TFloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFloat</em>'.
	 * @see robot.TFloat
	 * @generated
	 */
	EClass getTFloat();

	/**
	 * Returns the meta object for the attribute '{@link robot.TFloat#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robot.TFloat#getValue()
	 * @see #getTFloat()
	 * @generated
	 */
	EAttribute getTFloat_Value();

	/**
	 * Returns the meta object for class '{@link robot.TBoolean <em>TBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBoolean</em>'.
	 * @see robot.TBoolean
	 * @generated
	 */
	EClass getTBoolean();

	/**
	 * Returns the meta object for the attribute '{@link robot.TBoolean#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robot.TBoolean#getValue()
	 * @see #getTBoolean()
	 * @generated
	 */
	EAttribute getTBoolean_Value();

	/**
	 * Returns the meta object for class '{@link robot.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see robot.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the attribute '{@link robot.Operator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see robot.Operator#getType()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Type();

	/**
	 * Returns the meta object for class '{@link robot.Different <em>Different</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Different</em>'.
	 * @see robot.Different
	 * @generated
	 */
	EClass getDifferent();

	/**
	 * Returns the meta object for class '{@link robot.Echo <em>Echo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Echo</em>'.
	 * @see robot.Echo
	 * @generated
	 */
	EClass getEcho();

	/**
	 * Returns the meta object for the attribute '{@link robot.Echo#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see robot.Echo#getParam()
	 * @see #getEcho()
	 * @generated
	 */
	EAttribute getEcho_Param();

	/**
	 * Returns the meta object for class '{@link robot.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see robot.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Var#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see robot.Var#getValue()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Value();

	/**
	 * Returns the meta object for the attribute '{@link robot.Var#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robot.Var#getName()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Name();

	/**
	 * Returns the meta object for class '{@link robot.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see robot.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link robot.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robot.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link robot.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see robot.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link robot.Sleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sleep</em>'.
	 * @see robot.Sleep
	 * @generated
	 */
	EClass getSleep();

	/**
	 * Returns the meta object for class '{@link robot.Whenever <em>Whenever</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Whenever</em>'.
	 * @see robot.Whenever
	 * @generated
	 */
	EClass getWhenever();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Whenever#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robot.Whenever#getCondition()
	 * @see #getWhenever()
	 * @generated
	 */
	EReference getWhenever_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Whenever#getWhenever <em>Whenever</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Whenever</em>'.
	 * @see robot.Whenever#getWhenever()
	 * @see #getWhenever()
	 * @generated
	 */
	EReference getWhenever_Whenever();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Whenever#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see robot.Whenever#getElse()
	 * @see #getWhenever()
	 * @generated
	 */
	EReference getWhenever_Else();

	/**
	 * Returns the meta object for class '{@link robot.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affectation</em>'.
	 * @see robot.Affectation
	 * @generated
	 */
	EClass getAffectation();

	/**
	 * Returns the meta object for class '{@link robot.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see robot.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for class '{@link robot.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see robot.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link robot.While#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see robot.While#getOperation()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link robot.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robot.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Condition();

	/**
	 * Returns the meta object for class '{@link robot.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see robot.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Value#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see robot.Value#getVariable()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Variable();

	/**
	 * Returns the meta object for class '{@link robot.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare</em>'.
	 * @see robot.Compare
	 * @generated
	 */
	EClass getCompare();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Compare#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see robot.Compare#getOperator()
	 * @see #getCompare()
	 * @generated
	 */
	EReference getCompare_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Compare#getCondition2 <em>Condition2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition2</em>'.
	 * @see robot.Compare#getCondition2()
	 * @see #getCompare()
	 * @generated
	 */
	EReference getCompare_Condition2();

	/**
	 * Returns the meta object for the containment reference '{@link robot.Compare#getCondition1 <em>Condition1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition1</em>'.
	 * @see robot.Compare#getCondition1()
	 * @see #getCompare()
	 * @generated
	 */
	EReference getCompare_Condition1();

	/**
	 * Returns the meta object for enum '{@link robot.EOperator <em>EOperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EOperator</em>'.
	 * @see robot.EOperator
	 * @generated
	 */
	EEnum getEOperator();

	/**
	 * Returns the meta object for enum '{@link robot.ESensor <em>ESensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESensor</em>'.
	 * @see robot.ESensor
	 * @generated
	 */
	EEnum getESensor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotFactory getRobotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robot.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.MissionImpl
		 * @see robot.impl.RobotPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__SEQUENCE = eINSTANCE.getMission_Sequence();

		/**
		 * The meta object literal for the '{@link robot.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.SequenceImpl
		 * @see robot.impl.RobotPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__OPERATIONS = eINSTANCE.getSequence_Operations();

		/**
		 * The meta object literal for the '{@link robot.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.OperationImpl
		 * @see robot.impl.RobotPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link robot.impl.MovementImpl <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.MovementImpl
		 * @see robot.impl.RobotPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVEMENT__DURATION = eINSTANCE.getMovement_Duration();

		/**
		 * The meta object literal for the '{@link robot.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ForwardImpl
		 * @see robot.impl.RobotPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '{@link robot.impl.BackwardImpl <em>Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.BackwardImpl
		 * @see robot.impl.RobotPackageImpl#getBackward()
		 * @generated
		 */
		EClass BACKWARD = eINSTANCE.getBackward();

		/**
		 * The meta object literal for the '{@link robot.impl.TurnLeftImpl <em>Turn Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.TurnLeftImpl
		 * @see robot.impl.RobotPackageImpl#getTurnLeft()
		 * @generated
		 */
		EClass TURN_LEFT = eINSTANCE.getTurnLeft();

		/**
		 * The meta object literal for the '{@link robot.impl.TurnRightImpl <em>Turn Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.TurnRightImpl
		 * @see robot.impl.RobotPackageImpl#getTurnRight()
		 * @generated
		 */
		EClass TURN_RIGHT = eINSTANCE.getTurnRight();

		/**
		 * The meta object literal for the '{@link robot.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.AlternativeImpl
		 * @see robot.impl.RobotPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Consequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__CONSEQUENCE = eINSTANCE.getAlternative_Consequence();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__ALTERNATIVE = eINSTANCE.getAlternative_Alternative();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__CONDITION = eINSTANCE.getAlternative_Condition();

		/**
		 * The meta object literal for the '{@link robot.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.EventImpl
		 * @see robot.impl.RobotPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__AT = eINSTANCE.getEvent_At();

		/**
		 * The meta object literal for the '<em><b>Onleave</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ONLEAVE = eINSTANCE.getEvent_Onleave();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONDITION = eINSTANCE.getEvent_Condition();

		/**
		 * The meta object literal for the '{@link robot.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ConditionImpl
		 * @see robot.impl.RobotPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link robot.impl.ValuesImpl <em>Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ValuesImpl
		 * @see robot.impl.RobotPackageImpl#getValues()
		 * @generated
		 */
		EClass VALUES = eINSTANCE.getValues();

		/**
		 * The meta object literal for the '{@link robot.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.SensorImpl
		 * @see robot.impl.RobotPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '{@link robot.impl.TIntegerImpl <em>TInteger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.TIntegerImpl
		 * @see robot.impl.RobotPackageImpl#getTInteger()
		 * @generated
		 */
		EClass TINTEGER = eINSTANCE.getTInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINTEGER__VALUE = eINSTANCE.getTInteger_Value();

		/**
		 * The meta object literal for the '{@link robot.impl.TStringImpl <em>TString</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.TStringImpl
		 * @see robot.impl.RobotPackageImpl#getTString()
		 * @generated
		 */
		EClass TSTRING = eINSTANCE.getTString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSTRING__VALUE = eINSTANCE.getTString_Value();

		/**
		 * The meta object literal for the '{@link robot.impl.TFloatImpl <em>TFloat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.TFloatImpl
		 * @see robot.impl.RobotPackageImpl#getTFloat()
		 * @generated
		 */
		EClass TFLOAT = eINSTANCE.getTFloat();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFLOAT__VALUE = eINSTANCE.getTFloat_Value();

		/**
		 * The meta object literal for the '{@link robot.impl.TBooleanImpl <em>TBoolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.TBooleanImpl
		 * @see robot.impl.RobotPackageImpl#getTBoolean()
		 * @generated
		 */
		EClass TBOOLEAN = eINSTANCE.getTBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBOOLEAN__VALUE = eINSTANCE.getTBoolean_Value();

		/**
		 * The meta object literal for the '{@link robot.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.OperatorImpl
		 * @see robot.impl.RobotPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__TYPE = eINSTANCE.getOperator_Type();

		/**
		 * The meta object literal for the '{@link robot.impl.DifferentImpl <em>Different</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.DifferentImpl
		 * @see robot.impl.RobotPackageImpl#getDifferent()
		 * @generated
		 */
		EClass DIFFERENT = eINSTANCE.getDifferent();

		/**
		 * The meta object literal for the '{@link robot.impl.EchoImpl <em>Echo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.EchoImpl
		 * @see robot.impl.RobotPackageImpl#getEcho()
		 * @generated
		 */
		EClass ECHO = eINSTANCE.getEcho();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECHO__PARAM = eINSTANCE.getEcho_Param();

		/**
		 * The meta object literal for the '{@link robot.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.VarImpl
		 * @see robot.impl.RobotPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__VALUE = eINSTANCE.getVar_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__NAME = eINSTANCE.getVar_Name();

		/**
		 * The meta object literal for the '{@link robot.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.VariableImpl
		 * @see robot.impl.RobotPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link robot.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.StopImpl
		 * @see robot.impl.RobotPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link robot.impl.SleepImpl <em>Sleep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.SleepImpl
		 * @see robot.impl.RobotPackageImpl#getSleep()
		 * @generated
		 */
		EClass SLEEP = eINSTANCE.getSleep();

		/**
		 * The meta object literal for the '{@link robot.impl.WheneverImpl <em>Whenever</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.WheneverImpl
		 * @see robot.impl.RobotPackageImpl#getWhenever()
		 * @generated
		 */
		EClass WHENEVER = eINSTANCE.getWhenever();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHENEVER__CONDITION = eINSTANCE.getWhenever_Condition();

		/**
		 * The meta object literal for the '<em><b>Whenever</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHENEVER__WHENEVER = eINSTANCE.getWhenever_Whenever();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHENEVER__ELSE = eINSTANCE.getWhenever_Else();

		/**
		 * The meta object literal for the '{@link robot.impl.AffectationImpl <em>Affectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.AffectationImpl
		 * @see robot.impl.RobotPackageImpl#getAffectation()
		 * @generated
		 */
		EClass AFFECTATION = eINSTANCE.getAffectation();

		/**
		 * The meta object literal for the '{@link robot.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.DeclarationImpl
		 * @see robot.impl.RobotPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link robot.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.WhileImpl
		 * @see robot.impl.RobotPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__OPERATION = eINSTANCE.getWhile_Operation();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

		/**
		 * The meta object literal for the '{@link robot.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.ValueImpl
		 * @see robot.impl.RobotPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__VARIABLE = eINSTANCE.getValue_Variable();

		/**
		 * The meta object literal for the '{@link robot.impl.CompareImpl <em>Compare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.impl.CompareImpl
		 * @see robot.impl.RobotPackageImpl#getCompare()
		 * @generated
		 */
		EClass COMPARE = eINSTANCE.getCompare();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE__OPERATOR = eINSTANCE.getCompare_Operator();

		/**
		 * The meta object literal for the '<em><b>Condition2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE__CONDITION2 = eINSTANCE.getCompare_Condition2();

		/**
		 * The meta object literal for the '<em><b>Condition1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE__CONDITION1 = eINSTANCE.getCompare_Condition1();

		/**
		 * The meta object literal for the '{@link robot.EOperator <em>EOperator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.EOperator
		 * @see robot.impl.RobotPackageImpl#getEOperator()
		 * @generated
		 */
		EEnum EOPERATOR = eINSTANCE.getEOperator();

		/**
		 * The meta object literal for the '{@link robot.ESensor <em>ESensor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.ESensor
		 * @see robot.impl.RobotPackageImpl#getESensor()
		 * @generated
		 */
		EEnum ESENSOR = eINSTANCE.getESensor();

	}

} //RobotPackage
