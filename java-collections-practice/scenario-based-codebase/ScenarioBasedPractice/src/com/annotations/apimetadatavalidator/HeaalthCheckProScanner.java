package com.annotations.apimetadatavalidator;

import java.lang.reflect.Method;

public class HeaalthCheckProScanner {
    public static void scanClass(Class<?> clazz) {

        for (Method method : clazz.getDeclaredMethods()) {

            boolean isPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean isInternalAPI = method.isAnnotationPresent(InternalAPI.class);

            if (!isPublicAPI && !isInternalAPI) {
                System.out.println("Missing annotation on method: " + method.getName());
            }

            if (isPublicAPI) {
                PublicAPI api = method.getAnnotation(PublicAPI.class);
                System.out.println("API: " + method.getName());
                System.out.println("Description: " + api.description());

                if (method.isAnnotationPresent(RequiresAuth.class)) {
                    RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
                    System.out.println("Auth Required: " + auth.role());
                } else {
                    System.out.println("Auth Required: NO");
                }
                System.out.println("------------");
            }
        }
    }
}
