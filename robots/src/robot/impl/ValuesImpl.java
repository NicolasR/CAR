/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import robot.RobotPackage;
import robot.Values;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ValuesImpl extends CDOObjectImpl implements Values {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString(){
		String retour = "";
		if (this instanceof robot.Integer)
		{
			robot.Integer value = (robot.Integer)this;
			retour = value.getValue().toString();
		}
		else if (this instanceof robot.Float)
		{
			robot.Float value = (robot.Float)this;
			retour = Float.toString(value.getValue());
		}
		else if (this instanceof robot.String)
		{
			robot.String value = (robot.String)this;
			retour = value.toString();
		}
		else if (this instanceof robot.Sensor)
			retour = ((robot.Sensor)this).toString();
		return retour;
	}

} //ValuesImpl
