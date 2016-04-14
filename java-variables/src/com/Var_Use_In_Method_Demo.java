package com;


/*
 * 
 * imp note : static method cannot refeer non-sattic members directly,
 * need obj's reference
 * 
 */
class Xyz {

	static int staVar = 1;
	int insVar;

	static void staMethod(Xyz xyz) {
		System.out.println(staVar);
		System.out.println(xyz.insVar);
	}

	void insMethod() {
		System.out.println(staVar);
		System.out.println(insVar);
	}

}

public class Var_Use_In_Method_Demo {

	public static void main(String[] args) {

		Xyz xyz1 = new Xyz();
		xyz1.insVar = 100;
		xyz1.insMethod();

		System.out.println();

		Xyz xyz2 = new Xyz();
		xyz2.insVar = 200;
		xyz2.insMethod();

		System.out.println();

		Xyz.staMethod(xyz1);

	}

}
