package com.streamapi.gymmembership;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GymMembership {
	public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
                new GymMember("Aman", LocalDate.now().plusDays(10)),
                new GymMember("Ravi", LocalDate.now().plusDays(40)),
                new GymMember("Neha", LocalDate.now().plusDays(25)),
                new GymMember("Priya", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        
        List<GymMember> expirinGymMembers = 
        		members.stream()
        			   .filter(member ->
        					   !member.getExpiryDate().isBefore(today) && 
        					   !member.getExpiryDate().isAfter(next30Days))
        			   .toList();
        expirinGymMembers.forEach(System.out::println);
	}

        
}
