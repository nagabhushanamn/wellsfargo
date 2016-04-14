package com.dev.comps;

import com.vendor.annotations.RequestMapping;

public class ComponentA {

	@RequestMapping(url = "/req2")
	public void m1() {
		System.out.println("m1() called on /req2");
	}

	@RequestMapping(url = "/req1")
	public void m2() {
		System.out.println("m2() called on /req1");
	}

}
