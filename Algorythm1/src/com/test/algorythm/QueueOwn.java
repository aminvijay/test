package com.test.algorythm;

import java.util.Arrays;

public class QueueOwn {
	
	private String[] str;
	private int queueSize;
	private int front, noOfItems, rear;
	
	public QueueOwn(int size){
		queueSize = size;
		str = new String[size];
		
		Arrays.fill(str, "-1");
	}
	
	private void insert(String ele){
		
		if(noOfItems+1< queueSize){
			// queue is first in first out so, element always goes rear
			str[rear] = ele;
			rear++;
			noOfItems++;
			System.out.println("INSERT " + ele + " Was Added to the Stack\n");			
			
		}else {
			System.out.println(" Queue is full. noOfItems = " + noOfItems);
		}
	}
	
	private boolean isEmpty() {
		return noOfItems<=0?true:false;
	}
	
	
	private String peek() {
		
		if(!isEmpty()){
			return str[front];
		}else{
			return null;
		}
	}
	
	private String remove() {
		
		String ss = null;
		
		//System.out.println( " isEmpty() " + isEmpty());
		 
		if(!isEmpty()){
			
			ss = peek();
			str[front] = "-1";
			front++;
			noOfItems--;
			System.out.println("removed  " + ss + " Was removed from the Stack\n");	
		}else {
			System.out.println(" Queue is empty.");
		}
		return ss;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueOwn queueOwn = new QueueOwn(3);
		
		queueOwn.insert("10");
		queueOwn.remove();
		queueOwn.remove();
		queueOwn.insert("17");
		queueOwn.insert("13");
		queueOwn.insert("3");
		queueOwn.insert("32");
		
		
		queueOwn.remove();
		queueOwn.remove();
		queueOwn.remove();
		queueOwn.remove();
		queueOwn.remove();

	}

}
