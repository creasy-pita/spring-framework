package com.creasypita.springtest;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by lujq on 4/4/2021.
 */
public  class CreasyApplicationUtil implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public Object getBean(String beanName){
		return applicationContext.getBean(beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
