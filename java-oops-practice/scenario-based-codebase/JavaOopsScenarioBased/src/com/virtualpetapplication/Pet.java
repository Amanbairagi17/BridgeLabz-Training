package com.virtualpetapplication;
import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // 0–100 (private)
    private int energy;   // 0–100 (private)
    private int mood;     // 0–100 (private)

    // Random default values constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(40) + 30;
        this.energy = r.nextInt(40) + 30;
        this.mood = r.nextInt(40) + 30;
    }

    // User-specified values constructor
    public Pet(String name, String type, int age, int hunger, int energy, int mood) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }

    // Encapsulated behavior
    //Overridden method for feed 
    public void feed() {
        hunger = Math.max(0, hunger - 20);   // operator usage
        mood += 10;
        energy += 5;
    }

  //Overridden method for play
    public void play() {
        energy -= 15;
        hunger += 10;
        mood += 20;
    }

  //Overridden method for sleep
    public void sleep() {
        energy += 25;
        mood += 5;
    }

    //show status
    protected void showStatus() {
        System.out.println("Hunger: " + hunger + ", Energy: " + energy + ", Mood: " + mood);
    }

    //abstract method for sound
    public abstract void makeSound();
}
