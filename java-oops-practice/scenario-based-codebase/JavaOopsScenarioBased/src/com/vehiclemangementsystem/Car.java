package com.vehiclemangementsystem;

public class Car extends Vehicle {
	//Attribute
    private boolean isLuxury;

    public Car(String vehicleId, String brand, boolean isLuxury) {
        super(vehicleId, brand, 1000);
        this.isLuxury = isLuxury;
    }

    @Override
    public double calculateRent(int days) {
        double rent = baseRate * days;
        if (isLuxury) {
            rent += 500 * days; // luxury 
        }
        return rent;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car | Brand: " + brand + " | Luxury: " + isLuxury);
    }
}

