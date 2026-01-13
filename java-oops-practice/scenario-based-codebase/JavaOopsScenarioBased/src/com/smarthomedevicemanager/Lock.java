package com.smarthomedevicemanager;

public class Lock extends Device {
    public Lock(String deviceId) {
        super(deviceId, 2);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Locked");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Unlock");
    }

    public void reset() {
        updateFirmware("Lock reset");
        System.out.println("Lock Reset");
    }
}