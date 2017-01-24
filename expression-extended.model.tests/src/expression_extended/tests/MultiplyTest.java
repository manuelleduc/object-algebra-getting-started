/**
 */
package expression_extended.tests;

import expression.tests.ExpressionTest;
import expression_extended.Expression_extendedFactory;
import expression_extended.Multiply;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiply</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiplyTest extends ExpressionTest {

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
	 * Returns the fixture for this Multiply test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Multiply getFixture() {
		return (Multiply)fixture;
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
