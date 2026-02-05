package com.streamapi.eventattende;
import java.util.*;

public class Welcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
                "Aman",
                "Ravi",
                "Neha",
                "Priya"
        );

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
