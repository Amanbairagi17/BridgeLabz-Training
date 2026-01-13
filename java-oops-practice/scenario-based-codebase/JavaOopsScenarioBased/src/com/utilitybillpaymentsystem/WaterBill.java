package com.utilitybillpaymentsystem;

public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate, 30);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("Water Bill Reminder! Due on " + dueDate);
        }
    }
}
