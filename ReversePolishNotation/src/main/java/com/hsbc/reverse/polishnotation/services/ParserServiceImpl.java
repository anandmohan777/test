package com.hsbc.reverse.polishnotation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.hsbc.reverse.polishnotation.operation.ArithmeticOperation;
import com.hsbc.reverse.polishnotation.operation.OperationFactory;
import com.hsbc.reverse.polishnotation.operators.ArithmeticOperators;

/**
 * Service to handle to reverse polish notation
 * 
 * @author shivamoberoi
 *
 */
public class ParserServiceImpl implements ParserService {

	@Override
	/**
	 * Method to evaluate the Reverse Polish Notation
	 * @input- input String to be evaluated
	 */
	public int evaluateNotation(String input) {
		int result = 0;
		Stack<String> stack = new Stack<>();

		List<String> list = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			list.add(String.valueOf(input.charAt(i)));
		}

		for (String value : list) {
			if (!ArithmeticOperators.getByValue(value)) {
				stack.push(value);
			} else {
				
				if(stack.size() <2){
					return -1;
				}
				
				OperationFactory operatorFactory = new OperationFactory();
				ArithmeticOperation operation = operatorFactory
						.getOperator(value);
				if (operation != null) {
					int pop1 = Integer.valueOf(stack.pop());
					int pop2 = Integer.valueOf(stack.pop());

					Integer index = operation.getResult(pop1, pop2);
					stack.push(String.valueOf(index));
				}
			}
		}
		result = Integer.valueOf(stack.pop());
		if (stack.size() > 0) {
			result = -1;
		}

		return result;

	}
}
