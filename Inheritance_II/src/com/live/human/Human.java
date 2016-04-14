package com.live.human;

import com.live.LivingThing;

public class Human extends LivingThing {

	@Override
	public void walk() {
		System.out.println("Human walk with 2 legs");
	}

	public void study() {
		System.out.println("Human study..");
	}

}
