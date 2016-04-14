package com;

class Employee {

	static int helloCount = 0; // class var

	String name;
	// int helloCount = 0; // object var

	public void sayHello() {

		// int helloCount = 0; // local var
		helloCount++;
		System.out.println(this.name + " - hello " + helloCount);

	}
}

public class Var_Scope_Demo {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Nag";
		Employee e2 = new Employee();
		e2.name = "Ria";

		e1.sayHello();
		e1.sayHello();

		e2.sayHello();

	}

}
