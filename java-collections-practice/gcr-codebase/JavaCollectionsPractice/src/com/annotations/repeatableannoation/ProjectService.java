package com.annotations.repeatableannoation;

public class ProjectService {

    @BugReport(description = "NullPointerException on login")
    @BugReport(description = "UI breaks on mobile view")
    public void loginFeature() {
        System.out.println("Login feature executed");
    }
}

