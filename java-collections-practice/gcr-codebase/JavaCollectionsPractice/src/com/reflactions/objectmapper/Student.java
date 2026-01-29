package com.reflections.objectmapper;

public class Student {

    private int id;
    private String name;
    private double marks;

    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks + '}';
    }
}
