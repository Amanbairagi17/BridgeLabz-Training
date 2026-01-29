package com.reflactions.methodexecutiontime;

public class Main {

    public static void main(String[] args) {

        TaskService service = new TaskService();

        ExecutionTimeTracker.executeWithTiming(service);
    }
}
