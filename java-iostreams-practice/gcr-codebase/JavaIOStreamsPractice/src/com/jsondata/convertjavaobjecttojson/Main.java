package com.jsondata.convertjavaobjecttojson;

import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
	public static void main(String[] args) {

        Car car = new Car("BMW", 2023, 6500000);

        JSONObject json = new JSONObject(car);

        System.out.println(json.toString(4));
    }
}
