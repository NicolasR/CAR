/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Condition;
import robot.Operation;
import robot.RobotPackage;
import robot.Whenever;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Whenever</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.WheneverImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link robot.impl.WheneverImpl#getWhenever <em>Whenever</em>}</li>
 *   <li>{@link robot.impl.WheneverImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WheneverImpl extends OperationImpl implements Whenever {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WheneverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.WHENEVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return (Condition)eGet(RobotPackage.Literals.WHENEVER__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		eSet(RobotPackage.Literals.WHENEVER__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getWhenever() {
		return (Operation)eGet(RobotPackage.Literals.WHENEVER__WHENEVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenever(Operation newWhenever) {
		eSet(RobotPackage.Literals.WHENEVER__WHENEVER, newWhenever);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getElse() {
		return (Operation)eGet(RobotPackage.Literals.WHENEVER__ELSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Operation newElse) {
		eSet(RobotPackage.Literals.WHENEVER__ELSE, newElse);
	}

	 /**
	* <!-- begin-user-doc -->
	* Code correspondant au whenever
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		String returnvalue = "";
	
		returnvalue += indent+"whenever"+this.getCondition().toUrbiString()+"\n";
		returnvalue += indent+"{\n";
		returnvalue += this.getWhenever().toUrbiString(indent+"\t")+"\n";
		returnvalue += indent+"}\n";
		if (this.getElse() != null)
		{
			returnvalue += indent+"else\n";
			returnvalue += indent+"{\n";
			returnvalue += this.getElse().toUrbiString(indent+"\t")+"\n";
			returnvalue += indent+"};";
		}
		return returnvalue;
	}
	
} //WheneverImpl
