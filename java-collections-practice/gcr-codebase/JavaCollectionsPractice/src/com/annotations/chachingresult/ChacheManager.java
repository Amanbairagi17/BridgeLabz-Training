package com.annotations.chachingresult;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ChacheManager {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invoke(Object obj,
                                String methodName,
                                Object... args) {

        try {
            Class<?> cls = obj.getClass();

            // find matching method
            Method method = Arrays.stream(cls.getMethods())
                    .filter(m -> m.getName().equals(methodName))
                    .findFirst()
                    .orElseThrow();

            // check annotation
            if (!method.isAnnotationPresent(CacheResult.class)) {
                return method.invoke(obj, args);
            }

            // create cache key
            String key = method.getName() + Arrays.toString(args);

            // return cached result
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result...");
                return cache.get(key);
            }

            // compute and store
            Object result = method.invoke(obj, args);
            cache.put(key, result);

            return result;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
