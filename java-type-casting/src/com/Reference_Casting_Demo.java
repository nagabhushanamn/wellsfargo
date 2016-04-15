package com;

class V {

}

class B extends V {

}

class C extends V {

}

public class Reference_Casting_Demo {

	public static void main(String[] args) {

		// B b=new B();
		// C c = new C();

		// B b=new C(); //not possible

		// ---------------------------------------

		// V v = new B(); // implicit casting
		// v=new C();

		// ------------------------------------------

		V v = new C();

		if (v instanceof C) {
			C c = (C) v;
			System.out.println("Happy casting..");
		}else{
			System.out.println("cannot cast");
		}
	}

}
