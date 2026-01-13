package com.smarthomedevicemanager;

public class Light extends Device {
    public Light(String deviceId) {
        super(deviceId, 5);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light On");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light Off");
    }

    public void reset() {
        turnOff();
        updateFirmware("Light Reset Done");
        System.out.println("Light Reset");
    }
}