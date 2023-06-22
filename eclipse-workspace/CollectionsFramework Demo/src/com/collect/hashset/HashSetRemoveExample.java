package com.collect.hashset;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRemoveExample {

	public static void main(String[] args) {

		Set<String> progLangs = new HashSet<String>();
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("Core Java");
		progLangs.add("Java EE");
		progLangs.add("Python"); 
		progLangs.add("Python"); 
		progLangs.add("Scala");
		
		System.out.println(progLangs);
		
		//using remove() method
		progLangs.remove("Java EE");
		System.out.println(progLangs);
		
		List<String> prog = Arrays.asList("C", "C++");
		
		//using removeAll() method
		progLangs.removeAll(prog);
		System.out.println(progLangs);
		
		//using removeIf() method
		progLangs.removeIf(course -> course.equals("Python"));
		System.out.println(progLangs);
		
		//using clear() method
		progLangs.clear();
		System.out.println(progLangs);
		
	}

}
