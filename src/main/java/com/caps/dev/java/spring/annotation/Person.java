package com.caps.dev.java.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanNameAware, BeanFactoryAware,
				ApplicationContextAware, BeanPostProcessor, DisposableBean,
				InitializingBean
{
	private String name;
	private Job job;
	
	@PostConstruct
	public void postConstMethod() {
		System.out.println("Things to do with me just after creation");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy()");
	}
	
	public Person() {
		System.out.println("I am being creted");
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Ohh my name is: "+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) 
			throws BeansException {
		System.out.println("Ohh my Bean Factory is: "+beanFactory.toString());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) 
			throws BeansException {
		System.out.println("Ohh I belong to: "+applicationContext.toString());
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before Init");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After Init");
		return null;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Ohh time to go... :'(");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Properties has been set");
	}
}
