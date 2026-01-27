package com.annotations.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // needed for reflection
@Target(ElementType.METHOD)           // can be used on methods
public @interface TaskInfo {

    String priority();
    String assignedTo();
}

