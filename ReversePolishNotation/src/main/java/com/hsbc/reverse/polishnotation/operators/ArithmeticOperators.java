package com.hsbc.reverse.polishnotation.operators;

public enum ArithmeticOperators {
	ADD("+"), SUB("-"), DIV("/"), MUL("*");

	private String value;

	ArithmeticOperators(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

	public static boolean getByValue(String val) {
		for (ArithmeticOperators operator : values()) {
			if (operator.value.equals(val)) {
				return true;
			}
		}
		return false;
	}
}
