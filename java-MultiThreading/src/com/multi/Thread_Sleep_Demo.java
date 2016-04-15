package com.multi;

import java.time.LocalTime;

class Timer implements Runnable {

	@Override
	public void run() {
		while (true) {
			LocalTime localTime = LocalTime.now();
			System.err.println(localTime);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Thread_Sleep_Demo {

	public static void main(String[] args) throws InterruptedException {

		// System.out.println("break-fast");
		//
		// Thread.sleep(5 * 1000);
		//
		// System.out.println("lunch");

		Timer timer = new Timer();
		Thread thread = new Thread(timer);
		thread.start();

	}

}
