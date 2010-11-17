/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Event#getAt <em>At</em>}</li>
 *   <li>{@link robot.Event#getOnleave <em>Onleave</em>}</li>
 *   <li>{@link robot.Event#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Operation {
	/**
	 * Returns the value of the '<em><b>At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At</em>' containment reference.
	 * @see #setAt(Operation)
	 * @see robot.RobotPackage#getEvent_At()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getAt();

	/**
	 * Sets the value of the '{@link robot.Event#getAt <em>At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At</em>' containment reference.
	 * @see #getAt()
	 * @generated
	 */
	void setAt(Operation value);

	/**
	 * Returns the value of the '<em><b>Onleave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onleave</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onleave</em>' containment reference.
	 * @see #setOnleave(Operation)
	 * @see robot.RobotPackage#getEvent_Onleave()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOnleave();

	/**
	 * Sets the value of the '{@link robot.Event#getOnleave <em>Onleave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onleave</em>' containment reference.
	 * @see #getOnleave()
	 * @generated
	 */
	void setOnleave(Operation value);

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
	 * @see robot.RobotPackage#getEvent_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link robot.Event#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Event
