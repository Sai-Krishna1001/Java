package com.collect.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

	public static void main(String[] args) {
		//Unordered Collection
		Set<String> progLangs = new HashSet<String>();
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("Core Java");
		progLangs.add("Java EE");
		progLangs.add("Python"); 
		progLangs.add("Scala");
		
		System.out.println(progLangs);
		
		//let's add duplicate element
		progLangs.add("C++");
		System.out.println(progLangs);
		
	}

}
