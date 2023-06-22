package com.collect.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

	public static void main(String[] args) {
		//create ArrayList object
		List<Integer> odd = new ArrayList<Integer>();
		
		odd.add(1);
		odd.add(3);
		odd.add(5);
		odd.add(7);
		odd.add(9);
		//to create an ArrayList from an another collection using 
		//the ArrayList(collection c) constructor
		List<Integer> oddEven = new ArrayList<>(odd);
		
		List<Integer> even = new ArrayList<Integer>();
		
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		//to add all the elements from an existing collection to the
		//new ArrayList using addAll() method
		oddEven.addAll(even);
		
		System.out.println(oddEven);
	}

}
