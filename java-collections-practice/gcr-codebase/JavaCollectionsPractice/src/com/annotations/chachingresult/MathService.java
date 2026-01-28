package com.annotations.chachingresult;

public class MathService {

    @CacheResult
    public int factorial(int n) {

        System.out.println("Computing factorial for: " + n);

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
