package com.universitymanagement;

public class Undergraduate extends Student {

    public Undergraduate(int id, String name) {
        super(id, name);//calling super class constructor
    }


    public String getProgramType() {
        return "Undergraduate";
    }
}

