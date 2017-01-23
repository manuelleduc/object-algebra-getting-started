package expression.algebra;

import expression.Constant;
import expression.Expression;
import expression.Sum;

public interface ExpressionAlgebra<A> {

	A constant(final Constant constant);

	A sum(final Sum sum);

	public default A $(final Expression expression) {
		final A ret;
		if (expression.eClass().getName().equals("Constant")) {
			ret = this.constant((Constant) expression);
		} else if (expression.eClass().getName().equals("Sum")) {
			ret = this.sum((Sum) expression);
		} else {
			throw new RuntimeException("Unknow Expression " + expression);
		}
		return ret;
	}
}