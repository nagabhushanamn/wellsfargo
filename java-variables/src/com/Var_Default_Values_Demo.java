package com;

/*
 * 
 * default values for static/instance var when they are not initialized
 * 
 * 
 * integral  --> 0
 * real      --> 0.0
 * char      --> \u0000
 * boolean   --> false
 * 
 * reference --> null
 * 
 *   imp note : local-var must initialized before use them.
 * 
 */

class Abc {
	static int staVar;
	int insVar;

	void m() {
		int localVar = 0;
		System.out.println(localVar);
	}
}

public class Var_Default_Values_Demo {

	public static void main(String[] args) {

		System.out.println(Abc.staVar);

		Abc abc = new Abc();
		System.out.println(abc.insVar);

	}

}
