/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.RobotPackage;
import robot.Stop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StopImpl extends MovementImpl implements Stop {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.STOP;
	}
	
	/**
	* <!-- begin-user-doc -->
	* Code correspondant au mouvement Stop
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		String returnvalue = "";
		float time = this.getDuration();

		returnvalue += indent+"robot.wheels.speed = 0;";
		if (time > 0)
		{
			returnvalue += "\n" + indent+"sleep("+time+");\n";
		}
		return returnvalue;
	}
} //StopImpl
