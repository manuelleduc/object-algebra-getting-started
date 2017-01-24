package expression.extended.evaluate.xtend;

import expression.Expression;
import expression.evaluate.xtend.EvaluateOperationXtend;
import expression.evaluate.xtend.ExpressionEvaluateXtend;
import expression_extended.Multiply;
import expression_extended.algebra.Expression_extendedAlgebra;

@SuppressWarnings("all")
public interface ExpressionExtendedEvaluateXtend extends ExpressionEvaluateXtend, Expression_extendedAlgebra<EvaluateOperationXtend> {
  @Override
  public default EvaluateOperationXtend multiply(final Multiply multiply) {
    final EvaluateOperationXtend _function = () -> {
      Expression _left = multiply.getLeft();
      EvaluateOperationXtend _$ = this.$(_left);
      int _evaluate = _$.evaluate();
      Expression _right = multiply.getRight();
      EvaluateOperationXtend _$_1 = this.$(_right);
      int _evaluate_1 = _$_1.evaluate();
      return (_evaluate * _evaluate_1);
    };
    return _function;
  }
}
