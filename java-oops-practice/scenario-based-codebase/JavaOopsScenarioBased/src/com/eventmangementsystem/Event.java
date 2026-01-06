package com.eventmangementsystem;

public abstract class Event implements ISchedulable {

    private final String eventId;     // cannot be edited once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Basic constructor
    public Event(String eventId, String eventName, String location,
                 String date, int attendees, double venueCost, User organizer) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.organizer = organizer;
    }

    // Constructor with services
    public Event(String eventId, String eventName, String location,
                 String date, int attendees, double venueCost,
                 double serviceCost, double discount, User organizer) {

        this(eventId, eventName, location, date, attendees, venueCost, organizer);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Price calculation (encapsulated)
    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;   // operator usage
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Event " + eventName + " has been cancelled.");
    }
}

