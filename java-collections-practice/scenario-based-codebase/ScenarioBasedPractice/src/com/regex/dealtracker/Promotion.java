package com.regex.dealtracker;

public abstract class Promotion<T> {

    protected String dealCode;
    protected T benefit;

    public Promotion(String dealCode, T benefit) {
        this.dealCode = dealCode;
        this.benefit = benefit;
    }

    public String getDealCode() {
        return dealCode;
    }

    public T getBenefit() {
        return benefit;
    }
}
