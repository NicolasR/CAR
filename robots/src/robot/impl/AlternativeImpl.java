/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Alternative;
import robot.Condition;
import robot.Operation;
import robot.RobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.AlternativeImpl#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link robot.impl.AlternativeImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link robot.impl.AlternativeImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeImpl extends OperationImpl implements Alternative {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getConsequence() {
		return (Operation)eGet(RobotPackage.Literals.ALTERNATIVE__CONSEQUENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequence(Operation newConsequence) {
		eSet(RobotPackage.Literals.ALTERNATIVE__CONSEQUENCE, newConsequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getAlternative() {
		return (Operation)eGet(RobotPackage.Literals.ALTERNATIVE__ALTERNATIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternative(Operation newAlternative) {
		eSet(RobotPackage.Literals.ALTERNATIVE__ALTERNATIVE, newAlternative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return (Condition)eGet(RobotPackage.Literals.ALTERNATIVE__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		eSet(RobotPackage.Literals.ALTERNATIVE__CONDITION, newCondition);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Code correspondant à l'alternative
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toUrbiString(String indent) {
		 String returnvalue = "";

		 returnvalue += indent+"if("+this.getCondition().toUrbiString()+")\n";
		 returnvalue += indent+"{\n";
		 returnvalue += this.getConsequence().toUrbiString(indent+"\t")+"\n";
		 returnvalue += indent+"}\n";
		 returnvalue += indent+"else\n";
		 returnvalue += this.getAlternative().toUrbiString(indent+"\t")+"\n";
		 return returnvalue;
	}

} //AlternativeImpl
