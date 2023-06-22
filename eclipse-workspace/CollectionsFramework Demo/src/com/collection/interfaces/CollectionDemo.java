package com.collection.interfaces;

import java.util.ArrayList;
import java.util.Collection; 

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		fruits.add("goa");
		fruits.add("kiwi");
		boolean x = fruits.contains("apple");
		System.out.println(x);
		System.out.println(fruits);
		fruits.remove("apple");
		boolean y = fruits.contains("apple");
		System.out.println(fruits + String.valueOf(y));
		
		fruits.forEach((element)->{
			System.out.print(element + " ");
		});
		fruits.clear();
		System.out.println(fruits.isEmpty());
	}

}
