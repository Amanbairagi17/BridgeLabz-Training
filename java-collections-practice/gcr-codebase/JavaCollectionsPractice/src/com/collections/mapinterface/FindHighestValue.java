package com.collections.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindHighestValue {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 23);
		map.put("C", 15);
		map.put("D", 30);
		map.put("E", 36);
		
		int max = -1;
		String key = "";
		
		for (String s : map.keySet()) {

            if (map.get(s) > max) {
                max = map.get(s);
                key = s;
            }
        }

        System.out.println("Max value = " + max);
        System.out.println("Key = " + key);
		
	} 
}
