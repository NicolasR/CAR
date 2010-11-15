/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.tests;

import junit.textui.TestRunner;

import robot.RobotFactory;
import robot.TInteger;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TInteger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TIntegerTest extends ValuesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TIntegerTest.class);
	}

	/**
	 * Constructs a new TInteger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIntegerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TInteger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TInteger getFixture() {
		return (TInteger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RobotFactory.eINSTANCE.createTInteger());
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

} //TIntegerTest
