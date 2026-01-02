package com.smarthomesystem;

public class SmartHomeDriverClass {
	public static void main(String[] args) {

        Appliance light = new Light(70);
        Appliance fan = new Fan(4);
        Appliance ac = new AC(22);

        UserController controller = new UserController();

        controller.controlDevice(light, true);
        controller.controlDevice(fan, true);
        controller.controlDevice(ac, true);

        System.out.println("---------------");

        light.showStatus();
        fan.showStatus();
        ac.showStatus();

        System.out.println("---------------");

        controller.compareEnergyUsage(light, ac);

        System.out.println("---------------");

        controller.controlDevice(ac, false);
        ac.showStatus();
    }
}
