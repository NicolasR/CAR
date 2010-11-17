/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Forward;
import robot.RobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ForwardImpl extends MovementImpl implements Forward {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.FORWARD;
	}

	 /**
	* <!-- begin-user-doc -->
	* Code correspondant au mouvement Forward
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		String returnvalue = "";
		float time = this.getDuration();

		returnvalue += indent+"robot.forward();";
		if (time > 0)
		{
			returnvalue += "\n" + indent+"sleep("+time+");\n";
			returnvalue += indent+"robot.wheels.speed = 0;\n";
		}
		return returnvalue;
	}
} //ForwardImpl
