/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robot.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robot.RobotPackage
 * @generated
 */
public class RobotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RobotPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotSwitch<Adapter> modelSwitch =
		new RobotSwitch<Adapter>() {
			@Override
			public Adapter caseMission(Mission object) {
				return createMissionAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseMovement(Movement object) {
				return createMovementAdapter();
			}
			@Override
			public Adapter caseForward(Forward object) {
				return createForwardAdapter();
			}
			@Override
			public Adapter caseBackward(Backward object) {
				return createBackwardAdapter();
			}
			@Override
			public Adapter caseTurnLeft(TurnLeft object) {
				return createTurnLeftAdapter();
			}
			@Override
			public Adapter caseTurnRight(TurnRight object) {
				return createTurnRightAdapter();
			}
			@Override
			public Adapter caseAlternative(Alternative object) {
				return createAlternativeAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseValues(Values object) {
				return createValuesAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseTInteger(TInteger object) {
				return createTIntegerAdapter();
			}
			@Override
			public Adapter caseTString(TString object) {
				return createTStringAdapter();
			}
			@Override
			public Adapter caseTFloat(TFloat object) {
				return createTFloatAdapter();
			}
			@Override
			public Adapter caseTBoolean(TBoolean object) {
				return createTBooleanAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseDifferent(Different object) {
				return createDifferentAdapter();
			}
			@Override
			public Adapter caseEcho(Echo object) {
				return createEchoAdapter();
			}
			@Override
			public Adapter caseVar(Var object) {
				return createVarAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter caseSleep(Sleep object) {
				return createSleepAdapter();
			}
			@Override
			public Adapter caseWhenever(Whenever object) {
				return createWheneverAdapter();
			}
			@Override
			public Adapter caseAffectation(Affectation object) {
				return createAffectationAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseCompare(Compare object) {
				return createCompareAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link robot.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Movement
	 * @generated
	 */
	public Adapter createMovementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Forward
	 * @generated
	 */
	public Adapter createForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Backward <em>Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Backward
	 * @generated
	 */
	public Adapter createBackwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.TurnLeft
	 * @generated
	 */
	public Adapter createTurnLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.TurnRight
	 * @generated
	 */
	public Adapter createTurnRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Values <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Values
	 * @generated
	 */
	public Adapter createValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.TInteger <em>TInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.TInteger
	 * @generated
	 */
	public Adapter createTIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.TString <em>TString</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.TString
	 * @generated
	 */
	public Adapter createTStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.TFloat <em>TFloat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.TFloat
	 * @generated
	 */
	public Adapter createTFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.TBoolean <em>TBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.TBoolean
	 * @generated
	 */
	public Adapter createTBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Different <em>Different</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Different
	 * @generated
	 */
	public Adapter createDifferentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Echo <em>Echo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Echo
	 * @generated
	 */
	public Adapter createEchoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Var
	 * @generated
	 */
	public Adapter createVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Sleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Sleep
	 * @generated
	 */
	public Adapter createSleepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Whenever <em>Whenever</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Whenever
	 * @generated
	 */
	public Adapter createWheneverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Affectation
	 * @generated
	 */
	public Adapter createAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robot.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robot.Compare
	 * @generated
	 */
	public Adapter createCompareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RobotAdapterFactory
