package com.hsbc.reverse.polishnotation.operation;

import com.hsbc.reverse.polishnotation.operators.ArithmeticOperators;
/**
 * Factory To delegate to new child operator classes.
 * @author shivamoberoi
 *
 */
public class OperationFactory {

	public ArithmeticOperation getOperator(String operator) {
		if (operator == null) {
			return null;
		}

		if (operator.equals(ArithmeticOperators.ADD.value())) {
			return new Addition();
		}

		else if (operator.equals(ArithmeticOperators.SUB.value())) {
			return new Subtraction();
		}

		else if (operator.equals(ArithmeticOperators.MUL.value())) {
			return null;
		} else if (operator.equals(ArithmeticOperators.DIV.value())) {
			return null;
		}
		return null;
	}

}
