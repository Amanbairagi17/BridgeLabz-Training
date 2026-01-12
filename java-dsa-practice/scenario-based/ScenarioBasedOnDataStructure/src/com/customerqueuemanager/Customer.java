package com.customerqueuemanager;

public class Customer {
    String id; // customer id
    String name;// customer name 
    boolean isVIP; // checking customer vip 
    long arrivalTime; // call arrival time 

    Customer(String id, String name, boolean isVIP) {
        this.id = id;
        this.name = name;
        this.isVIP = isVIP;
        this.arrivalTime = System.nanoTime(); // to maintain arrival order
    }
}
