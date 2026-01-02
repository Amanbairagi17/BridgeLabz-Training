package com.vehiclemangementsystem;

public class Bike extends Vehicle {

    public Bike(String vehicleId, String brand) {
        super(vehicleId, brand, 300);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike | Brand: " + brand);
    }
}

