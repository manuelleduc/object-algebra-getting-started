/**
 */
package expression_extended.tests;

import expression_extended.Expression_extendedFactory;
import expression_extended.Multiply;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiply</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiplyTest extends TestCase {

	/**
	 * The fixture for this Multiply test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Multiply fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiplyTest.class);
	}

	/**
	 * Constructs a new Multiply test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Multiply test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Multiply fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Multiply test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Multiply getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Expression_extendedFactory.eINSTANCE.createMultiply());
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

} //MultiplyTest
