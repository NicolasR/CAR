/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Echo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Echo#getParam <em>Param</em>}</li>
 *   <li>{@link robot.Echo#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getEcho()
 * @model
 * @generated
 */
public interface Echo extends Operation {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' attribute.
	 * @see #setParam(String)
	 * @see robot.RobotPackage#getEcho_Param()
	 * @model
	 * @generated
	 */
	String getParam();

	/**
	 * Sets the value of the '{@link robot.Echo#getParam <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' attribute.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(String value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Operation)
	 * @see robot.RobotPackage#getEcho_EReference0()
	 * @model
	 * @generated
	 */
	Operation getEReference0();

	/**
	 * Sets the value of the '{@link robot.Echo#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Operation value);

} // Echo
