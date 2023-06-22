package com.checking;

import java.util.*;
  
public class Test {
    
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public Node head = null;
	public Node tail = null;
	public void addLast(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
		}else {
			tail.next = node;
			tail = node;
		}
	}
	
	public Node reverseLinkedList(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			curr = next;
		}
		head = prev;
		return head;
	}
	
	
	public static void main(String[] args) {
		
		
	}
}