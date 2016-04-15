package com.ex;

import java.io.Closeable;

class Resource implements Closeable {

	public void init() {
		System.out.println("Init....");
	}

	public void use() {
		System.out.println("using resource...");
		int v = 100;
		if (v != 100) {
			throw new RuntimeException();
		}
		System.out.println("resource used");
	}

	public void close() {
		System.out.println("close...");
	}
}

public class Try_Catch_Finally_Demo {

	public static void main(String[] args) {

		// Resource resource = new Resource();
		// resource.init();

		// try {
		// resource.use();
		// return;
		// // resource.close();
		// } catch (Exception e) {
		// // resource.close();
		// System.out.println("Handling ex...");
		// } finally {
		// resource.close();
		// }

		// JDJ 1.7 => try with resource

		try (Resource resource = new Resource()) {
			resource.init();
			resource.use();
		} catch (Exception e) {
			System.out.println("Handling ex...");
		}

	}

}
