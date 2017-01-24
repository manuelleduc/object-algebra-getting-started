package expression.evaluate.xtend.test

import expression.Expression
import expression.ExpressionPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Test

import static org.junit.Assert.*

class UnitTests {

	@Test
	def void testConst10() throws Exception{

		val expr = loadModel("Const10.expr")
		assertEquals(10, 11)

	}

	def Expression loadModel(String model) {
		val set = new ResourceSetImpl
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("expr", new XMIResourceFactoryImpl)
		ExpressionPackage.eINSTANCE.eClass()

		val uri = URI.createPlatformResourceURI("/expression.evaluate.xtend.test/model/" + model, true)
		print(uri)
		val res = set.getResource(uri, true)

		res.contents.head as Expression
	}

}
