package com.functionalinterface.defaultmethod.smartdashborad;

public class DashboardApp {
    public static void main(String[] args) {

        VehicleDashboard car = new Car();
        car.displaySpeed(80);
        car.displayBatteryPercentage();   // default method

        VehicleDashboard ev = new ElectricCar();
        ev.displaySpeed(100);
        ev.displayBatteryPercentage();    // overridden
    }
}
