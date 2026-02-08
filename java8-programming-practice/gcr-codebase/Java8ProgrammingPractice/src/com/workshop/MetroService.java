package com.workshop;

public class MetroService implements TransportService {
    private String route;
    private double fare;
    private int departureTime;

    public MetroService(String route, double fare, int departureTime) {
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }

    public String getServiceName() { return "Metro"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public int getDepartureTime() { return departureTime; }
}
