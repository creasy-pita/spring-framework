package com.creasypita.springtest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lujq on 4/3/2021.
 */
public class C {

	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAName() {
		return a.getName();
	}
}
