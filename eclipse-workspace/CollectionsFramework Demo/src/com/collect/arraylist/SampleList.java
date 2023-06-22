package com.collect.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SampleList {

void addElement() {
		
		List l1= new ArrayList();
		//Add element in arrayList
		l1.add("A");
		l1.add(23);
		l1.add(23.5f);
		l1.add('Y');
		//add element with index
		l1.add(3, 12);
		//	l1.add(6, 23);//throws IndexOutofBoundException
		System.out.println("Before updating 3rd index "+l1);
		//updating element on exist index
		l1.set(3,"Asma");
		//l1.set(5, 11);//throws IndexOutofBoundException
		
		System.out.println("After updating 3rd index "+l1);
		l1.add(23);
		
		System.out.println(l1);
		
		System.out.println(l1.size());//size
		System.out.println(l1.get(4));//get value based on index
		
		System.out.println(l1.contains("a"));//check the existence of element
		
		System.out.println("The index of 23.5f is "+l1.indexOf(23.5f));//get index upon value
		
		
		//Iterator Interface
		
		Iterator i= l1.iterator();
		
		while(i.hasNext())
		{
			
			System.out.print(i.next()+" , ");
		}
		
		//ListIterator Interface(Bi directional)
		ListIterator li1= l1.listIterator();
		
		System.out.println("Forward Direction");
		while(li1.hasNext())
		{
			System.out.print(li1.next()+" , ");
		}
		System.out.println();
		System.out.println("Backward Direction");
		while(li1.hasPrevious())
		{
			System.out.print(li1.previous()+" ,");
		}
	}
	public static void main(String[] args) {
		SampleList lImpl= new SampleList();
		lImpl.addElement();
	}

}
