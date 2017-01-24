package expression_extended.algebra;

import expression.Expression;
import expression.algebra.ExpressionAlgebra;
import expression_extended.Multiply;

public interface Expression_extendedAlgebra<A> extends ExpressionAlgebra<A> {

	A multiply(final Multiply multiply);

	default A $(final Expression expression) {
		if (expression instanceof Multiply) {
			return this.multiply((Multiply) expression);
		} else {
			return ExpressionAlgebra.super.$(expression);
		}
	}
}