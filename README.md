# Object Algebra: Getting Started
A simple guide to deal with Object Algebras and EMF

## Definition of the initial meta-model

![expression model](./figures/expression.png)

1. Defining a ecore model ([expression.ecore](./expression.model/model/expression.ecore))
2. Generating the EMF Java sources from the model
3. Generating the algebra from the model (right click on the .ecore file -> Object Algebra -> Generate Object Algebra)

The result is an interface defining the abstract object algebra.

For every element with no parent (with an implicit single inheritance to EObject), a type parameter is generated. Here `A` is generated for Expression and its hierarchy.

```java
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
```

## Definition of a first semantic: Evaluate

![First semantic](./figures/first-semantic.dot.png)

Definition of a concret interface of the abstract type `A`.

```java
package expression.evaluate;

public interface EvaluateOperation {
	int evaluate();
}
```

Integration of the `EvaluateOperation` on an implementation of the abstract algebra.
Each element of the mete-model must return an implementation of the concrete semantic of the object algebra, modelized by an interface.

In order to step into the semantic of a related part of the model, the `$` method is used.

For instance l.24 the `sum` semantic delegates the evaluation of the `left` and `right` sub-part of the expression the each of them respectively and then proceed to the sum of both results.

```java
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
```



## Extension of the original model

In this part we'll add a multiplication expression :

 ![expression extended model](./figures/expression_extended.png)

The exact same steps are needed to generate the EMF and Object Algebra source code. The resulting java source should looks like this :

```java
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
```

Inheritance to the cross-referenced original model is deal with by the object algebra generator.

## Definition of the second semantic

![Second semantic](./figures/extended-semantic.dot.png)

The new semantic is going to reuse everything we defined previously as is. The only thing needed is the definition of the semantic of the `Multiply` operation.

```java
package expression.extended.evaluate;

import expression.evaluate.EvaluateOperation;
import expression.evaluate.ExpressionEvaluate;
import expression_extended.Multiply;
import expression_extended.algebra.Expression_extendedAlgebra;

public interface ExpressionExtendedEvaluate extends ExpressionEvaluate, Expression_extendedAlgebra<EvaluateOperation> {

	@Override
	default EvaluateOperation multiply(Multiply multiply) {
		return new EvaluateOperation() {

			@Override
			public int evaluate() {
				return $(multiply.getLeft()).evaluate() * $(multiply.getRight()).evaluate();
			}
		};
	}
}
```

## Definition of a second semantic: Print

Here is an example of the integration of a second operation `print`. Following what we have done so far, the operation of straightforward, we just have to define a new kind of operation with the `PrintOperation` interface and inherits from our algebra.

You can also observe that even if we have defined our semantic using the "extended" model, we are still able to use our semantic with a model defined using only elements from our first model. 

```java
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
```

