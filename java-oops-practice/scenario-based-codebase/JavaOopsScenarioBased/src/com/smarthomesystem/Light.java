package com.smarthomesystem;

public class Light extends Appliance {

	//Brightness variable
    private int brightness; // 0–100

    public Light() {
        super(40); // default power
        this.brightness = 50;
    }

    public Light(int brightness) {
        super(40);
        this.brightness = brightness;
    }

    //method to control light for turn on light
    public void turnOn() {
        switchOn();
        System.out.println("Light turned ON with brightness " + brightness + "%");
    }
  
    //method to turn off light
    public void turnOff() {
        switchOff();
        System.out.println("Light turned OFF");
    }

    //method to show status weather light is on or off
    public void showStatus() {
        System.out.println("Light | ON: " + isOn() + " | Power: " + getPowerUsage() + "W");
    }
}
