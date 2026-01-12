package com.compartmentnavigationsystem;

public class CompartmentNode {
    String name; //compartment name
    boolean hasPantry; 
    boolean hasWifi;

    CompartmentNode prev; // to visit previous compartment
    CompartmentNode next; // to visit next compartment

    //constructor
    CompartmentNode(String name, boolean pantry, boolean wifi) {
        this.name = name;
        this.hasPantry = pantry;
        this.hasWifi = wifi;
    }
}
