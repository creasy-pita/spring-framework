package com.creasypita.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lujq on 3/31/2021.
 */
public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		System.out.println(userService.getName("creasy", "pita"));
	}
}