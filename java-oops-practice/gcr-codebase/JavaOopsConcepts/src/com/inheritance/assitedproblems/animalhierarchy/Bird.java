package com.inheritance.assitedproblems.animalhierarchy;

public class Bird extends Animal{
	//Attribute
	private String wings;
	
	public Bird(String name, int age, String wings) {
		super(name, age);
		this.wings=wings;
	}

	public String getWings() {
		return wings;
	}

	public void setWings(String wings) {
		this.wings = wings;
	}

	
	
}
