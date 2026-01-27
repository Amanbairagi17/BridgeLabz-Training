package com.annotations.supresswarning;

import java.util.ArrayList;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // warning suppressed

        list.add("Java");
        list.add(10);

        System.out.println(list);
    }
}
