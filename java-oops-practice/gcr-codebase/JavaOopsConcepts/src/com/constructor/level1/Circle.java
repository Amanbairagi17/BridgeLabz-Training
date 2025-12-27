package com.constructor.level1;

public class Circle {
	//Attributes 
	double radius;
	
	//Default Constructor
	Circle(){
		this(1.0);
	}
	
	//parameterized constructor
	Circle(double radius){
		this.radius = radius;
	}
	
	//display result 
	void displayArea() {
		System.out.println(3.14 * radius * radius);
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.displayArea();
		Circle c2 = new Circle(2.0);
		c2.displayArea();
	}
}
