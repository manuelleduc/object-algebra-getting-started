package expression.extended.print;

import expression.Add;
import expression.Constant;
import expression_extended.Multiply;
import expression_extended.algebra.Expression_extendedAlgebra;

public interface ExpressionExtendedPrint extends Expression_extendedAlgebra<PrintOperation> {

	@Override
	default PrintOperation constant(Constant constant) {
		return () -> String.valueOf(constant.getValue());
	}

	@Override
	default PrintOperation add(Add sum) {
		return () -> "(" + $(sum.getLeft()).print() + " + " + $(sum.getRight()).print() + ")";
	}

	@Override
	default PrintOperation multiply(Multiply multiply) {
		return () -> $(multiply.getLeft()).print() + " + " + $(multiply.getRight()).print();
	}

}
