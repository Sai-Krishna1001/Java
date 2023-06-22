package com.collect.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {
		
		List<String> topProgLang = new ArrayList<String>();
		
		//Find the size of an ArrayList
		System.out.println(topProgLang.size());
		
		//To check whether list is empty or not
		System.out.println(topProgLang.isEmpty());
		
		topProgLang.add("C");
		topProgLang.add("Java");
		topProgLang.add("C++");
		topProgLang.add("Python");
		
		System.out.println(topProgLang);
		System.out.println(topProgLang.size());
		System.out.println(topProgLang.isEmpty());
		
		//Retrieve the element at a given index
		System.out.println("element at index 2 in the list is : " + topProgLang.get(2));
		String bestProgLang = topProgLang.get(1);
		System.out.println("best programming language is : " + bestProgLang);
		
		//Modify the element at a given index
		topProgLang.set(3,"C#");
		System.out.println(topProgLang);
	}

}
