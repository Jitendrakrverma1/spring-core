package com.springcore.lifecycle;

public class Samosa 
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("price setted....");
		this.price = price;
	}

	public Samosa() {
		
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	// init() method :- we can change name of method (only inform xml file )
	public void hey()
	{
		System.out.println("inside init method........hey");
	}
	// destroy() method:- we can change name of method
	public void bey()
	{
		System.out.println("inside destroy method ...... bey");
	}
}
