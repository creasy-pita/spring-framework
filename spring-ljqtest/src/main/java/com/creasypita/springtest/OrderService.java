package com.creasypita.springtest;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by lujq on 6/14/2022.
 */
@Configuration
@PropertySource(value = {"classpath:my.properties"})
public class OrderService {
	public void show(){
		System.out.println("show order");
	}

	@Bean(name = "aString")
	public String getAString(){
		return "aStringFromBeanContainer";
	}
}
