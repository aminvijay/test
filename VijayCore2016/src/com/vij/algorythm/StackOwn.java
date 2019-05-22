package com.vij.algorythm;

public class StackOwn {
	
	private int size;
	private String sArr[];
	private int top;
	
	public  StackOwn(int size) {
		this.size = size;
		top = 0;
		sArr = new String[size];
		
	}
	
	
	private void push(String str){
		if(top < size) {
			sArr[top] = str;
			top++;			
		}else {
			System.out.println(" Stack is full");
		}
	}
	
	private boolean empty() {
		
		return top==0?true:false;
	}
	
	private String peek() {
		
		if(!empty()){
			return sArr[top-1];
		}else {
			return null;
		}
		
	}
	private String pop() {
		
		if(!empty()){
			sArr[top] = null;
			top--;
			return peek();
		}else {
			System.out.println(" stack is empty can't pop.");
			return null;
			
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackOwn sw = new StackOwn(5);
		sw.push("1");
		sw.push("2");
		sw.push("3");
		sw.push("4");
		System.out.println(sw.peek());
		System.out.println(sw.pop());
		System.out.println(sw.pop());
		System.out.println(sw.pop());
		System.out.println(sw.pop());
		System.out.println(sw.pop());

	}

}
