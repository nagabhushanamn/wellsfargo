package com;

public class Primitive_Casting_Demo {

	public static void main(String[] args) {

		// byte b = 100;
		// int i = b; // (implicit)
		//
		// b = (byte) i; // explicit

		// ---------------------------------

		// int i = 456;
		// byte b = (byte) i;
		//
		// System.out.println(b);

		// ----------------------------------

		// short b=65;
		// char c=(char)b;
		// System.out.println(c);
		//
		// b=(short)c;
		// System.out.println(b);

		// -----------------------------------

		for (int i = 0; i < 256; i++) {
			System.out.println(i + "->" + (char) i);
		}

	}

}
