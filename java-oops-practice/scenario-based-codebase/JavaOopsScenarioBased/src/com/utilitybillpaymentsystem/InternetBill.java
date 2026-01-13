package com.utilitybillpaymentsystem;

public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate, 70);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("Internet Bill Reminder! Due on " + dueDate);
        }
    }
}
