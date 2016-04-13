package com;

import com.car.Car;
import com.ceat.wheel.CEATWheel;
import com.emp.Employee;
import com.mrf.wheel.MRFWheel;

import p1.A;
import p1.B;
import p1.C;
import p2.D;
import p2.E;

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// A a=new A();
		// a.aMethod();

		// B b = new B();
		// b.bMethod();

		// C c = new C();
		// c.cMethod();

		// D d = new D();
		// d.dMethod();

		// E e = new E();
		// e.eMethod();

		// -----------------------------------------

		Employee employee = new Employee(123);
		// employee.salary=1000.00;
		employee.setSalary(1000);
		// employee.bonus=employee.salary*0.2;

		// -------------------------------------------

		// employee.id=0; // un-expected assign

		// employee.bonus=10000.00;

		// --------------------------------------------

		//
		// System.out.println(employee.id);
		// System.out.println(employee.salary);
		// System.out.println(employee.bonus);

		// System.out.println(employee.getId());
		// System.out.println(employee.getSalary() + "-->"
		// +employee.getBonus());

		// -------------------------------------------------------------------------

		MRFWheel mrfWheel = new MRFWheel();
		CEATWheel ceatWheel = new CEATWheel();

		Car car = new Car();
		//car.setWheel(mrfWheel);
		car.setWheel(ceatWheel);

		car.move();

	}

}
