package com.sortartistbytime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Artist {

    private String name;
    private LocalTime registrationTime;

    public Artist(String name, String time) {
        this.name = name;

        //for format time in correct order
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        //converting string to time 
        this.registrationTime =
                LocalTime.parse(time, formatter);
    }

    public LocalTime getRegistrationTime() {
        return registrationTime;
    }

    public String getName() {
        return name;
    }

	@Override
	public String toString() {
		return "Artist [name=" + name + ", registrationTime=" + registrationTime + "]";
	}
    
    
}