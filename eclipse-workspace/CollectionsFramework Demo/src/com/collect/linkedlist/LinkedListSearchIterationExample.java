package com.collect.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIterationExample {

	public static void main(String[] args) {
		
		LinkedList<String> progLangs = new LinkedList<>();
		
		progLangs.add("C");//0
		progLangs.add("C++");//1
		progLangs.add("Core Java");//2
		progLangs.add("Java EE");//3
		progLangs.add("C");//4
		progLangs.add("Spring Framework");//5 
		progLangs.add("Java EE");//6
		progLangs.add("Hibernate Framework");//7 
		
		boolean result = progLangs.contains("C");
		System.out.println("result = " + result);
		
		//Find the Index of the first occurrence of an element in the Linked List
		int index = progLangs.indexOf("Core Java");
		System.out.println("Index = "+ index);
		
		//Find the Index of the last occurrence of an element in the Linked List
		int lastIndex = progLangs.lastIndexOf("Java EE");
		System.out.println("Last Index : " + lastIndex);
		
		//iterator
		Iterator<String> iterator = progLangs.iterator();
		while (iterator.hasNext()) {
			String prog = (String) iterator.next();
			System.out.println(prog);
		}
		
		//for each
		progLangs.forEach(element -> System.out.println(element));
		
		//for each advanced loop
		for (String element : progLangs) {
			System.out.println(element);
		}
	}

}
