package com.reflactions.accessandmodify;

import java.lang.reflect.Field;

public class ModifyStaticfiled {
    public static void main(String[] args) throws Exception {

        Class<Configuration> clazz = Configuration.class;

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        // null because static field belongs to class
        field.set(null, "NEW_API_KEY_999");

        Configuration.printKey();
    }
}
