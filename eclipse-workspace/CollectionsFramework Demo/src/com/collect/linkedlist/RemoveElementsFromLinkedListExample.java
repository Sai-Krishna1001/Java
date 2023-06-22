package com.collect.linkedlist;

import java.util.LinkedList;

public class RemoveElementsFromLinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("orange");
		fruits.add("Mango");
		fruits.add("Mango");
		
		System.out.println("Initial LinkedList : \n" + fruits);
		
		//Remove the first element in the LinkedList
		String element = fruits.removeFirst();
		System.out.println("After remove first element : \n" + fruits);
		
		//Remove the last element in the LinkedList
		fruits.removeLast();
		System.out.println("After remove last element : \n" + fruits);
		
		//Remove the first occurrence of the element
		fruits.removeFirstOccurrence("Banana");
		System.out.println("After remove the first occurrence of element Banana : \n" + fruits );
		
		//Remove the last occurrence of the element
		fruits.removeLastOccurrence("Mango");
		System.out.println("After remove the last occurrence of element Mango : \n" + fruits);
		
		//Remove the all elements of the LinkedList
		fruits.clear();
		System.out.println(fruits);
	}

}
