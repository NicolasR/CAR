/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.RobotPackage;
import robot.TBoolean;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TBoolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.TBooleanImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TBooleanImpl extends ValuesImpl implements TBoolean {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.TBOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getValue() {
		return (Boolean)eGet(RobotPackage.Literals.TBOOLEAN__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Boolean newValue) {
		eSet(RobotPackage.Literals.TBOOLEAN__VALUE, newValue);
	}

} //TBooleanImpl
