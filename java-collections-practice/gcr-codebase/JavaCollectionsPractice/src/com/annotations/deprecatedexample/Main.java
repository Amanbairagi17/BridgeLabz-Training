package com.annotations.deprecatedexample;

public class Main {
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // compiler warning
        api.newFeature();   // recommended
    }
}
