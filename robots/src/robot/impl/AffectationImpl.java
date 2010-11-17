/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Affectation;
import robot.RobotPackage;
import robot.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AffectationImpl extends VarImpl implements Affectation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.AFFECTATION;
	}

	/**
	* <!-- begin-user-doc -->
	* Affectation de variable
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		 String returnvalue = "";

		 Var variable = (Var) this;
		 String value = variable.getValue().toUrbiString();
		 returnvalue = indent + variable.getName()+" = "+value+";";

		 return returnvalue;
	}
	
} //AffectationImpl
