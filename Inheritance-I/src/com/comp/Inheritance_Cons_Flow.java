package com.comp;

class A extends Object {
	public A(int a) {
		super();
		System.out.println("im A()");
	}
	public A() {
		// TODO Auto-generated constructor stub
	}
}

class B extends A {
	public B(int a) {
		super(a);
		System.out.println("im B()");
	}
}

class C extends B {
	public C(int a) {
		super(a);
		System.out.println("im C()");
	}
}

public class Inheritance_Cons_Flow {

	public static void main(String[] args) {

		C c = new C(12);

	}

}
