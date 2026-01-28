package com.annotations.rolebaseaccessed;

import java.lang.reflect.Method;

public class AccessManager {

    public static void invoke(Object obj, String methodName) {

        try {
            Method method =
                    obj.getClass().getMethod(methodName);

            RoleAllowed roleAllowed =
                    method.getAnnotation(RoleAllowed.class);

            // if method has role restriction
            if (roleAllowed != null) {

                String requiredRole = roleAllowed.value();
                String currentRole = SecurityContext.getRole();

                if (!requiredRole.equals(currentRole)) {
                    System.out.println("Access Denied!");
                    return;
                }
            }

            // allowed → invoke method
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
