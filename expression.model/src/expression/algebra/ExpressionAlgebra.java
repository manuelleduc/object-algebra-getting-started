package expression.algebra;

import expression.Add;
import expression.Constant;
import expression.Expression;

public interface ExpressionAlgebra<A> {

	A constant(final Constant constant);

	A add(final Add sum);

	default A $(final Expression expression) {
		if (expression instanceof Constant) {
			return this.constant((Constant) expression);
		} else if (expression instanceof Add) {
			return this.add((Add) expression);
		} else {
			throw new RuntimeException("Unknow Expression " + expression);
		}
	}
}