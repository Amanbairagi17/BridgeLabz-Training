package com.functionalinterface.defaultmethod.paymentgatewayintegration;

public class RazorpayProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Razorpay");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded Rs. " + amount + " via Razorpay");
    }
}
