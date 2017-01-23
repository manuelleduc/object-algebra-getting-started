package expression.extended.evaluate;

import expression.evaluate.EvaluateOperation;
import expression.evaluate.ExpressionEvaluate;
import expression_extended.Multiply;
import expression_extended.algebra.Expression_extendedAlgebra;

public interface ExpressionExtendedEvaluate extends ExpressionEvaluate, Expression_extendedAlgebra<EvaluateOperation> {

	@Override
	default EvaluateOperation multiply(Multiply multiply) {
		return new EvaluateOperation() {

			@Override
			public int evaluate() {
				return $(multiply.getLeft()).evaluate() * $(multiply.getRight()).evaluate();
			}
		};
	}

}
