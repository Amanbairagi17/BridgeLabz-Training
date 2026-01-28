package com.junit;

public class TaskService {
	public String longRunningTask() throws InterruptedException {
        // simulate long task
        Thread.sleep(3000);   // 3 seconds
        return "Task Completed";
    }
}
