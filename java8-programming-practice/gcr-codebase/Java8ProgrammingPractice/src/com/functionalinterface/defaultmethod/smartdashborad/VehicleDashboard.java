package com.functionalinterface.defaultmethod.smartdashborad;

public interface VehicleDashboard {

    void displaySpeed(int speed);

    // New feature added later
    default void displayBatteryPercentage() {
        System.out.println("Battery information not available for this vehicle.");
    }
}
