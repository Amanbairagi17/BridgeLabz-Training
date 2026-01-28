package com.annotations.markannotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Class<Service> cls = Service.class;

        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod annotation =
                        method.getAnnotation(ImportantMethod.class);

                System.out.println("Method Name: " + method.getName());
                System.out.println("Importance Level: " + annotation.level());
                System.out.println("--------------------------");
            }
        }
    }
}
