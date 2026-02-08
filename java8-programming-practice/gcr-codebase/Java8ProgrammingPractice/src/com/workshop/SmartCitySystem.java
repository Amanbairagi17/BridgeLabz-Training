package com.workshop;

import java.util.*;
import java.util.stream.*;

public class SmartCitySystem {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("A-B", 20, 480),
                new MetroService("A-C", 30, 450),
                new TaxiService("A-B", 50, 470),
                new AmbulanceService()
        );

        //Lambda – filter & sort 
        System.out.println("\nFiltered & Sorted Services:");
        services.stream()
                .filter(s -> s.getFare() <= 40)
                .sorted(Comparator.comparingInt(TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        //Method reference
        System.out.println("\nAll Available Services:");
        services.forEach(TransportService::printServiceDetails);

        //Fare Calculator – Functional Interface 
        FareCalculator calculator = distance -> distance * 5;
        System.out.println("\nFare for 10km: " + calculator.calculateFare(10));

        //Emergency Detection – Marker Interface 
        System.out.println("\nEmergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println(s.getServiceName() + " gets priority 🚨"));

        // Passenger Analytics using Streams & Collectors
        List<Passenger> passengers = Arrays.asList(
                new Passenger("Aman", "A-B", 20, true),
                new Passenger("Ravi", "A-B", 20, false),
                new Passenger("Neha", "A-C", 30, true),
                new Passenger("Pooja", "A-C", 30, false)
        );

        // groupingBy
        Map<String, List<Passenger>> byRoute =
                passengers.stream().collect(Collectors.groupingBy(p -> p.route));

        // partitioningBy
        Map<Boolean, List<Passenger>> peakSplit =
                passengers.stream().collect(Collectors.partitioningBy(p -> p.peakHour));

        // summarizingDouble
        DoubleSummaryStatistics stats =
                passengers.stream().collect(Collectors.summarizingDouble(p -> p.fare));

        System.out.println("\nPassengers Grouped by Route: " + byRoute.keySet());
        System.out.println("Peak Trips Count: " + peakSplit.get(true).size());
        System.out.println("Total Revenue: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());
    }
}
