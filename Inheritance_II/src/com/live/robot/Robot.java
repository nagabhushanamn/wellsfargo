package com.live.robot;

import com.live.LivingThing;

public class Robot extends LivingThing {

	@Override
	public void eat() {
		System.out.println("Robot eat..");
	}

	@Override
	public void walk() {
		System.out.println("Robot walk..");
	}

}
