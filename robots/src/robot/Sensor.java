/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link robot.Sensor#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see robot.RobotPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Values {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link robot.ESensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see robot.ESensor
	 * @see #setName(ESensor)
	 * @see robot.RobotPackage#getSensor_Name()
	 * @model
	 * @generated
	 */
	ESensor getName();

	/**
	 * Sets the value of the '{@link robot.Sensor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see robot.ESensor
	 * @see #getName()
	 * @generated
	 */
	void setName(ESensor value);

} // Sensor
