package com.collect.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetFromCollectionExample {

	public static void main(String[] args) {
		
		Set<Integer> odd = new HashSet<Integer>();
		odd.add(1);		
		odd.add(3);		
		odd.add(9);		
		odd.add(7);		
		odd.add(9);	
		
		//Create a HashSet from another collection using the HashSet(Collection c) Constructor
		Set<Integer> num = new HashSet<Integer>(odd);
		
		System.out.println(num);
		
		Set<Integer> even = new HashSet<Integer>();
		even.add(2);
		even.add(4);
		even.add(16);
		even.add(8);
		even.add(10);
		
		//Add all the elements from the collection to the HashSet using the addAll() method
		num.addAll(even);
		
		System.out.println(num);
	}

}
