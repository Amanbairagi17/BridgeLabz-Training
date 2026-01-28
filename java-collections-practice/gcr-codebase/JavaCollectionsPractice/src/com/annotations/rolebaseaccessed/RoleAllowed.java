package com.annotations.rolebaseaccessed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // available at runtime
@Target(ElementType.METHOD)            // applied on methods
public @interface RoleAllowed {
    String value();   // required role
}
