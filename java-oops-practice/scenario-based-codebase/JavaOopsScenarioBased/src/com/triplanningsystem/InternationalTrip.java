package com.triplanningsystem;

public class InternationalTrip extends Trip implements IBookable {

    public InternationalTrip(String destination, double budget, int duration,
                              Transport t, Hotel h, Activity a) {
        super(destination, budget, duration, t, a,h);
    }

    @Override
    public void book() {
        System.out.println("Booking international trip with passport & visa");
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled");
    }
}
