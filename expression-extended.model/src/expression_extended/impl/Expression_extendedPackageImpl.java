/**
 */
package expression_extended.impl;

import expression.ExpressionPackage;
import expression.impl.ExpressionPackageImpl;
import expression_extended.Expression_extendedFactory;
import expression_extended.Expression_extendedPackage;
import expression_extended.Multiply;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Expression_extendedPackageImpl extends EPackageImpl implements Expression_extendedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see expression_extended.Expression_extendedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Expression_extendedPackageImpl() {
		super(eNS_URI, Expression_extendedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Expression_extendedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Expression_extendedPackage init() {
		if (isInited) return (Expression_extendedPackage)EPackage.Registry.INSTANCE.getEPackage(Expression_extendedPackage.eNS_URI);

		// Obtain or create and register package
		Expression_extendedPackageImpl theExpression_extendedPackage = (Expression_extendedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Expression_extendedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Expression_extendedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theExpression_extendedPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theExpression_extendedPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpression_extendedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Expression_extendedPackage.eNS_URI, theExpression_extendedPackage);
		return theExpression_extendedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiply() {
		return multiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiply_Right() {
		return (EReference)multiplyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiply_Left() {
		return (EReference)multiplyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_extendedFactory getExpression_extendedFactory() {
		return (Expression_extendedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		multiplyEClass = createEClass(MULTIPLY);
		createEReference(multiplyEClass, MULTIPLY__RIGHT);
		createEReference(multiplyEClass, MULTIPLY__LEFT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multiplyEClass.getESuperTypes().add(theExpressionPackage.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(multiplyEClass, Multiply.class, "Multiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiply_Right(), theExpressionPackage.getExpression(), null, "right", null, 1, 1, Multiply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiply_Left(), theExpressionPackage.getExpression(), null, "left", null, 1, 1, Multiply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Expression_extendedPackageImpl
