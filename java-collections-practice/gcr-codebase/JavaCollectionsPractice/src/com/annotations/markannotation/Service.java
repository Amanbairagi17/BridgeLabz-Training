package com.annotations.markannotation;

public class Service {

    @ImportantMethod
    public void processOrder() {
        System.out.println("Processing order...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void generateInvoice() {
        System.out.println("Generating invoice...");
    }

    public void normalMethod() {
        System.out.println("Normal method");
    }
}
