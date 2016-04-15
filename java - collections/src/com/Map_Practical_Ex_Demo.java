package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.model.Car;
import com.model.Owner;

public class Map_Practical_Ex_Demo {
	public static void main(String[] args) {

		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Ria");

		Car car1 = new Car("BMW", "black");
		Car car2 = new Car("Audi", "black");

		// -------------------------------------

//		Map<Owner, Car> map = new TreeMap<>();
		Map<Owner, Car> map = new HashMap<>();
		map.put(owner1, car1);
		map.put(owner2, car2);

		// --------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Owner name!");
		String name = sc.nextLine();

		Owner key = new Owner(name);

		Car car = map.get(key);

		if (car != null) {
			System.out.println(car);
		} else {
			System.out.println("dream it");
		}

		sc.close();

	}

}
