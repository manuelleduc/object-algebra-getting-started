package expression.evaluate.xtend

import expression.Add
import expression.Constant
import expression.algebra.ExpressionAlgebra

interface ExpressionEvaluateXtend extends ExpressionAlgebra<EvaluateOperationXtend> {
	override def constant(Constant constant) {
		[constant.value]
	}

	override def add(Add sum) {
		[$(sum.left).evaluate + $(sum.right).evaluate]
	}
}
