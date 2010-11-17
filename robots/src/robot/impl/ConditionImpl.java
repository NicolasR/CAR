/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import robot.Compare;
import robot.Condition;
import robot.RobotPackage;
import robot.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends CDOObjectImpl implements Condition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.CONDITION;
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
	* Code correspondant a une valeur dans une condition
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString() {
		if (this instanceof Value)
			return ((Value)this).toUrbiString();
		else if (this instanceof Compare)
			return ((Compare)this).toUrbiString();
		else
			return "//Not implemented yet";
	}
} //ConditionImpl
