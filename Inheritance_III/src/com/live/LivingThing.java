package com.live;

public abstract class LivingThing {

	// common properties

	// common behav

	public void eat() {
		System.out.println("LT eat");
	}

	public final void sleep() {
		System.out.println("LT sleep");
	}

	// public void walk() {
	// System.out.println("LT walk");
	// }

	public abstract void walk();

}
