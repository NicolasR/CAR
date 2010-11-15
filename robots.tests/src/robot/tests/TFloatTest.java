/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.tests;

import junit.textui.TestRunner;

import robot.RobotFactory;
import robot.TFloat;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TFloat</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TFloatTest extends ValuesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TFloatTest.class);
	}

	/**
	 * Constructs a new TFloat test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFloatTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TFloat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TFloat getFixture() {
		return (TFloat)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotFactory.eINSTANCE.createTFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TFloatTest
