package com.inheritance.assitedproblems.animalhierarchy;


public class Cat extends Animal{
	//Attributes
	private String color;

	
	public Cat(String name, int age, String color) {
		super(name, age);//calling super class constructor
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void showColor() {
		System.out.println("cat has " +this.color+ " color");

	}
	
}
