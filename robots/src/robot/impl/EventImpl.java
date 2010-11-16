/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Condition;
import robot.Event;
import robot.Operation;
import robot.RobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.EventImpl#getAt <em>At</em>}</li>
 *   <li>{@link robot.impl.EventImpl#getOnleave <em>Onleave</em>}</li>
 *   <li>{@link robot.impl.EventImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link robot.impl.EventImpl#getWhenever <em>Whenever</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends OperationImpl implements Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getAt() {
		return (Operation)eGet(RobotPackage.Literals.EVENT__AT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAt(Operation newAt) {
		eSet(RobotPackage.Literals.EVENT__AT, newAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOnleave() {
		return (Operation)eGet(RobotPackage.Literals.EVENT__ONLEAVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnleave(Operation newOnleave) {
		eSet(RobotPackage.Literals.EVENT__ONLEAVE, newOnleave);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return (Condition)eGet(RobotPackage.Literals.EVENT__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		eSet(RobotPackage.Literals.EVENT__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getWhenever() {
		return (Operation)eGet(RobotPackage.Literals.EVENT__WHENEVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenever(Operation newWhenever) {
		eSet(RobotPackage.Literals.EVENT__WHENEVER, newWhenever);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		String returnvalue = "";
	
		returnvalue += indent+"at("+this.getCondition().toUrbiString()+")\n";
		returnvalue += indent+"{\n";
		returnvalue += this.getAt().toUrbiString(indent+"\t")+"\n";
		returnvalue += indent+"}\n";
		returnvalue += indent+"onleave\n";
		returnvalue += indent+"{\n";
		returnvalue += this.getOnleave().toUrbiString(indent+"\t")+"\n";
		returnvalue += indent+"};";
		return returnvalue;
	}

} //EventImpl
