/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import robot.Condition;
import robot.Operator;
import robot.RobotPackage;
import robot.Values;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.ConditionImpl#getAND <em>AND</em>}</li>
 *   <li>{@link robot.impl.ConditionImpl#getOR <em>OR</em>}</li>
 *   <li>{@link robot.impl.ConditionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link robot.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends CDOObjectImpl implements Condition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getAND() {
		return (Condition)eGet(RobotPackage.Literals.CONDITION__AND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAND(Condition newAND) {
		eSet(RobotPackage.Literals.CONDITION__AND, newAND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getOR() {
		return (Condition)eGet(RobotPackage.Literals.CONDITION__OR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOR(Condition newOR) {
		eSet(RobotPackage.Literals.CONDITION__OR, newOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Values> getVariable() {
		return (EList<Values>)eGet(RobotPackage.Literals.CONDITION__VARIABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return (Operator)eGet(RobotPackage.Literals.CONDITION__OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		eSet(RobotPackage.Literals.CONDITION__OPERATOR, newOperator);
	}

	 /**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString() {
		String returnvalue = "";

		EList<Values> listVariable = this.getVariable();
		returnvalue += listVariable.get(0).toUrbiString()+" "+this.getOperator().toUrbiString()+" "+listVariable.get(1).toUrbiString();
		Condition ORCondition = this.getOR();
		Condition ANDCondition = this.getAND();

		if (ORCondition != null)
		{
			returnvalue += " || "+ORCondition.toUrbiString();
		}
		if (ANDCondition != null)
		{
			returnvalue += " && "+ANDCondition.toUrbiString();
		}
	
		return returnvalue;
	}
} //ConditionImpl
