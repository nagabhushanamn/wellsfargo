package com.ex;

import java.io.FileNotFoundException;
import java.io.FileReader;

class InvalidStringException extends Exception {

	public InvalidStringException(String message) {
		super(message);
	}
}

// =================================================

class TeamA_Module {

	public String doSomething(String inp) throws InvalidStringException {
		if (inp.isEmpty()) {
			throw new InvalidStringException("empty string");
		}
		String resp = inp.toUpperCase();
		return resp;
	}

}

// =================================================

class TeamB_Module {

	public void doConversion() {
		String s = "nag";
		TeamA_Module teamA = new TeamA_Module();
		String result = null;
		try {
			result = teamA.doSomething(s);
		} catch (InvalidStringException e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}

}

public class Checked_Exception_Demo {

	public static void main(String[] args) {

		TeamB_Module teamB = new TeamB_Module();

		teamB.doConversion();

		// -------------------------------

		// try {
		// FileReader fr = new FileReader("somefile.txt");
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

}
