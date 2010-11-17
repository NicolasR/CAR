/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Declaration;
import robot.RobotPackage;
import robot.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeclarationImpl extends VarImpl implements Declaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.DECLARATION;
	}
	
	/**
	* <!-- begin-user-doc -->
	* Code correspondant à une déclaration de Variable
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		 String returnvalue = "";

		 Var variable = (Var) this;
		 String value = variable.getValue().toUrbiString();
		 returnvalue = indent + "var "+variable.getName()+" = "+value+";";

		 return returnvalue;
	}


} //DeclarationImpl
