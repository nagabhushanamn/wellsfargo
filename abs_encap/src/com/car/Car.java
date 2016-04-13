package com.car;

import com.wheel.Wheel;

/*
 * 
 *  " closed for modification , open for extension "
 * 
 */
public class Car {

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();   // runtime polymorphism
		System.out.println("Car moving...");
	}

}
