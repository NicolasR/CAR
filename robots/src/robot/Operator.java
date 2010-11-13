/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Operator#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getOperator()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Operator extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link robot.EOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see robot.EOperator
	 * @see #setType(EOperator)
	 * @see robot.RobotPackage#getOperator_Type()
	 * @model
	 * @generated
	 */
	EOperator getType();

	/**
	 * Sets the value of the '{@link robot.Operator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see robot.EOperator
	 * @see #getType()
	 * @generated
	 */
	void setType(EOperator value);

} // Operator
