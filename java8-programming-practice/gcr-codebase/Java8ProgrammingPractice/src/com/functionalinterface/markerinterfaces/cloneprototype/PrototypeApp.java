package com.functionalinterface.markerinterfaces.cloneprototype;

public class PrototypeApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        VehiclePrototype original = new VehiclePrototype("Tesla Model 3", 200);

        VehiclePrototype clone1 = (VehiclePrototype) original.clone();
        VehiclePrototype clone2 = (VehiclePrototype) original.clone();

        clone1.display();
        clone2.display();
    }
}
