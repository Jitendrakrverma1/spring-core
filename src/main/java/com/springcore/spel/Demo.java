package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo 
{
	@Value("#{11+11}")
	private int x;
	
	@Value("#{2*20}")
	private int y;
	
	// here we pass static method as spEl
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	// here we pass static variable as spEl
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	// here we create object as spEl
	@Value("#{new java.lang.String('Jitendra Verma')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
}
