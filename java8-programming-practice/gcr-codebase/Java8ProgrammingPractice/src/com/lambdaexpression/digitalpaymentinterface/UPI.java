package com.lambdaexpression.digitalpaymentinterface;

public class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
