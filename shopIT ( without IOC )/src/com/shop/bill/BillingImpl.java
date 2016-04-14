package com.shop.bill;

import com.shop.pm.PriceMatrixImpl_v1;

/*
 * 
 * 
 *  design and performance issues
 *  -----------------------------
 *  
 *  --> tight-coupling
 *  --> too many dependencies created/destroyed
 *  --> unit-testing not possible
 *  
 *  why these issues ?
 *  
 *  dependent itself creating its own dependency.
 *  
 *  soln:
 *  
 *  dont create dependency in dependent's class , do lookup
 *  
 *  limitation on lookup:
 *  
 *  location tight-coupling
 *  
 *  best soln:
 *  
 *  dont create , dont lookup , get/inject by 'some-one' 
 *  
 *  this is called IOC ( Inversion Of Control )
 *  
 *  
 *  how to impleemnt IOC on dependent ?
 *  
 *  thru 'Dependency Injection' ( DI )
 *  
 *   types of DI
 *   
 *   --> constructor DI
 *   --> setter DI
 *   
 *   --------------------------------------
 *  
 *  
 *  
 */

public class BillingImpl {

	private PriceMatrixImpl_v1 priceMatrix;

	public double getTotalPrice(String[] cart) {

		double total = 0.0;
		priceMatrix = new PriceMatrixImpl_v1();

		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}

		return total;
	}

}
