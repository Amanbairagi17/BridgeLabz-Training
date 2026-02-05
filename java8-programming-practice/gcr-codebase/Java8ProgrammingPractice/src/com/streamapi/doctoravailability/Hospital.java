package com.streamapi.doctoravailability;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hospital {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Sharma", "Cardiology", true),
                new Doctor("Dr. Mehta", "Neurology", false),
                new Doctor("Dr. Singh", "Orthopedics", true),
                new Doctor("Dr. Rao", "Dermatology", true)
        );

        List<Doctor> weekendDoctors =
                doctors.stream()
                        .filter(Doctor::isAvailableOnWeekend)   // Filter weekend doctors
                        .sorted(Comparator.comparing(Doctor::getSpecialty)) // Sort by specialty
                        .toList();

        weekendDoctors.forEach(System.out::println);
    }
}
