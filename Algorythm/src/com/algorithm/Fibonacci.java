package com.algorithm;

import java.util.Arrays;

public class Fibonacci {
	
	public static void main(String[] args) {
		//first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		
		int n = 11;
		
		for(int i = 1; i<n; i++) {
			System.out.println( fibbo(i));
		}
		
		int a[] = new int[n];
		a[0] = 0;
		a[1] = 1;
		
		for(int i = 2; i < n; i++){
			a[i] = a[i-1] + a[i-2];
		}
		
		System.out.println(" a val " + Arrays.toString(a));
		
	}
	
	
	private static int fibbo(int n) {
		
		if(n== 1 || n ==2 ) {
			return 1;
		} 
		
		return fibbo(n-1) + fibbo(n-2);
	}
	
	
	

}
