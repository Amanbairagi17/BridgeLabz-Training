package com.sortingmedicinesbyexpiry;

public class Medicine {

    private String name;
    private int expiryDays;

    public Medicine(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    @Override
    public String toString() {
        return name + " : " + expiryDays + " days";
    }
}
