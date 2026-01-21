package com.generic.aidrivenresumescreening;

public class DataScientist extends JobRole {

    public DataScientist() {
        roleName = "Data Scientist";
    }

    @Override
    public void evaluateResume() {
        System.out.println(
            "Checking Python, ML, Statistics, SQL");
    }
}

