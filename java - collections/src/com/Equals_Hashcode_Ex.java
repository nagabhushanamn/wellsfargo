package com;

import java.util.HashSet;
import java.util.Set;

import com.model.Car;

public class Equals_Hashcode_Ex {

	public static void main(String[] args) {

		Car car1 = new Car("BMW", "black");
		Car car2 = new Car("BMW", "black");

		//System.out.println(car1.equals(car2));
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

		Set<Car> cars = new HashSet<>();
		cars.add(car1);
		cars.add(car2);

		//
		System.out.println(cars.size());

	}

}
