package com.ex;

class Employee {
	public void doWork() {
		System.out.println("work...");
	}
}

public class Try_Catch_Syntax_Demo {

	public static void main(String[] args) {

		System.out.println("A");
		try {

			System.out.println("B");
			int ari = 1 / 1;

			int[] arr = { 1, 2, 3 };
			System.out.println(arr[1]);

			Employee e = null;
			e.doWork();

			System.out.println("C");

		}
		// catch (ArithmeticException ae) {
		// System.out.println("D");
		// System.out.println("Arith Ex-" + ae.getMessage());
		// } catch (ArrayIndexOutOfBoundsException aioobe) {
		// System.out.println("Array Ex-" + aioobe.getMessage());
		// }
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Ex-" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ex -" + e.getMessage());
		}

		System.out.println("E");
	}

}
