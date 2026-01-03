package com.linkedlist.taskscheduler;

public class TaskSchedulerDriver {
    public static void main(String[] args) {
        TaskSchedulerLinkedlist scheduler = new TaskSchedulerLinkedlist();

        scheduler.addAtBeginning(1, "Design DB", 2, "10-Jan");
        scheduler.addAtEnd(2, "Write Code", 1, "12-Jan");
        scheduler.addAtEnd(3, "Testing", 2, "15-Jan");
        scheduler.addAtPosition(2, 4, "Review", 3, "11-Jan");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nCurrent Task Rotation:");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();

        System.out.println("\nSearch by Priority = 2:");
        scheduler.searchByPriority(2);

        scheduler.removeById(2);

        System.out.println("\nAfter Removing Task ID 2:");
        scheduler.displayAll();
    }
}

