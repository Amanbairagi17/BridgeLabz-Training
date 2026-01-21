package com.generic.aidrivenresumescreening;

public class ProductManager extends JobRole {

    public ProductManager() {
        roleName = "Product Manager";
    }

    @Override
    public void evaluateResume() {
        System.out.println(
            "Checking product sense, analytics, leadership");
    }
}

