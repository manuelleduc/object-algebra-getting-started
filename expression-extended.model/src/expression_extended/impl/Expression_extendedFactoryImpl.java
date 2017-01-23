/**
 */
package expression_extended.impl;

import expression_extended.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Expression_extendedFactoryImpl extends EFactoryImpl implements Expression_extendedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Expression_extendedFactory init() {
		try {
			Expression_extendedFactory theExpression_extendedFactory = (Expression_extendedFactory)EPackage.Registry.INSTANCE.getEFactory(Expression_extendedPackage.eNS_URI);
			if (theExpression_extendedFactory != null) {
				return theExpression_extendedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Expression_extendedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_extendedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Expression_extendedPackage.MULTIPLY: return createMultiply();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiply createMultiply() {
		MultiplyImpl multiply = new MultiplyImpl();
		return multiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_extendedPackage getExpression_extendedPackage() {
		return (Expression_extendedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Expression_extendedPackage getPackage() {
		return Expression_extendedPackage.eINSTANCE;
	}

} //Expression_extendedFactoryImpl
