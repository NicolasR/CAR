/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.ESensor;
import robot.RobotPackage;
import robot.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.SensorImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends ValuesImpl implements Sensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESensor getName() {
		return (ESensor)eGet(RobotPackage.Literals.SENSOR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(ESensor newName) {
		eSet(RobotPackage.Literals.SENSOR__NAME, newName);
	}

	 /**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString() {
		String returnvalue = "";
		ESensor sensor = this.getName();
		if (sensor == ESensor.DISTANCE_FLF)
			returnvalue = "distanceFLF.val";
		else if (sensor == ESensor.DISTANCE_FRF)
			returnvalue = "distanceFRF.val";
	
		return returnvalue;
	}


} //SensorImpl
