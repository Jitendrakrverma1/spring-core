package com.springcore.lifecycle.interfac;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) 
	{	
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/interfac/lifecycle.xml");
      
      // registering shutdown hook...
      context.registerShutdownHook();
      
		/*
		 * System.out.println("===================="); Pepsi s = (Pepsi)
		 * context.getBean("p1"); System.out.println(s);
		 */
      
      Example example1 = (Example)context.getBean("example");
      System.out.println(example1);
	}
}
