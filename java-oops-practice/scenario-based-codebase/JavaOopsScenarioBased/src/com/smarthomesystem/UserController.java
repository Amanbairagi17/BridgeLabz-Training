package com.smarthomesystem;

public class UserController {

	//method to control device
    public void controlDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    //method to compare energy
    public void compareEnergyUsage(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println("First appliance consumes more power");
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println("Second appliance consumes more power");
        } else {
            System.out.println("Both appliances consume equal power");
        }
    }
}

