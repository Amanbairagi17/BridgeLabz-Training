package com.regex.triporgainizersystem;

import java.io.Serializable;

class Trip implements Serializable {

    private static final long serialVersionUID = 1L;

    String title;
    String description;
    String city;
    String country;
    int durationDays;

    Trip(String title, String description,
         String city, String country,
         int durationDays) {

        this.title = title;
        this.description = description;
        this.city = city;
        this.country = country;
        this.durationDays = durationDays;
    }

    @Override
    public String toString() {
        return title + " | " + city + ", " + country +
                " | " + durationDays + " days";
    }
}
