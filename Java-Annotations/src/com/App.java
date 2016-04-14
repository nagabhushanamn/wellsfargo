package com;

import com.vendor.container.Container;

public class App {

	public static void main(String[] args) {

		Container container = new Container();

		container.processReq("/req1");

	}

}
