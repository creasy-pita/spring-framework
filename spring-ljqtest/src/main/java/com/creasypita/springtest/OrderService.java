package com.creasypita.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * Created by lujq on 6/14/2022.
 */
@Configuration
public class OrderService {
	public void show(){
		System.out.println("show order");
	}

	@Bean(name = "aString")
	public String getAString(){
		return "aStringFromBeanContainer";
	}
}
