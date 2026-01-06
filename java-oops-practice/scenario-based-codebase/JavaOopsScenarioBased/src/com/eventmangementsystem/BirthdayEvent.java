package com.eventmangementsystem;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventId, String eventName, String location,
                         String date, int attendees, double venueCost,
                         double serviceCost, double discount, User organizer) {

        super(eventId, eventName, location, date, attendees,
              venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday Event Scheduled!");
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
