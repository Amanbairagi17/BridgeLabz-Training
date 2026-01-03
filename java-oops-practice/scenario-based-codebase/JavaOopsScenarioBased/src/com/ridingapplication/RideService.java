package com.ridingapplication;

public  class RideService implements IRideService {

    private double currentFare;

    //book ride 
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {
        currentFare = vehicle.calculateFare(distance);

        System.out.println("Ride Booked!");
        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Vehicle No: " + vehicle.getVehicleNumber());
        System.out.println("Fare: ₹" + currentFare);
    }

    //method to ending displaying
    public void endRide() {
        System.out.println("Ride Ended. Total Fare Paid: ₹" + currentFare);
    }
}

