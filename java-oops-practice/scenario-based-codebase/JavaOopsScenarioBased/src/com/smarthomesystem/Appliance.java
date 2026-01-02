package com.smarthomesystem;

public abstract class Appliance implements Controllable {
	//Attributes
    private boolean isOn;
    private int powerUsage; // watts

    //constructor
    public Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    //getters and setters
    protected void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public boolean isOn() {
        return isOn;
    }

    protected void switchOn() {
        isOn = true;
    }

    protected void switchOff() {
        isOn = false;
    }

    //abstract method
    public abstract void showStatus();
}

