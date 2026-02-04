package com.functionalinterface.defaultinterface.staticmethod;

public class UnitMain {
    public static void main(String[] args) {

        double distanceKm = 100;
        double weightKg = 50;

        System.out.println("Distance in miles: " +
                UnitConverter.kmToMiles(distanceKm));

        System.out.println("Weight in lbs: " +
                UnitConverter.kgToLbs(weightKg));
    }
}
