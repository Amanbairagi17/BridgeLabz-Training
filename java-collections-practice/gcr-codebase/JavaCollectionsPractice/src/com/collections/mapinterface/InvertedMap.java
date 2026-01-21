package com.collections.mapinterface;

import java.lang.foreign.AddressLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertedMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 1);
		map.put("D", 3);
		map.put("E", 3);
		
		Map<Integer, List<String>> inverted = new HashMap<>();
		
		for(Map.Entry<String, Integer> mpEntry : map.entrySet()) {
			Integer value = mpEntry.getValue();
            String key = mpEntry.getKey();
            
            inverted
            .computeIfAbsent(value, k -> new ArrayList<>())
            .add(key);
		}
		
		for(int num : inverted.keySet()) {
			
			List<String> strings = inverted.get(num);
			System.out.println("[ Key :" +num+ "], [" +strings+ "]");
			
		}
	}
}
