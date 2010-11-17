/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Backward;
import robot.RobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Backward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BackwardImpl extends MovementImpl implements Backward {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.BACKWARD;
	}

	 /**
	* <!-- begin-user-doc -->
	* Code correspondant au mouvement Backward
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		String returnvalue = "";
		float time = this.getDuration();

		returnvalue += indent+"robot.backward();";
		if (time > 0)
		{
			returnvalue += "\n" + indent+"sleep("+time+");\n";
			returnvalue += indent+"robot.wheels.speed = 0;\n";
		}
		return returnvalue;
	}
} //BackwardImpl
