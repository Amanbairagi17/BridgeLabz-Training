package com.constructor.level1;

public class Person {
	//Attributes
	private String name;
	private int age;
	
	//Default Constructor
	Person(){
		name = "Kanha";
		age = 21;
	}
	
	//Parameterized Constructor 
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void displayDetail() {
		System.out.println(this.name + " is " + this.age + " years old");
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.displayDetail();
		Person p2 = new Person("Aman",23);
		p2.displayDetail();
	}
}
