package com.caps.dev.java.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/PersonConfig.xml");
		Person p = ctx.getBean(Person.class,"person");

		System.out.println(p.getName());
		p.getJob().job();
	}
}