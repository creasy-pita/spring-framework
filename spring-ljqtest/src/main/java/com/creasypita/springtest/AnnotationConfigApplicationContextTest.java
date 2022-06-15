package com.creasypita.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lujq on 3/31/2021.
 */
public class AnnotationConfigApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OrderService.class,AService.class);
		OrderService orderService = (OrderService) applicationContext.getBean("orderService");
		orderService.show();
		Object obj = applicationContext.getBean("aString");
		System.out.println(obj.toString());

	}
}