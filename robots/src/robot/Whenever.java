/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Whenever</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Whenever#getCondition <em>Condition</em>}</li>
 *   <li>{@link robot.Whenever#getWhenever <em>Whenever</em>}</li>
 *   <li>{@link robot.Whenever#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getWhenever()
 * @model
 * @generated
 */
public interface Whenever extends Operation {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see robot.RobotPackage#getWhenever_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link robot.Whenever#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Whenever</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whenever</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whenever</em>' containment reference.
	 * @see #setWhenever(Operation)
	 * @see robot.RobotPackage#getWhenever_Whenever()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getWhenever();

	/**
	 * Sets the value of the '{@link robot.Whenever#getWhenever <em>Whenever</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whenever</em>' containment reference.
	 * @see #getWhenever()
	 * @generated
	 */
	void setWhenever(Operation value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(Operation)
	 * @see robot.RobotPackage#getWhenever_Else()
	 * @model
	 * @generated
	 */
	Operation getElse();

	/**
	 * Sets the value of the '{@link robot.Whenever#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Operation value);

} // Whenever
