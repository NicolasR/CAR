/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.RobotPackage;
import robot.TurnRight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TurnRightImpl extends MovementImpl implements TurnRight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnRightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.TURN_RIGHT;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		String returnvalue = "";
		float time = this.getDuration();
		if (time > 0)
		{
			returnvalue = indent+"sleep("+time+");\n";
		}
		returnvalue += indent+"robot.turnRight();";
		return returnvalue;
	}
} //TurnRightImpl
