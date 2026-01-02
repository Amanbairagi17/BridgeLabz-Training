package com.smarthomesystem;

public class Fan extends Appliance {

	//Attribute for controlling speed
    private int speed; // 1–5

    //constructor for default setting
    public Fan() {
        super(75);
        this.speed = 3;
    }

    //constructor
    public Fan(int speed) {
        super(75);
        this.speed = speed;
    }

    //method to control light for turn on fan
    public void turnOn() {
        switchOn();
        System.out.println("Fan turned ON at speed " + speed);
    }

    //method to control light for turn off fan
    public void turnOff() {
        switchOff();
        System.out.println("Fan turned OFF");
    }

    //method to show status of fan 
    public void showStatus() {
        System.out.println("Fan | ON: " + isOn() + " | Power: " + getPowerUsage() + "W");
    }
}

