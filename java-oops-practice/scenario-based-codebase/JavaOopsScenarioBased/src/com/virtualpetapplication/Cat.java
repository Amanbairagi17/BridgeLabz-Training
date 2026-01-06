package com.virtualpetapplication;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    //Overridden method for cat
    public void makeSound() {
        System.out.println(name + " says: Meow! 🐱");
    }
}
