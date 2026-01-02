package com.universitymanagement;

public class Postgraduate extends Student {

    public Postgraduate(int id, String name, double gpa) {
        super(id, name, gpa); //calling super class constructor
    }

    public String getProgramType() {
        return "Postgraduate";
    }
}

