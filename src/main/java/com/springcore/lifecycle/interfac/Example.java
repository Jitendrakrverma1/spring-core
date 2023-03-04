package com.springcore.lifecycle.interfac;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example 
 {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Start init method...");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("start destroy method..");
	}
}
