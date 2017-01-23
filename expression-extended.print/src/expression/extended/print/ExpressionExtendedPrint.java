package expression.extended.print;

import java.text.MessageFormat;

import expression.Constant;
import expression.Sum;
import expression_extended.Multiply;
import expression_extended.algebra.Expression_extendedAlgebra;

public interface ExpressionExtendedPrint extends Expression_extendedAlgebra<PrintOperation> {

	@Override
	default PrintOperation constant(Constant constant) {
		return () -> String.valueOf(constant.getValue());
	}

	@Override
	default PrintOperation sum(Sum sum) {
		return () -> MessageFormat.format("({0} + {1})", $(sum.getLeft()).print(), $(sum.getRight()).print());
	}

	@Override
	default PrintOperation multiply(Multiply multiply) {
		return () -> MessageFormat.format("{0} * {1}", $(multiply.getLeft()).print(), $(multiply.getRight()).print());
	}

}
