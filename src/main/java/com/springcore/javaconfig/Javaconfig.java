package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

//it is used when we use @component
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class Javaconfig 
{
	
	// create bean for Samoa
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	
	// the object that created here refer to IOC Container
	@Bean(name= {"student","temp",})
	public Student getStudent()
	{
		// creating a new student object
		Student student = new Student(getSamosa());
		return student;
	}
}
