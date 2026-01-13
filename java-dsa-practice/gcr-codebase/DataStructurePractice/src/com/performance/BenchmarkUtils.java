package com.performance;

public class BenchmarkUtils {
    public static void measure(String label, Runnable task) {
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        System.out.println(label + " → " + (end - start) / 1_000_000.0 + " ms");
    }
}
