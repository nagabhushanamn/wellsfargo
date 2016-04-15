package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.model.Product;

public class List_Practical_Ex_Demo {

	public static void main(String[] args) {

		Product product1 = new Product(23424, "laptop", 198000);
		Product product2 = new Product(57474, "mobile", 25000);
		Product product3 = new Product(13423, "laptop", 98000);
		Product product4 = new Product(34635, "apple", 1000);

		// ----------------------------------------------------------

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product4);

		// ------------------------------------------------------------

		display(products);
		System.out.println();

		// -------------------------------------------------------------

		// sort by default property ( e.g product.id )
		Collections.sort(products);
		display(products);
		System.out.println();

		// -------------------------------------------------------------

		// sort by 'name' property ( e.g product.name )
		// Collections.sort(products,new Comparator<Product>() {
		// @Override
		// public int compare(Product o1, Product o2) {
		// return o1.getName().compareTo(o2.getName());
		// }
		// });

		// JDK 1.8 : Lambda expression
		Collections.sort(products, (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});

		display(products);

	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}

// class ProductByName implements Comparator<Product> {
// @Override
// public int compare(Product o1, Product o2) {
// return o1.getName().compareTo(o2.getName());
// }
// }
