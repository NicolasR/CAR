/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.RobotPackage;
import robot.TFloat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFloat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.TFloatImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TFloatImpl extends ValuesImpl implements TFloat {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFloatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.TFLOAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getValue() {
		return (Float)eGet(RobotPackage.Literals.TFLOAT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Float newValue) {
		eSet(RobotPackage.Literals.TFLOAT__VALUE, newValue);
	}

} //TFloatImpl
