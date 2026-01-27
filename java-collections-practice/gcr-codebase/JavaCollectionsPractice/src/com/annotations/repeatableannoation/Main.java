package com.annotations.repeatableannoation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Method method =
                ProjectService.class.getMethod("loginFeature");

        BugReport[] bugs =
                method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugs) {
            System.out.println("Bug: " + bug.description());
        }
    }
}
