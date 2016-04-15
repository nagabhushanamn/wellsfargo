package com.ex;

class InvalidInputException extends RuntimeException {

	public InvalidInputException(String string) {
		super(string);
	}

}

// =================================================

class Module1 {

	public void doSomething(String inp) {
		if (inp.isEmpty() || inp == null) {
			throw new InvalidInputException("invalid string");
		}
	}

}

// =================================================

class Module2 {

	public void doConversion() {
		Module1 teamC = new Module1();
		teamC.doSomething("nag");
	}

}

public class UnChecked_Exception_Demo {

	public static void main(String[] args) {

		try {
			Module2 module2 = new Module2();
			module2.doConversion();
		} catch (InvalidInputException iie) {
			iie.printStackTrace();
		}

	}

}
