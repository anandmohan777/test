package com.hsbc.reverse.polishnotation.operation;

/**
 * Addition
 * @author shivamoberoi
 *
 */
public class Addition implements ArithmeticOperation {

	/**
	 * Addition to get the result of the popped values
	 */
	public int getResult(int pop1, int pop2) {
		return pop1 + pop2;
	}

}
