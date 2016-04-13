package com.em.vendor;

import com.em.emp.Employee;

public class Alchemy {

	public static void manageEmployees() {

		// create employees

		Employee.trName = "Nag";

		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "A";

		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "B";

		// train and make them listen and work
		Employee.doTng();

		e1.doListenAndWork();
		e2.doListenAndWork();

	}

}
