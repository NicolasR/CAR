/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.RobotPackage;
import robot.TurnLeft;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn Left</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TurnLeftImpl extends MovementImpl implements TurnLeft {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnLeftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.TURN_LEFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		String returnvalue = "";
		float time = this.getDuration();
		if (time > 0)
		{
			returnvalue = "sleep("+time+");\n";
		}
		returnvalue += "robot.turnLeft();";
		return returnvalue;
	}
}
