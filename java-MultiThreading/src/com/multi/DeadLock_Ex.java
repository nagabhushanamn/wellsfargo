package com.multi;

class R1 {
	public synchronized void m1(R2 r2) {
		System.out.println("T1 using R1");
		System.out.println("T1 trying for R2");
		r2.m2();
	}

	public void m2() {
		System.out.println("T2 also haing R1");
	}
}

class R2 {
	public synchronized void m1(R1 r1) {
		System.out.println("T2 using R2");
		System.out.println("T2 trying for R1");
		r1.m2();
	}

	public void m2() {
		System.out.println("T1 also haing R2");
	}
}

class DeadWork implements Runnable {

	R1 r1 = new R1();
	R2 r2 = new R2();

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("T1")) {
			r1.m1(r2);
		}
		if (name.equals("T2")) {
			r2.m1(r1);
		}
	}

}

public class DeadLock_Ex {

	public static void main(String[] args) {

		DeadWork deadWork = new DeadWork();

		Thread thread1 = new Thread(deadWork, "T1");
		Thread thread2 = new Thread(deadWork, "T2");

		thread1.start();
		thread2.start();

	}

}
