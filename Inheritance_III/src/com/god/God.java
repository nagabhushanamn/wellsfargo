package com.god;

import com.live.LivingThing;
import com.live.human.Human;

public class God {

	// public void manageHuman(Human human) {
	// human.eat();
	// human.sleep();
	// human.walk();
	// }
	//
	// public void manageAnimal(Animal animal) {
	// animal.eat();
	// animal.sleep();
	// animal.walk();
	// }

	public void manageLT(LivingThing live) {
		live.eat();
		live.sleep();
		live.walk();
		if(live instanceof Human){
			Human human=(Human)live;
			human.study();
		}
	}
}
