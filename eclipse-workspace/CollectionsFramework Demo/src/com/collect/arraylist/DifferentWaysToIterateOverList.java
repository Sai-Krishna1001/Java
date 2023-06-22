package com.collect.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("C", "C++", "Java", "Python", "DotNet");
		
		//basic for loop
		System.out.println("basic for loop : ");
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		
		//Enhanced for each loop
		System.out.println("enhanced for loop : ");
		for (String course : courses) {
			System.out.println(course);
		}
		
		//basic loop with iterator
		System.out.println("basic loop with iterator : ");
		for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		//iterator with while loop
		System.out.println("iterator with while loop : ");
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		//Java 8 Stream + Lambda Example
		System.out.println("Java 8 Stream + Lamda : ");
		courses.stream().forEach(course -> System.out.println(course));
		
		//Java 8 forEach + Lambda
		System.out.println("Java 8 forEach + Lambda : ");
		courses.forEach(course -> System.out.println(course));
	}

}
