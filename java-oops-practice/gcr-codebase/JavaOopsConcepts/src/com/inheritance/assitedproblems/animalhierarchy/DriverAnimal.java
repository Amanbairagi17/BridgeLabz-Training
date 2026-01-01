package com.inheritance.assitedproblems.animalhierarchy;

public class DriverAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal("Aman Bairagi", 21);
		Cat c = new Cat("cats", 3, "black");
		Bird b = new Bird("Eagle", 5, "light white");
		Dog d = new Dog("sheru", 10, "indian");
		
		c.showColor();
		System.out.println(b.getWings());
		d.run();
	}
}
