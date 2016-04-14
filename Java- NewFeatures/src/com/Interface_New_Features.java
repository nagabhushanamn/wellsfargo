package com;

// JDK 1.8

interface I {

	void a();

	public default void b() {
		System.out.println("this is b()");
	}

	public static void sta() {
		System.out.println("sta..");
	}
}

class C implements I {
	@Override
	public void a() {
		System.out.println("..");
	}
}

public class Interface_New_Features {

	public static void main(String[] args) {

		C c = new C();
		c.b();
		
		I.sta();
	}

}
