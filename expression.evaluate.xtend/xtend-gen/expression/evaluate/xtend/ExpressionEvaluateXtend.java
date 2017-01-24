package expression.evaluate.xtend;

import expression.Constant;
import expression.Expression;
import expression.Sum;
import expression.algebra.ExpressionAlgebra;
import expression.evaluate.xtend.EvaluateOperationXtend;

@SuppressWarnings("all")
public interface ExpressionEvaluateXtend extends ExpressionAlgebra<EvaluateOperationXtend> {
  @Override
  public default EvaluateOperationXtend constant(final Constant constant) {
    final EvaluateOperationXtend _function = () -> {
      return constant.getValue();
    };
    return _function;
  }
  
  @Override
  public default EvaluateOperationXtend sum(final Sum sum) {
    final EvaluateOperationXtend _function = () -> {
      Expression _left = sum.getLeft();
      EvaluateOperationXtend _$ = this.$(_left);
      int _evaluate = _$.evaluate();
      Expression _right = sum.getRight();
      EvaluateOperationXtend _$_1 = this.$(_right);
      int _evaluate_1 = _$_1.evaluate();
      return (_evaluate + _evaluate_1);
    };
    return _function;
  }
}
