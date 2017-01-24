package expression.evaluate.xtend

import expression.Constant
import expression.Sum
import expression.algebra.ExpressionAlgebra

interface ExpressionEvaluateXtend extends ExpressionAlgebra<EvaluateOperationXtend> {
	override def constant(Constant constant) {
		[constant.value]
	}

	override def sum(Sum sum) {
		[$(sum.left).evaluate + $(sum.right).evaluate]
	}
}
