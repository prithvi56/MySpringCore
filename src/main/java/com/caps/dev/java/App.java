package com.caps.dev.java;

public class App 
{
    public static void main( String[] args )
    {
        Person p = new Person();
        p.setName("Prithvi");
        p.setJob(new SoftwareDeveloper());
        
        System.out.println(p.getName());
        p.getJob().job();
    }
}