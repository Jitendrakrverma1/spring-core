package com.springcore.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
      Samosa s = (Samosa) context.getBean("s1");
      System.out.println(s);
      
      // registering shutdown hook...
      context.registerShutdownHook();
	}

}
