/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Alternative#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link robot.Alternative#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link robot.Alternative#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends Operation {
	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' containment reference.
	 * @see #setConsequence(Operation)
	 * @see robot.RobotPackage#getAlternative_Consequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getConsequence();

	/**
	 * Sets the value of the '{@link robot.Alternative#getConsequence <em>Consequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' containment reference.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(Operation value);

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference.
	 * @see #setAlternative(Operation)
	 * @see robot.RobotPackage#getAlternative_Alternative()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getAlternative();

	/**
	 * Sets the value of the '{@link robot.Alternative#getAlternative <em>Alternative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative</em>' containment reference.
	 * @see #getAlternative()
	 * @generated
	 */
	void setAlternative(Operation value);

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
	 * @see robot.RobotPackage#getAlternative_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link robot.Alternative#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Alternative
