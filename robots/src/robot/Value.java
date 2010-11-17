/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Value#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends Condition {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Values)
	 * @see robot.RobotPackage#getValue_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Values getVariable();

	/**
	 * Sets the value of the '{@link robot.Value#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Values value);

} // Value
