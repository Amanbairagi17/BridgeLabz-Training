package com.inheritance.assitedproblems.animalhierarchy;

public class Dog extends Animal {
	private String breed;
	//constructor
	public Dog(String name, int age, String breed) {
		super(name, age);//calling super class constructor
		this.breed = breed;
	}
	
	
	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public void run() {
		System.out.println("Dog running.....");
	}

}
