package com.inheritance.hybridinheritance.vehiclemanagement;

public class ElectricVehicle extends Vehicle {
	// constructor
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // method to charge
    public void charge() {
        System.out.println("Charging electric vehicle");
    }
}
