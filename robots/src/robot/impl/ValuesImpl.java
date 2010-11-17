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
import robot.TBoolean;
import robot.TFloat;
import robot.TInteger;
import robot.TString;
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
	* Code correspondant aux valeurs
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(){
		String retour = "";
		if (this instanceof TInteger)
		{
			TInteger value = (TInteger)this;
			retour = value.getValue().toString();
		}
		else if (this instanceof TFloat)
		{
			TFloat value = (TFloat)this;
			retour = Float.toString(value.getValue());
		}
		else if (this instanceof TString)
		{
			TString value = (TString)this;
			retour = value.getValue();
		}
		else if (this instanceof TBoolean)
		{
			TBoolean value = ((TBoolean)this);
			retour = Boolean.toString(value.getValue());
		}
		else if (this instanceof robot.Sensor)
		retour = ((robot.Sensor)this).toString();
		return retour;
	}
} //ValuesImpl
