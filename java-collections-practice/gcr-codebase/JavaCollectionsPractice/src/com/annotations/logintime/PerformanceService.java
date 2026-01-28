package com.annotations.logintime;

public class PerformanceService {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1_000_000; i++) {
            // fast loop
        }
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 50_000_000; i++) {
            // slow loop
        }
    }

    public void normalMethod() {
        System.out.println("Not measured");
    }
}
