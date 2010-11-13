/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Sequence#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Operation {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link robot.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see robot.RobotPackage#getSequence_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Sequence
