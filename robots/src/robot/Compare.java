/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Compare#getOperator <em>Operator</em>}</li>
 *   <li>{@link robot.Compare#getCondition2 <em>Condition2</em>}</li>
 *   <li>{@link robot.Compare#getCondition1 <em>Condition1</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getCompare()
 * @model
 * @generated
 */
public interface Compare extends Condition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Operator)
	 * @see robot.RobotPackage#getCompare_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link robot.Compare#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Condition2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition2</em>' containment reference.
	 * @see #setCondition2(Condition)
	 * @see robot.RobotPackage#getCompare_Condition2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition2();

	/**
	 * Sets the value of the '{@link robot.Compare#getCondition2 <em>Condition2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition2</em>' containment reference.
	 * @see #getCondition2()
	 * @generated
	 */
	void setCondition2(Condition value);

	/**
	 * Returns the value of the '<em><b>Condition1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition1</em>' containment reference.
	 * @see #setCondition1(Condition)
	 * @see robot.RobotPackage#getCompare_Condition1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition1();

	/**
	 * Sets the value of the '{@link robot.Compare#getCondition1 <em>Condition1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition1</em>' containment reference.
	 * @see #getCondition1()
	 * @generated
	 */
	void setCondition1(Condition value);

} // Compare
