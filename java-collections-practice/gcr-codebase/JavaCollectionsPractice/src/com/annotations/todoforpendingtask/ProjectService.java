package com.annotations.todoforpendingtask;

public class ProjectService {

    @Todo(
        task = "Implement user login",
        assignedTo = "Aman",
        priority = "HIGH"
    )
    public void loginFeature() {
    }

    @Todo(
        task = "Add payment gateway",
        assignedTo = "Rahul"
    )
    public void paymentFeature() {
    }

    @Todo(
        task = "Optimize database queries",
        assignedTo = "Neha",
        priority = "LOW"
    )
    public void optimizationTask() {
    }

    public void completedMethod() {
    }
}
