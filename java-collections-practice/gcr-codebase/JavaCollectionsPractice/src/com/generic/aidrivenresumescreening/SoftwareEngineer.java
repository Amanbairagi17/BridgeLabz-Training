package com.generic.aidrivenresumescreening;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        roleName = "Software Engineer";
    }

    @Override
    public void evaluateResume() {
        System.out.println(
            "Checking DSA, Java, Spring Boot, System Design");
    }
}
