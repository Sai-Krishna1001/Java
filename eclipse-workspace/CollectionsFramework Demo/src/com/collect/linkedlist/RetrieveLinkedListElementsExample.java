package com.collect.linkedlist;

import java.util.LinkedList;

public class RetrieveLinkedListElementsExample {

	
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("orange");
		
		//Getting the first element in the LinkedList 
		String firstElement = fruits.getFirst();
		System.out.println("first element : " + firstElement);
		
		//Getting the last element in the LinkedList
		String lastElement = fruits.getLast();
		System.out.println("last element : " + lastElement);
		
		//Getting the element at a given position in the LinkedList
		System.out.println("element at aindex 2 : " + fruits.get(2));
		
		//Get the all elements from the LinkedList
		for (String element : fruits) {
			System.out.println(element);
		}
	}

}
