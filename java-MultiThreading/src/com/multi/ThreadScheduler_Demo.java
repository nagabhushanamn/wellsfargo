package com.multi;

class SomeWork implements Runnable {

	// READY-TO-RUN --> RUNNING
	int count;
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			this.count++;
			System.out.println(name + "-->" + i +"- total-"+this.count);
			// RUNNING --> NOT-READY-RUN ( scheduler decision )
		}

		// --> DEAD
	}

}

public class ThreadScheduler_Demo {

	public static void main(String[] args) {

		SomeWork someWork = new SomeWork();

		Thread thread1 = new Thread(someWork, "A"); // NEW
		Thread thread2 = new Thread(someWork, "B");
		Thread thread3 = new Thread(someWork, "C");

		thread1.start(); // NEW --> READY-TO-RUN
		thread2.start();
		thread3.start();

		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.println(name + "-->" + i);
		}

	}

}
