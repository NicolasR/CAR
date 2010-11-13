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
	 * @generated NOT
	 */
	public String toString() {
		String returnvalue = "";
		
		returnvalue += "at("+this.getCondition().toString()+")\n";
		returnvalue += "{\n";
		returnvalue += this.getAt().toString()+"\n";
		returnvalue += "}\n";
		returnvalue += "onleave\n";
		returnvalue += "{\n";
		returnvalue += this.getOnleave().toString()+"\n";
		returnvalue += "};\n";
		return returnvalue;
	}
} //EventImpl
