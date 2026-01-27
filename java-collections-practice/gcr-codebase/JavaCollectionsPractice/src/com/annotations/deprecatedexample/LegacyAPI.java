package com.annotations.deprecatedexample;

public class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("This is the OLD feature (deprecated)");
    }

    void newFeature() {
        System.out.println("This is the NEW feature");
    }
}
