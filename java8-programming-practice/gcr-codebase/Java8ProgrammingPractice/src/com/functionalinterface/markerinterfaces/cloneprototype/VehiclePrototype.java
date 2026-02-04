package com.functionalinterface.markerinterfaces.cloneprototype;

public class VehiclePrototype implements Cloneable {

    private String model;
    private int speed;

    public VehiclePrototype(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    public void display() {
        System.out.println("Model: " + model + ", Speed: " + speed);
    }
}
