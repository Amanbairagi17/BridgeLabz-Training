package com.ewalletapplication;

public class Transaction {
    public static void log(String type, double amount) {
        System.out.println("[Transaction] " + type + " | Amount: ₹" + amount);
    }
}
