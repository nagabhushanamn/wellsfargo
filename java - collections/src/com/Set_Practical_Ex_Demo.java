package com;

import java.util.HashSet;
import java.util.Set;

import com.model.Product;

public class Set_Practical_Ex_Demo {

	public static void main(String[] args) {

		Product product1 = new Product(23424, "laptop", 198000);
		Product product2 = new Product(57474, "mobile", 25000);
		Product product3 = new Product(13423, "laptop", 98000);
		Product product4 = new Product(34635, "apple", 1000);
		Product product5 = new Product(34635, "apple", 1000);

		// ----------------------------------------------------------

		// Set<Product> products = new TreeSet<>();
		Set<Product> products = new HashSet<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);

		// ------------------------------------------------------------

		display(products);
		System.out.println();

	}

	private static void display(Set<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
