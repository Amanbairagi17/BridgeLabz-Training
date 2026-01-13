package com.performance;

import java.util.Arrays;

public class LinearSearchAndBinarySearch {

    public static void main(String[] args) {

        int n = 1_000_000;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = i;
        int target = n - 1;

        BenchmarkUtils.measure("Linear Search O(N)", () -> {
            for (int x : arr) {
                if (x == target) break;
            }
        });

        Arrays.sort(arr);
        BenchmarkUtils.measure("Binary Search O(log N)", () -> {
            Arrays.binarySearch(arr, target);
        });
        
        //Output 
//        Linear Search O(N) → 4.9076 ms
//        Binary Search O(log N) → 0.0127 ms

    }
}
