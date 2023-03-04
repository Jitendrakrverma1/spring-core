package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(Javaconfig.class);
		// using component created bean object
//		Student student = context.getBean("firstStudent",Student.class);
		
		// using @bean created object
		Student student = context.getBean("temp",Student.class);
		System.out.println(student);
		student.study();
	}
}
