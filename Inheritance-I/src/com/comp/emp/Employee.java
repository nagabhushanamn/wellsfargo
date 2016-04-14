package com.comp.emp;

public class Employee {

	private int id;
	public String name;
	public double salary;
	public String address;

	public Employee(int id) {
		if (id > 0) {
			this.id = id;
		}
	}

	public int getId() {
		return id;
	}

}
