package com.vehiclemangementsystem;

public class Truck extends Vehicle {

	//Attributes
    private double loadCapacity; // in tons

    //constructor
    public Truck(String vehicleId, String brand, double loadCapacity) {
        super(vehicleId, brand, 2000);//calling super constructor
        this.loadCapacity = loadCapacity;
    }

    public double calculateRent(int days) {
        return (baseRate * days) + (loadCapacity * 300);
    }

    public void displayInfo() {
        System.out.println("Truck | Brand: " + brand + " | Load Capacity: " + loadCapacity + " tons");
    }
}

