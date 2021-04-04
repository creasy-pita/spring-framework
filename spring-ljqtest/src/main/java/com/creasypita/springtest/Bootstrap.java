package com.creasypita.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lujq on 3/31/2021.
 */
public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
//		UserService userService = (UserService) applicationContext.getBean("userService");
//		A a = (A) applicationContext.getBean("a");
//		B b = (B) applicationContext.getBean("b");
//		C c = (C) applicationContext.getBean("c");
//		System.out.println(userService.getName("creasy", "pita1"));
//		System.out.println(userService.getName("creasy", "pita2"));
//		System.out.println(a.getName());
//		System.out.println(b.getName());
//		System.out.println(c.getAName());

		UserService userService = (UserService) ((CreasyApplicationUtil) applicationContext.getBean("creasyUtil")).getBean("userService");
		System.out.println(userService.getName("Creasy","pita ya"));
	}
}