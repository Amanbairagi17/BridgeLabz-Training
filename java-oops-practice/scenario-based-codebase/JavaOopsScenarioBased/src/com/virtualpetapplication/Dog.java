package com.virtualpetapplication;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    //overridden method for sound
    public void makeSound() {
        System.out.println(name + " says: Woof! 🐶");
    }
}
