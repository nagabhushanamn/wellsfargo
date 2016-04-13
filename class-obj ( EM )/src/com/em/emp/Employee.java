// package declaration
package com.em.emp;

// import statement(s)

// public class
public class Employee {

	// variable(s)

	// a. class var
	public static final String COMP_NAME = "MY_COMPANY";
	public static String trName;

	// b. obj/instance var
	public int id;
	public String name;

	// constructor(s)
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// method(s)

	// a. class method
	public static void doTng() {
		System.out.println("Employee.doTng()");
	}

	// b. obj method
	public void doListenAndWork() {
		System.out.println(this.name + "-doListenAndWork()");
	}

	// Inner-class

}

// default class(s)
class Abc {

}
