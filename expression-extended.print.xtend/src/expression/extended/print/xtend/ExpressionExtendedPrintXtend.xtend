package expression.extended.print.xtend

import expression.Add
import expression.Constant
import expression_extended.Multiply
import expression_extended.algebra.Expression_extendedAlgebra

interface ExpressionExtendedPrintXtend extends Expression_extendedAlgebra<PrintOperationXtend> {
	override def constant(Constant const) {
		['''«const.value»''']
	}

	override def add(Add sum) {
		['''(«$(sum.left).print» + «$(sum.right).print»)''']
	}

	override def multiply(Multiply multiply) {
		['''«$(multiply.left).print» * «$(multiply.right).print»''']
	}
}
