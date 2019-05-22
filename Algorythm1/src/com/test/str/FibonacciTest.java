package com.test.str;

import java.util.Arrays;

public class FibonacciTest {

	public static void main(String[] args) {
		String no = simpleLoop(5);
		System.out.println("no " + no);
		System.out.println("no11  " + fibNo(5));;
	}
	
	private static String simpleLoop(int no){
		
		int ar[] = new int[no];
		ar[0] = 0;
		ar[1] = 1;
		
		for(int i = 2; i < no; i++){
			ar[i] = ar[i-1] + ar[i-2];
		}
		
		return Arrays.toString(ar);
	}
	
	
	public static int fibNo(int no){
		
		if(no == 0){
			return 0;
		}
		
		if (no == 1) {
			return 1;
		}
		//System.out.println("no " + no);
		return fibNo(no-1) + fibNo(no-2);
	}

}
