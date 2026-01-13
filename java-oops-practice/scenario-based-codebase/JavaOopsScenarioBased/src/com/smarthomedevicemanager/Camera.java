package com.smarthomedevicemanager;

public class Camera extends Device {
    public Camera(String deviceId) {
        super(deviceId, 10);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera OFF");
    }

    public void reset() {
        updateFirmware("Camera Calibrated");
        System.out.println("Camera Reset");
    }
}