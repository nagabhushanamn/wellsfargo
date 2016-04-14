package com;

class Mobile {
	public void call() {
		System.out.println("calling..");
	}
}

class Person {

	Mobile mobile = null;

	public void doCall() {
		mobile.call();
	}
}

public class Reference_Var_Demo {
	public static void main(String[] args) {

		Person person = new Person();
		person.mobile = new Mobile();
		person.doCall();

	}
}
