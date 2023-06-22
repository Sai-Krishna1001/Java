package com.checking;

import java.util.List;

public class ReverseLinkedList {
	static Node head;
	static Node tail;
	private int size;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void addFirst(int data) {
		Node node = new Node(data);
		if(head == null) {
			tail = node;
		}
		node.next = head;
		head = node;
		size++;
	}
	
	public void display() {
		Node currNode = head;
		while(currNode != null) {
			System.out.println(currNode.data + " ");
			currNode = currNode.next;
		}
		//System.out.println();
	}
	public Node reverseList(Node head) {
		Node prev = null;
		Node curr = head;
		while(curr != null) {
			Node next = curr.next;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	public int middleElement(Node head) {
		Node prev = head;
		Node post = head;
		while(post != null && post.next != null) {
			prev = prev.next;
			post = post.next.next;
		}
		if(post == null) {
			return prev.next.data;
		}else {
			
		}
		
		return prev.data;
		
	}
	public static void main(String[] args) {
		
		ReverseLinkedList rll = new ReverseLinkedList()
;
		rll.addFirst(1);
		rll.addFirst(2);
		rll.addFirst(3);
		rll.addFirst(4);
		//rll.addFirst(5);
		rll.reverseList(head);
		rll.display();
		System.out.println(rll.middleElement(head));

	}

}
