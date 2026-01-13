package com.utilitybillpaymentsystem;

public class ElectricalBill extends Bill{

    public ElectricalBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate, 50);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("Electricity Bill Reminder! Due on " + dueDate);
        }
    }
}
