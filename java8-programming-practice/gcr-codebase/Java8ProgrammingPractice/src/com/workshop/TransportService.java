package com.workshop;

public interface TransportService {
    String getServiceName();
    String getRoute();
    double getFare();
    int getDepartureTime(); // minutes since day start

    default void printServiceDetails() {
        System.out.println(getServiceName() + " | Route: " + getRoute() + " | Fare: " + getFare());
    }
}
