package com.multi;

class Work implements Runnable {

	@Override
	public void run() {
		System.out.println("thread work...");
	}

}

public class MultiThread_App {

	public static void main(String[] args) {

		Work work = new Work();

		Thread thread1 = new Thread(work);
		thread1.start();

		System.out.println("main with other work..");
	}

}
