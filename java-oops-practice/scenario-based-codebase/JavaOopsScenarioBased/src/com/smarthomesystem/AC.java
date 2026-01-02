package com.smarthomesystem;

public class AC extends Appliance {

    private int temperature;

    public AC() {
        super(1500);
        this.temperature = 24;
    }

    public AC(int temperature) {
        super(1500);
        this.temperature = temperature;
    }

    //method to control light for turn on AC
    public void turnOn() {
        switchOn();
        System.out.println("AC turned ON at " + temperature + "°C");
    }

  //method to control light for turn off AC
    public void turnOff() {
        switchOff();
        System.out.println("AC turned OFF");
    }

  //method to status for  AC
    public void showStatus() {
        System.out.println("AC | ON: " + isOn() + " | Power: " + getPowerUsage() + "W");
    }
}
