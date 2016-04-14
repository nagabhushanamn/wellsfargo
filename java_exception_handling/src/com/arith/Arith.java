package com.arith;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Num-1");
		int num1 = sc.nextInt();
		System.out.println("Enter Num-1");
		int num2 = sc.nextInt();

		System.out.println("1.Add");

		System.out.println("2.Sub");

		try {

			System.out.println("3.Div");
			int divRes = num1 / num2;
			
		} catch (ArithmeticException ae) {
			
			// handling
			
			/*
			 *  --> report to end-user with friendly message
			 *  --> log
			 *  --> re-throw to other module.
			 * 
			 *  --> rollback prev action.
			 *  
			 *  --> release used resources
			 */
			
			System.out.println("Ex-"+ae.getMessage());
		}

		System.out.println("4.Mul");

		System.out.println("Happy Arith");

		sc.close();

	}

}
