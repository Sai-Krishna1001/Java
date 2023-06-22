package com.collect.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysToIterateSet {

	public static void main(String[] args) {
		
		Set<String> progLangs = new HashSet<String>();
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("Core Java");
		progLangs.add("Java EE");
		progLangs.add("Python"); 
		progLangs.add("Scala");
		
		//Enhanced for loop
		for (String course : progLangs) {
			System.out.println(course);
		}
		
		//Basic loop with iterator
		for (Iterator iterator = progLangs.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		//While loop with iterator
		Iterator<String> iterator = progLangs.iterator();
		while (iterator.hasNext()) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		//JDK8 forEach() method with Lambda
		progLangs.forEach(course -> System.out.println(course));
		
		//JDK8 streaming + forEach() + Lambda Expression
		System.out.println("=======================");
		progLangs.stream().filter(course -> !(course.equals("Python")))
		.forEach(course -> System.out.println(course));
	}

}
