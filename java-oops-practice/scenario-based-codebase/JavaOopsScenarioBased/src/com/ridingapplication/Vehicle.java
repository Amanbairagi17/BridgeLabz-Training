package com.ridingapplication;

public  abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private double ratePerKm;   // encapsulated
    private double baseFare;    // encapsulated

    public Vehicle(String vehicleNumber, int capacity, double baseFare, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.baseFare = baseFare;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation: no direct access to fare details
    public double calculateFare(double distance) {
        return baseFare + (distance * ratePerKm);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public abstract String getType();
}
