package com.performance;

import java.util.Arrays;
import java.util.Random;


public class SortingComparasion {
    public static void main(String[] args) {

        int n = 50_000;
        int[] data = new Random().ints(n, 0, n).toArray();

        int[] bubbleData = data.clone();
        int[] fastData = data.clone();

        BenchmarkUtils.measure("Bubble Sort O(N^2)", () -> {
            for (int i = 0; i < 5000; i++) {
                for (int j = 0; j < 5000 - i - 1; j++) {
                    if (bubbleData[j] > bubbleData[j + 1]) {
                        int t = bubbleData[j];
                        bubbleData[j] = bubbleData[j + 1];
                        bubbleData[j + 1] = t;
                    }
                }
            }
        });

        BenchmarkUtils.measure("Arrays.sort O(N log N)", () -> {
            Arrays.sort(fastData);
        });
        
//        Output
//        Bubble Sort O(N^2) → 40.2516 ms
//        Arrays.sort O(N log N) → 33.8114 ms
    }
}
