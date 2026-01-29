package com.reflactions.methodexecutiontime;

import java.lang.reflect.Method;

public class ExecutionTimeTracker {

    public static void executeWithTiming(Object obj) {

        Class<?> clazz = obj.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {

            // skip methods with parameters
            if (method.getParameterCount() > 0)
                continue;

            try {
                long start = System.nanoTime();

                method.setAccessible(true);
                method.invoke(obj);

                long end = System.nanoTime();

                long timeMs = (end - start) / 1_000_000;

                System.out.println(
                        "Method: " + method.getName() +
                        " | Time: " + timeMs + " ms"
                );

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
