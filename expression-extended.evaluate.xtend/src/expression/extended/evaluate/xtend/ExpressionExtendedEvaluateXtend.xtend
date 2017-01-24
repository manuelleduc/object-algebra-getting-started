package expression.extended.evaluate.xtend

import expression.evaluate.xtend.EvaluateOperationXtend
import expression.evaluate.xtend.ExpressionEvaluateXtend
import expression_extended.algebra.Expression_extendedAlgebra
import expression_extended.Multiply

interface ExpressionExtendedEvaluateXtend extends ExpressionEvaluateXtend, Expression_extendedAlgebra<EvaluateOperationXtend> {
	override def multiply(Multiply multiply) {
		[$(multiply.left).evaluate * $(multiply.right).evaluate]
	}
}
