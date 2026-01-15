package com.birdsanctuary;

public abstract class Bird {
    private String name;
    private String species;
    private int id;

    //constructor
    public Bird(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    //getter
    public int getId() {
        return id;
    }

    //methods to display properties
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void display() {
        System.out.print(id + " " + name + " " + species);
    }
}