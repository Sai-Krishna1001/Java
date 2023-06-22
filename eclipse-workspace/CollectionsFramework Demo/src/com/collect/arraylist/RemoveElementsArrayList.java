package com.collect.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementsArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		
		//Adding new elements to the ArrayList
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("PineApple");
		
		System.out.println(fruits);
		
		//using remove() method for to remove the element at specific index (or) remove the specific element
		fruits.remove(2);
		System.out.println("After removing element at index 2 : \n" + fruits);
		fruits.remove("Orange");
		System.out.println("After removing element Orange : \n" + fruits);
		
		List<String> subFruitsList = new ArrayList<String>();
		
		subFruitsList.add("Apple");				
		subFruitsList.add("Banana");
		
		//using removeAll() method for remove the sublist of elements itself
		fruits.removeAll(subFruitsList);
		System.out.println("After removing Apple and Banana : \n" + fruits);
		
		//using clear() method for remove all elements from the list
		fruits.clear();
		System.out.println(fruits.isEmpty());
		
//		List<Integer> num = Arrays.asList(10,20,30,40);
//		
//		num.remove(3);
//		System.out.println(num);
	}

}
