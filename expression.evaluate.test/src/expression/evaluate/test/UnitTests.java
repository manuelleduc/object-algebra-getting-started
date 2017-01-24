package expression.evaluate.test;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Assert;
import org.junit.Test;

import expression.Expression;
import expression.ExpressionPackage;
import expression.evaluate.ExpressionEvaluate;

public class UnitTests {

	@Test
	public void constTest() {
		final String model = "Const10.expression";

		final Expression expression = this.getExpression(model);

//		ExpressionEvaluate algebra = new ExpressionEvaluate() {
//		};

//		int result = algebra.$(expression).evaluate();

//		Assert.assertEquals(10, result);

	}

	private Expression getExpression(String modelName) {
		final ResourceSetImpl resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("expression", new XMIResourceFactoryImpl());
		final ExpressionPackage fsmPackage = ExpressionPackage.eINSTANCE;
		// TODO: Replacing with System.getProperty("user.dir")
		final URI createURI = URI
				.createURI("/home/mleduc/dev/ecore/object-algebra-getting-started/expression.evaluate.test/model/" + modelName);
		final Resource resource = resSet.getResource(createURI, true);
		final EList<EObject> contents = resource.getContents();
		return (Expression) contents.get(0);
	}
}
