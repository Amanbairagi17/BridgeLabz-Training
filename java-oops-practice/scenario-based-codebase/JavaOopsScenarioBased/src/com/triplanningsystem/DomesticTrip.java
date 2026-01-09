package com.triplanningsystem;


class DomesticTrip extends Trip {

    public DomesticTrip(String destination, double budget, int duration,
                         Transport t, Hotel h, Activity a) {
        super(destination, budget, duration, t, a, h);
    }

    @Override
    public void book() {
        System.out.println("Booking domestic trip to " + super.getDestination());
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled");
    }
}
