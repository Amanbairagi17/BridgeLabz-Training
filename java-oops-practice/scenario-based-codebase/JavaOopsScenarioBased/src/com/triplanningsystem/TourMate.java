package com.triplanningsystem;

public class TourMate {
    public static void main(String[] args) {

        Transport flight = new Transport(15000);
        Hotel hotel = new Hotel(10000);
        Activity safari = new Activity(5000);

        Trip trip1 = new InternationalTrip(
                "Melbourne", 1700000, 10, flight, hotel, safari);

        trip1.book();
        System.out.println("Total Budget: " + trip1.getBudget());
        System.out.println("Trip time " +trip1.getDuration()+ " Days");
        trip1.book();
        
        Trip trip2 = new DomesticTrip(
                "Manali", 10000, 20, flight, hotel, safari);
        System.out.println("Total Budget: " + trip2.getBudget());
        System.out.println("Trip time " +trip2.getDuration()+ " Days");
        trip2.cancel();
        
    }
}
