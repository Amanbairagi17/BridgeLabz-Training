package com.virtualpetapplication;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    //Overridden method for bird
    public void makeSound() {
        System.out.println(name + " says: Tweet! 🐦");
    }
}
