package com.workshop;

public class Passenger {
    String name;
    String route;
    double fare;
    boolean peakHour;

    Passenger(String name, String route, double fare, boolean peakHour) {
        this.name = name;
        this.route = route;
        this.fare = fare;
        this.peakHour = peakHour;
    }
}
