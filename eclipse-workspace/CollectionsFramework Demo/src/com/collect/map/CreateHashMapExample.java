package com.collect.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateHashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> numberMapping = new HashMap<String, Integer>();
		//add key-value to map
		numberMapping.put("one", 1);
		numberMapping.put("two", 2);
		numberMapping.put("three", 3);
		numberMapping.put("four", 4);
		numberMapping.put("five", 5);
		
		numberMapping.put(null, 6);
		numberMapping.put(null, 7);
		
		System.out.println(numberMapping);
		
		//Check if a HashMap is empty or not
		System.out.println(numberMapping.isEmpty());
		
		//find the size of HashMap
		System.out.println(numberMapping.size());

		//Check if a key exists in the HashMap
		System.out.println(numberMapping.containsKey("Four") ? "Exist key" : "Not Exist key");
		
		//Check if a key exists in the HashMap
		System.out.println(numberMapping.containsValue(5) ? "Exist value" : "Not Exist value");
		
		//get value by key
		Integer v1 = numberMapping.get("one");
		System.out.println("v1 = " + v1);
		
		//Remove keys from HashMap
		numberMapping.remove("one");
		System.out.println(numberMapping);
		
		Set<String> keys = numberMapping.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = numberMapping.values();
		System.out.println(values);
		
		//different ways to iterate over HashMap
		
		//for each method
		for(Map.Entry<String, Integer> entry : numberMapping.entrySet())
		{
			System.out.println("key->" + entry.getKey() + "value->" + entry.getValue());
		}
		
		System.out.println("========================================= ");
		//using iterator method
		Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry  = iterator.next();
			System.out.println("key->" + entry.getKey() + " value->" + entry.getValue());
		}
		
		System.out.println("========================================= ");
		//HashMap using java8 forEach
		numberMapping.forEach((k,v)-> System.out.println("K : " + k + " V : " + v) );
	}

}
