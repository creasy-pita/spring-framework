package com.creasypita.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by lujq on 6/14/2022.
 */
@Component
public class AService {
	public void show(){
		System.out.println("show AService");
	}
}
