package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init
		BillingImpl billComp = new BillingImpl();

		// use
		String[] cart = { "3435", "23423" };
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println(totalPrice);

		// destroy
		// ...
	}

}
