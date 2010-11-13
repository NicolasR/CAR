/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Echo;
import robot.Operation;
import robot.RobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Echo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.EchoImpl#getParam <em>Param</em>}</li>
 *   <li>{@link robot.impl.EchoImpl#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EchoImpl extends OperationImpl implements Echo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EchoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.ECHO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParam() {
		return (String)eGet(RobotPackage.Literals.ECHO__PARAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(String newParam) {
		eSet(RobotPackage.Literals.ECHO__PARAM, newParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getEReference0() {
		return (Operation)eGet(RobotPackage.Literals.ECHO__EREFERENCE0, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(Operation newEReference0) {
		eSet(RobotPackage.Literals.ECHO__EREFERENCE0, newEReference0);
	}

} //EchoImpl
