package com.smarthomedevicemanager;

public abstract class Device implements IControllable {
    public String deviceId;
    private boolean status;
    public double energyUsage;
    private String firmwareLog;

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "No Updates";
    }

    protected void setStatus(boolean value) {
        status = value;
    }

    public boolean getStatus() {
        return status;
    }

    protected void updateFirmware(String log) {
        firmwareLog = log;
    }

    public void showFirmwareLog() {
        System.out.println(deviceId + " " + firmwareLog);
    }

    public double calculateEnergy(int hours) {
        return energyUsage * hours;
    }
}