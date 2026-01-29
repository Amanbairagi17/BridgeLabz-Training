package com.reflactions.dicontainer;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIcontainer {

    private final Map<Class<?>, Object> container = new HashMap<>();

    public <T> T getBean(Class<T> clazz) {

        try {
            // return existing bean
            if (container.containsKey(clazz)) {
                return clazz.cast(container.get(clazz));
            }

            // create object
            T instance = clazz.getDeclaredConstructor().newInstance();
            container.put(clazz, instance);

            // inject dependencies
            for (Field field : clazz.getDeclaredFields()) {

                if (field.isAnnotationPresent(Inject.class)) {

                    Class<?> dependencyType = field.getType();

                    Object dependency = getBean(dependencyType);

                    field.setAccessible(true);
                    field.set(instance, dependency);
                }
            }

            return instance;

        } catch (Exception e) {
            throw new RuntimeException("DI failed for " + clazz.getName(), e);
        }
    }
}
