/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.RobotPackage;
import robot.Sleep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sleep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SleepImpl extends MovementImpl implements Sleep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SleepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.SLEEP;
	}
	/**
	* <!-- begin-user-doc -->
	* Code correspondant au mouvement Sleep
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		String returnvalue = "";
		float time = this.getDuration();
		returnvalue += indent + "sleep(" + time + ");\n";
		return returnvalue;
	}
} //SleepImpl
