package com;

class Super {
	public void abc() {
		System.out.println("Super.abc()");
	}
}

class Sub extends Super {

	@Override
	public void abc() {
		System.out.println("Sub.abc()");
	}
}

class Abc {

	@SuppressWarnings("unused")
	public void m() {
		int a;
	}

	@Deprecated
	public void v1() {
		System.out.println("v1()");
	}

	public void v2() {
		System.out.println("v1()");
	}
}

public class Annotation_Demo {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.abc();

		Abc abc = new Abc();
		abc.v1();
	}

}
