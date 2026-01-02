package com.vehiclemangementsystem;

public class Customer {
	//Attributes
    private int customerId;
    private String name;

    //Constructor
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
    
    //method all fields
    public void rentVehicle(Vehicle vehicle, int days) {
        System.out.println("Customer: " + name);
        vehicle.displayInfo();
        System.out.println("Rent for " + days + " days: ₹" + vehicle.calculateRent(days));
    }
}

