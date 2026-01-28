package com.annotations.chachingresult;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // needed at runtime
@Target(ElementType.METHOD)            // applied on methods
public @interface CacheResult {
}
