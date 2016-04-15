package com.multi;

import java.util.ArrayList;

class Box {

	private ArrayList<String> list = new ArrayList<>();

	// write
	public void add(String item) {
		list.add(item);
	}

	// read
	public ArrayList<String> read() {
		return this.list;
	}
}

class TWork implements Runnable {

	Box box = new Box();

	@Override
	public synchronized void run() {

		String name = Thread.currentThread().getName();

		if (name.equals("write")) {

			for (int i = 0; i < 10; i++) {
				box.add("item" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("item-" + i + " added..");
			}
			System.out.println("write - completed");
		}

		if (name.equals("read")) {
			System.out.println("=== READ ====");
			ArrayList<String> list = box.read();
			for (String item : list) {
				System.out.println(item);
			}
		}

	}
}

public class Thread_Synch_Demo {

	public static void main(String[] args) throws InterruptedException {

		TWork tWork = new TWork();

		Thread thread_write = new Thread(tWork, "write");
		Thread thread_read = new Thread(tWork, "read");

		thread_write.start();

		Thread.sleep(2000);

		thread_read.start();

	}

}
