package com.annotations.customannotation;

public class TaskManager {

    @TaskInfo(
        priority = "High",
        assignedTo = "Aman"
    )
    public void submitTask() {
        System.out.println("Task submitted successfully");
    }
}
