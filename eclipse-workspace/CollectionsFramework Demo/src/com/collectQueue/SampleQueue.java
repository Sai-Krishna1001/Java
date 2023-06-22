package com.collectQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
//FIFO(First In First Out)//first element is removed first and last element is removed at last
public class SampleQueue {
	// methods
	// 1. add()
	// 2. remove()//removes the head of the queue
	// 3. offer() insert the element into the queue
	// 4. poll()//fetch and removes the head of the queue , or returns null if the
	// queue is empty
	// 5. element() retrieves but not remove the head of the queue
	// 6. peek() retrieves , but does not remove the head of the queue,or returns
	// null if the queue is empty
	/*
	 * java.util.PriorityQueue not following or does not orders the element in fifo
	 * pattern it inherits AbstractQueue Class
	 */
	static void queueImpl() {
		
		Queue q2= new LinkedList<String>();
		Queue<String> q1 = new LinkedList<String>();
		q1.add("Kiran");
		q1.add("Mohit");
		q1.add("Santosh");
		q1.add("Mudit");
		Iterator i1 = q1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println();
		System.out.println("Remove element from queue");
		q1.remove();//First element Kiran
		q1.remove("Mudit");
		
		Iterator i2 = q1.iterator();
		while (i2.hasNext())
		{
			System.out.println(i2.next());//Mohit Santosh
		}
		System.out.println();
		System.out.println("Add New element");
		
		q1.offer("Jay"); //add element at end of the queue
		
		
		Iterator i3 = q1.iterator();
		while (i3.hasNext())
		{
			System.out.println(i3.next());//Mohit Santosh Jay
		}
		System.out.println(q1.element());
		
		//System.out.println(q2.element());//throw NoSuchElementException(if queue is empty)
		
		
		System.out.println(q1.peek());
		System.out.println(q2.peek());//returns null if the queue is empty
		
		
		System.out.println(q1.poll());//fetch and removes the head of the queue
		
		
		System.out.println(q1);
		
		System.out.println(q2.poll());//returns null if the queue is empty
		
		
		
	}
	
	
	static void priorityqueueImpl()
	{
		PriorityQueue< String> pq1= new PriorityQueue<String>();
		
		pq1.add("Kiran");
		pq1.add("Mohit");
		pq1.add("Santosh");
		pq1.add("Mudit");
		Iterator i3 = pq1.iterator();
		while (i3.hasNext())
		{
			System.out.println(i3.next());
		}
		
		System.out.println("head "+pq1.element());
		System.out.println("head "+pq1.peek());
		
	//	pq1.remove();
	pq1.poll();
		System.out.println("After removing elements");
		
		System.out.println(pq1);
	}
	
	public static void main(String[] args) {
		System.out.println("Queue Implementation");
		queueImpl();
		
		System.out.println("PriorityQueue Implementation");
		
		priorityqueueImpl();
		
		
	}
}