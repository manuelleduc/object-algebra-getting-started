package expression.extended.print.xtend

import expression_extended.algebra.Expression_extendedAlgebra
import expression.Constant
import expression.Sum
import expression_extended.Multiply

interface ExpressionExtendedPrintXtend extends Expression_extendedAlgebra<PrintOperationXtend> {
	override def constant(Constant const) {
		['''«const.value»''']
	}

	override def sum(Sum sum) {
		['''(«$(sum.left).print» + «$(sum.right).print»)''']
	}

	override def multiply(Multiply multiply) {
		['''«$(multiply.left).print» * «$(multiply.right).print»''']
	}
}
