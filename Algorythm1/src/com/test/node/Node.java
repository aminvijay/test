package com.test.node;

public class Node {

	Object  data;
	Node next;
	
	public Object  getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}	
	
	public Node(Object  data){
		this.data = data;
		this.next = null;
	}
	
	public Node(Object  data, Node n){
		this.data = data;
		this.next = n;
	}
}
