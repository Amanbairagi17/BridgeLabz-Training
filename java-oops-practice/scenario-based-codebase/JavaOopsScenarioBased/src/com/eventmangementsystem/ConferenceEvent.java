package com.eventmangementsystem;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String eventId, String eventName, String location,
                           String date, int attendees, double venueCost,
                           double serviceCost, double discount, User organizer) {

        super(eventId, eventName, location, date, attendees,
              venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("🏢 Conference Event Scheduled!");
        System.out.println("Attendees: " + attendees);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
