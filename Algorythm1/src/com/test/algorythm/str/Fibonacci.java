package com.test.algorythm.str;

public class Fibonacci {

	public static void main(String[] args) {
		int fibCount = 15;
		
		int a[] = new int[fibCount];
		
		a[0] = 0;
		a[1] = 1;
		
		for(int i = 2 ; i <fibCount; i++){
			a[i] = a[i-1] + a[i-2];
		}
		
		for(int i = 0 ; i <fibCount; i++){
			System.out.println(" i = " + a[i] );
		}
		
		int b = 0;
		int c = 1;
		
		for(int i = 0 ; i <10; i++){
			b = b+c;
			c = b-c;
			
			System.out.println(c);
		}
		

	}

}
