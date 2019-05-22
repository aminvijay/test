package com.test.algorythm;


//Arrays, linked lists, trees, etc. are best for
//data that represents real objects.

//Stacks & Queues are instead used to complete a 
//task and are soon after discarded.

//Stacks & Queues
//1. Allow only a single item to be added or removed at a time
//2. Stacks allow access to the last item inserted (LIFO)
//3. Queues allow access to the first item inserted (FIFO)


public class StackOwn {
	
	private String arr [];
	private int size;
	private int top;
	
	public StackOwn(int size) {
		this.size=size;
		top = 0;
		arr = new String[size];
	}
	
	
	public void push(String str){
		//check is stack is not full;
		if(top < size) {
			arr[top] = str;
			top++;
			
		}else {
			System.out.println("Stack is full, top is " + top);
		}
	}
	
	public boolean empty() {		
		return top==0?true:false;
	}
	
	//just return last element
	public String peek() {
		
		//check if stack is not empty
		if(!empty()){
			//here we ae using top-1 because in after adding in push, we are increasing top.
			return arr[top-1];
		}else{
			return null;
		}		
	}
	
	//return last element and then make last element empty
	public String pop() {
		
		
		if(!empty()){
			arr[top] = null;
			top--;
			return peek();
		}else {
			return null;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOwn stackOwn = new StackOwn(5);
		
		stackOwn.push("10");
		stackOwn.push("17");
		stackOwn.push("13");
		
		stackOwn.pop();
		stackOwn.pop();
		stackOwn.pop();

	}

}
