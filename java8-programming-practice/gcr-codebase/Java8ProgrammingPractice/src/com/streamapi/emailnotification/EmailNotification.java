package com.streamapi.emailnotification;

import java.util.*;

public class EmailNotification {

    public static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "aman@gmail.com",
                "neha@gmail.com",
                "ravi@gmail.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }
}
