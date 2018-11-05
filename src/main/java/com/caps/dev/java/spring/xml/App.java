package com.caps.dev.java.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/PersonConfig.xml");
		
//		FileSystemXmlApplicationContext ctx = 
//					new FileSystemXmlApplicationContext("D:/PersonConfig.xml");
		
		
		Person p = ctx.getBean(Person.class,"person");

		System.out.println(p.getName());
		p.getJob().job();
		ctx.close();
	}
}