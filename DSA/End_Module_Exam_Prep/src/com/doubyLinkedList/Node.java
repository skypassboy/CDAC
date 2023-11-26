package com.doubyLinkedList;

public class Node {
	
	int data;
	Node prev,next;
	
	
	public Node() {
		this.data = 1;
		this.next= this.prev = null;
	}
	
	
	public Node(int data) {
		this.data = data;
		prev=next=null;
	}
	
	
	public String toString() {
		return data+" ";
	}
}
