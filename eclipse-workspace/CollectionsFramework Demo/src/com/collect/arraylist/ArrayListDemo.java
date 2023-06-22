package com.collect.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("krish");
		al.add("java");
		al.add(null);
		al.add("jhonny");
		al.add("panther");
		//al.add(20);
		al.add("tichala");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
