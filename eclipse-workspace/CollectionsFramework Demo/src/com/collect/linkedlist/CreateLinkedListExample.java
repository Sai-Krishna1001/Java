package com.collect.linkedlist;

import java.util.LinkedList;

public class CreateLinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		System.out.println("Initial LinkedList -> " + fruits);
		
		//Adding an element at the specified position in the LinkedList
		fruits.add(2,"Watermelon");
		System.out.println("After adding watermelon -> " + fruits);
		
		//Adding an element at the beginning of the LinkedList
		fruits.addFirst("Strawberry");
		System.out.println("After adding strawberry -> " + fruits);
		
		//Adding an element at the end of the LinkedList
		fruits.addLast("Orange");
		System.out.println("After adding orange -> " + fruits);
	}

}
