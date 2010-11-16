/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.While#getCondition <em>Condition</em>}</li>
 *   <li>{@link robot.While#getConsequence <em>Consequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Operation {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see robot.RobotPackage#getWhile_Condition()
	 * @model required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link robot.While#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' reference.
	 * @see #setConsequence(Operation)
	 * @see robot.RobotPackage#getWhile_Consequence()
	 * @model required="true"
	 * @generated
	 */
	Operation getConsequence();

	/**
	 * Sets the value of the '{@link robot.While#getConsequence <em>Consequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' reference.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(Operation value);

} // While
