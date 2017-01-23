package expression.evaluate;

import expression.*;
import expression.algebra.ExpressionAlgebra;

public interface ExpressionEvaluate extends ExpressionAlgebra<EvaluateOperation> {

	@Override
	default EvaluateOperation constant(final Constant constant) {
		return new EvaluateOperation() {
			@Override
			public int evaluate() {
				return constant.getValue();
			}
		};
	}

	@Override
	default EvaluateOperation sum(final Sum sum) {
		return new EvaluateOperation() {

			@Override
			public int evaluate() {
				return $(sum.getLeft()).evaluate() + $(sum.getRight()).evaluate();
			}
		};
	}

}
