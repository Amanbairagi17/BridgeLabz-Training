package com.functionalinterface.defaultmethod.smartdashborad;

public class Bike implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Bike speed: " + speed + " km/h");
    }
}
