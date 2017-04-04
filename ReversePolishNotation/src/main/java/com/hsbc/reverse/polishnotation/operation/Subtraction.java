package com.hsbc.reverse.polishnotation.operation;

/**
 * Subtraction
 * @author shivamoberoi
 *
 */
public class Subtraction implements ArithmeticOperation {

	@Override
	public int getResult(int pop1, int pop2) {
		return pop1 - pop2;
	}

}
