package com.smarthomedevicemanager;

public class Thermostat extends Device {
    public Thermostat(String deviceId) {
        super(deviceId, 15);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat On");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat Off");
    }

    public void reset() {
        updateFirmware("Temperature reset");
        System.out.println("Thermostat Reset");
    }
}