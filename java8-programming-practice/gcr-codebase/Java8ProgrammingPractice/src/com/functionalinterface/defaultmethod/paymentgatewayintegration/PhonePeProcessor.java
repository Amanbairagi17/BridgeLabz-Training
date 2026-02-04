package com.functionalinterface.defaultmethod.paymentgatewayintegration;

public class PhonePeProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using PhonePe");
    }
}
