package com.annotations.serialization;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)   // needed at runtime
@Target(ElementType.FIELD)             // applied on fields
public @interface JsonField {
    String name();   // custom JSON key
}
