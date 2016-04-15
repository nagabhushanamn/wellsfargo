package com;

interface Subject {
}

class Java implements Subject {

}

class JS implements Subject {

}

class Trainer<T extends Subject> {

	T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

public class Generics_Demo {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<Java>();
		javaTrainer.setSubject(new Java());

		// ------------------------------------
		// javaTrainer.setSubject(new JS());
		// -----------------------------------

		Object obj = javaTrainer.getSubject();
		if (obj instanceof Java) {
			Java java = (Java) obj;
			System.out.println("Happy learning...");
		} else {
			System.out.println("He is not java Trainer...");
		}

		Trainer<JS> jsTrainer = new Trainer<JS>();

		// Trainer<String> trainer=new Trainer<String>();

	}

}
