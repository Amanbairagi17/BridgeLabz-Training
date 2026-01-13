package com.performance;

public class StringConcatBenchmark {
    public static void main(String[] args) {

        int n = 100_000;

        BenchmarkUtils.measure("String O(N^2)", () -> {
            String s = "";
            for (int i = 0; i < n; i++) s += "x";
        });

        BenchmarkUtils.measure("StringBuilder O(N)", () -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) sb.append("x");
        });

        BenchmarkUtils.measure("StringBuffer O(N)", () -> {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) sb.append("x");
        });
    }
}
