package com.test.colle;

import java.util.Queue;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack();
		st.push("abc");
		st.push("abc1");
		st.push("abc2");
		st.push("abc3");
		
		System.out.println("11 " + st);
		
		st.remove(1);
	
		System.out.println("12 " + st);
		

	}

}
