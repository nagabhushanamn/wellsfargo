package com;

// from JSK 1.5

enum Gender {

	MALE(10), FEMALE(20);

	int val;

	Gender(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

}

class Employee {

	private int id;
	String name;
	Gender gender;

	public Employee(int id, String name, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

}

public class Enum_Demo {

	public static void main(String[] args) {

		Employee e1 = new Employee(4234, "Nag", Gender.MALE);

		System.out.println(Gender.MALE.getVal());
		System.out.println(Gender.FEMALE.getVal());

	}

}
