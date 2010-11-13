/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESensor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see robot.RobotPackage#getESensor()
 * @model
 * @generated
 */
public enum ESensor implements Enumerator {
	/**
	 * The '<em><b>Distance FLF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_FLF_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_FLF(0, "distanceFLF", "distanceFLF"),

	/**
	 * The '<em><b>Distance FRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_FRF_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE_FRF(1, "distanceFRF", "distanceFRF");

	/**
	 * The '<em><b>Distance FLF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distance FLF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_FLF
	 * @model name="distanceFLF"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_FLF_VALUE = 0;

	/**
	 * The '<em><b>Distance FRF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distance FRF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_FRF
	 * @model name="distanceFRF"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_FRF_VALUE = 1;

	/**
	 * An array of all the '<em><b>ESensor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESensor[] VALUES_ARRAY =
		new ESensor[] {
			DISTANCE_FLF,
			DISTANCE_FRF,
		};

	/**
	 * A public read-only list of all the '<em><b>ESensor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ESensor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESensor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESensor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESensor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESensor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESensor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESensor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESensor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESensor get(int value) {
		switch (value) {
			case DISTANCE_FLF_VALUE: return DISTANCE_FLF;
			case DISTANCE_FRF_VALUE: return DISTANCE_FRF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ESensor(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ESensor
