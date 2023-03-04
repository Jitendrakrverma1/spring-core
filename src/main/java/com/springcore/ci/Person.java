package com.springcore.ci;

public class Person 
{
	private String name;
	private int persionId;
	private Certi certi;
	
	public Person(String name, int persionId,Certi certi) {
		this.name = name;
		this.persionId = persionId;
		this.certi = certi;
	}

	public Person() {
		
	}

	@Override
	public String toString() {
		return this.name+" : "+this.persionId+" { "+this.certi.name+" } ";
	}
	
}
