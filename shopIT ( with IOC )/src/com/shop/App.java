package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// init

		// 'some-one' / component manager / container

		PriceMatrix priceMatrixV1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrixImpl_v2();
		Billing billComp = new BillingImpl(priceMatrixV1);

		// use
		String[] cart = { "3435", "23423" };
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println(totalPrice);

		// destroy
		// ...
	}

}
