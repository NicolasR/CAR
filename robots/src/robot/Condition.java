/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Condition#getAND <em>AND</em>}</li>
 *   <li>{@link robot.Condition#getOR <em>OR</em>}</li>
 *   <li>{@link robot.Condition#getVariable <em>Variable</em>}</li>
 *   <li>{@link robot.Condition#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getCondition()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Condition extends CDOObject {
	/**
	 * Returns the value of the '<em><b>AND</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AND</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AND</em>' containment reference.
	 * @see #setAND(Condition)
	 * @see robot.RobotPackage#getCondition_AND()
	 * @model containment="true"
	 * @generated
	 */
	Condition getAND();

	/**
	 * Sets the value of the '{@link robot.Condition#getAND <em>AND</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AND</em>' containment reference.
	 * @see #getAND()
	 * @generated
	 */
	void setAND(Condition value);

	/**
	 * Returns the value of the '<em><b>OR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OR</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OR</em>' containment reference.
	 * @see #setOR(Condition)
	 * @see robot.RobotPackage#getCondition_OR()
	 * @model containment="true"
	 * @generated
	 */
	Condition getOR();

	/**
	 * Sets the value of the '{@link robot.Condition#getOR <em>OR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OR</em>' containment reference.
	 * @see #getOR()
	 * @generated
	 */
	void setOR(Condition value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link robot.Values}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see robot.RobotPackage#getCondition_Variable()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Values> getVariable();

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
	 * @see robot.RobotPackage#getCondition_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link robot.Condition#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	String toUrbiString();

} // Condition
