package expression.extended.print.xtend;

import expression.Constant;
import expression.Expression;
import expression.Sum;
import expression.extended.print.xtend.PrintOperationXtend;
import expression_extended.Multiply;
import expression_extended.algebra.Expression_extendedAlgebra;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public interface ExpressionExtendedPrintXtend extends Expression_extendedAlgebra<PrintOperationXtend> {
  @Override
  public default PrintOperationXtend constant(final Constant const_) {
    final PrintOperationXtend _function = () -> {
      StringConcatenation _builder = new StringConcatenation();
      int _value = const_.getValue();
      _builder.append(_value, "");
      return _builder.toString();
    };
    return _function;
  }
  
  @Override
  public default PrintOperationXtend sum(final Sum sum) {
    final PrintOperationXtend _function = () -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      Expression _left = sum.getLeft();
      PrintOperationXtend _$ = this.$(_left);
      String _print = _$.print();
      _builder.append(_print, "");
      _builder.append(" + ");
      Expression _right = sum.getRight();
      PrintOperationXtend _$_1 = this.$(_right);
      String _print_1 = _$_1.print();
      _builder.append(_print_1, "");
      _builder.append(")");
      return _builder.toString();
    };
    return _function;
  }
  
  @Override
  public default PrintOperationXtend multiply(final Multiply multiply) {
    final PrintOperationXtend _function = () -> {
      StringConcatenation _builder = new StringConcatenation();
      Expression _left = multiply.getLeft();
      PrintOperationXtend _$ = this.$(_left);
      String _print = _$.print();
      _builder.append(_print, "");
      _builder.append(" * ");
      Expression _right = multiply.getRight();
      PrintOperationXtend _$_1 = this.$(_right);
      String _print_1 = _$_1.print();
      _builder.append(_print_1, "");
      return _builder.toString();
    };
    return _function;
  }
}
