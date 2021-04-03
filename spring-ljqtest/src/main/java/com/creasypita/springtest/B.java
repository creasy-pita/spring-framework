package com.creasypita.springtest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lujq on 4/3/2021.
 */

public class B {

	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
