package com.lambdaexpression.notifiacationfiltering;

import java.util.List;
import java.util.function.Predicate;

public class NotificationFilter {
	public static void main(String[] args) {
		List<Alert> alerts = List.of(
	            new Alert("Heart rate critical", "EMERGENCY"),
	            new Alert("Take medicine at 8 PM", "MEDICINE"),
	            new Alert("Doctor appointment reminder", "GENERAL"),
	            new Alert("Blood pressure high", "EMERGENCY"),
	            new Alert("Health tips for today", "GENERAL")
	        );
		
		Predicate<Alert> emergecyOnly = alert -> alert.type.equalsIgnoreCase("Emergency");
		alerts.stream().filter(emergecyOnly).forEach(a -> System.out.println(a.message));
	}
}
