package com.functionalinterface.defaultmethod.paymentgatewayintegration;

public interface PaymentProcessor {

    void pay(double amount);

    // New requirement added later
    default void refund(double amount) {
        System.out.println("Refund is not supported by this payment provider.");
    }
}
