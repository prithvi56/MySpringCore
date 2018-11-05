package com.caps.dev.java.spring.xml;

public class Person {
	private String name;
	private Job job;
	
	public void init() {
		System.out.println("Init");
	}
	
	public void destory() {
		System.out.println("Destroy");
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
}