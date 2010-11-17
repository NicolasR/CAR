/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Compare;
import robot.Condition;
import robot.Operator;
import robot.RobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.CompareImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link robot.impl.CompareImpl#getCondition2 <em>Condition2</em>}</li>
 *   <li>{@link robot.impl.CompareImpl#getCondition1 <em>Condition1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareImpl extends ConditionImpl implements Compare {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.COMPARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return (Operator)eGet(RobotPackage.Literals.COMPARE__OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		eSet(RobotPackage.Literals.COMPARE__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition2() {
		return (Condition)eGet(RobotPackage.Literals.COMPARE__CONDITION2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition2(Condition newCondition2) {
		eSet(RobotPackage.Literals.COMPARE__CONDITION2, newCondition2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition1() {
		return (Condition)eGet(RobotPackage.Literals.COMPARE__CONDITION1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition1(Condition newCondition1) {
		eSet(RobotPackage.Literals.COMPARE__CONDITION1, newCondition1);
	}
	
	/**
	* <!-- begin-user-doc -->
	* Code correspondant a une comparaison
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString() {
		String returnvalue = "";
		
		returnvalue += "(";
		returnvalue += this.getCondition1().toUrbiString() + " " + this.getOperator().toUrbiString() + " " +this.getCondition2().toUrbiString();
		returnvalue +=")";
		return returnvalue;
	}

} //CompareImpl
