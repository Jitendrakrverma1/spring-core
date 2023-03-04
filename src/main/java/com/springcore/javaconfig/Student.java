package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

// it used when we not use @Bean annotation
//@Component("firstStudent")
public class Student 
{
	
	private Samosa samosa;
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public void study()
	{
		this.samosa.display();
		System.out.println("student is reading.........");
	}

}
