package com;

import com.god.God;
import com.live.LivingThing;
import com.live.animal.Animal;
import com.live.human.Human;
import com.live.human.Male;
import com.live.robot.Robot;

public class App {

	public static void main(String[] args) {

		God god = new God();

		// LivingThing livingThing=new LivingThing();
		Human human = new Male();
		Animal animal = new Animal();
		Robot robot = new Robot();

		// god.manageHuman(human);
		god.manageLT(human);
		System.out.println();
		// god.manageAnimal(animal);
		god.manageLT(animal);
		System.out.println();
		god.manageLT(robot);
	}

}
