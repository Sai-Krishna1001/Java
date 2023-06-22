package com.collect.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {

	public static void main(String[] args) {
		
		//create HashMap
		Map<Integer, Student> StudentMap = new HashMap<Integer, Student>();
		
		StudentMap.put(1, new Student("Sai", "Krishna"));
		StudentMap.put(2, new Student("Tony", "Stark"));
		StudentMap.put(3, new Student("Peter", "Parker"));
		
		System.out.println(StudentMap.values()); 
	}

}
