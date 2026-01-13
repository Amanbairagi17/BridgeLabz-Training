package com.performance;

import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {

        int n = 1_000_000;

        List<Integer> list = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = n - 1;

        BenchmarkUtils.measure("ArrayList Search O(N)", () -> list.contains(target));
        BenchmarkUtils.measure("HashSet Search O(1)", () -> hashSet.contains(target));
        BenchmarkUtils.measure("TreeSet Search O(log N)", () -> treeSet.contains(target));
    }
}
