package com.regex.triporgainizersystem;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLogApp {

    private static final String FILE_NAME = "travellog.dat";

    public static void main(String[] args) {

        List<Trip> trips = new ArrayList<>();

        //write trip serialization 
        trips.add(new Trip(
                "Europe Backpacking",
                "Visited Paris and Rome and Berlin",
                "Paris",
                "France",
                10));

        trips.add(new Trip(
                "Thailand Beaches",
                "Explored Bangkok nightlife and Phuket beaches",
                "Bangkok",
                "Thailand",
                6));

        trips.add(new Trip(
                "Italy Tour",
                "Rome Florence Venice Rome",
                "Rome",
                "Italy",
                8));

        trips.add(new Trip(
                "Short Nepal Trip",
                "Kathmandu Pokhara trekking",
                "Kathmandu",
                "Nepal",
                4));

        writeTrips(trips);

        // read trips (deserialization)
        List<Trip> loadedTrips = readTrips();

        System.out.println("===== ALL TRIPS =====");
        loadedTrips.forEach(System.out::println);

        // analysis
        findCitiesUsingRegex(loadedTrips);
        findLongTrips(loadedTrips);
        findUniqueCountries(loadedTrips);
        top3Cities(loadedTrips);
    }


    // serialization
    private static void writeTrips(List<Trip> trips) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream(FILE_NAME))) {

            oos.writeObject(trips);
            System.out.println("\nTrips saved successfully.\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // deserialization
    private static List<Trip> readTrips() {

        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream(FILE_NAME))) {

            return (List<Trip>) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    // regex city extraction
    private static void findCitiesUsingRegex(List<Trip> trips) {

        System.out.println("\n CITIES FOUND USING REGEX ");

        Pattern pattern =
                Pattern.compile("[A-Z][a-z]+");

        Set<String> cities = new HashSet<>();

        for (Trip trip : trips) {
            Matcher matcher =
                    pattern.matcher(trip.description);

            while (matcher.find()) {
                cities.add(matcher.group());
            }
        }

        cities.forEach(System.out::println);
    }

    // Trips longer than 5 days
    private static void findLongTrips(List<Trip> trips) {

        System.out.println("\n TRIPS > 5 DAYS ");

        for (Trip t : trips) {
            if (t.durationDays > 5)
                System.out.println(t);
        }
    }

    //Unique countries (Set)
    private static void findUniqueCountries(List<Trip> trips) {

        System.out.println("\n UNIQUE COUNTRIES VISITED ");

        Set<String> countries = new HashSet<>();

        for (Trip t : trips) {
            countries.add(t.country);
        }

        countries.forEach(System.out::println);
    }

    // Top 3 cities visited most
    private static void top3Cities(List<Trip> trips) {

        System.out.println("\n TOP 3 MOST VISITED CITIES ");

        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip t : trips) {
            cityCount.put(
                    t.city,
                    cityCount.getOrDefault(t.city, 0) + 1
            );
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(cityCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(
                    list.get(i).getKey() +
                            " → " +
                            list.get(i).getValue() + " trips");
        }
    }
}
