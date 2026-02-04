package com.functionalinterface.defaultmethod.smartdashborad;

public class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric car speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery level: 82%");
    }
}
