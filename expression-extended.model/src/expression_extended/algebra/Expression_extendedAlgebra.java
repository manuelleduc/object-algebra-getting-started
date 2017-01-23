package expression_extended.algebra;

import expression.Expression;
import expression.algebra.ExpressionAlgebra;
import expression_extended.Multiply;

public interface Expression_extendedAlgebra<A> extends ExpressionAlgebra<A> {

	A multiply(final Multiply multiply);

	public default A $(final Expression expression) {
		final A ret;
		if (expression.eClass().getName().equals("Multiply")) {
			ret = this.multiply((Multiply) expression);
		} else {
			ret = ExpressionAlgebra.super.$(expression);
		}
		return ret;
	}
}