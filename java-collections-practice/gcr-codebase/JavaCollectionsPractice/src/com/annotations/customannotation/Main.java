package com.annotations.customannotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();

        // get class object
        Class<?> cls = manager.getClass();

        // get method
        Method method = cls.getMethod("submitTask");

        // get annotation
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        // read annotation values
        System.out.println("Priority   : " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}
