package com.smarthomedevicemanager;

public class DriverClass {
	 public static void main(String[] args) {
	        Device[] devices = {
	            new Light("L1"),
	            new Camera("C1"),
	            new Thermostat("T1"),
	            new Lock("K1")
	        };

	        for(int i = 0; i < devices.length; i++) {
	            devices[i].turnOn();
	            System.out.println("Energy for 2 hrs: " + devices[i].calculateEnergy(2));
	            devices[i].reset();
	            devices[i].showFirmwareLog();
	            System.out.println();
	        }
	    }
}
