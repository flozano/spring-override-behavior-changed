package com.flozano.testbeanoverride.impl;

import com.flozano.testbeanoverride.TheService;

public class TheServiceBean implements TheService {

	private String name;

	@Override
	public String sayHello() {
		return "Hello " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
