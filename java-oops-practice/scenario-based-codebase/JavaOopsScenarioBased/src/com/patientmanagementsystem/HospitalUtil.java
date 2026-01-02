package com.patientmanagementsystem;

public class HospitalUtil {

    public static boolean validateUserInput(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean checkLoanEligibility(double billAmount) {
        return billAmount > 50000;
    }

    public static double calculateDiscount(double amount) {
        return (amount > 20000) ? amount * 0.10 : 0;
    }
}

