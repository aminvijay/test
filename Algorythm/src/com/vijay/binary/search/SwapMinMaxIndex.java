package com.vijay.binary.search;

public class SwapMinMaxIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a [] = {3,8,4,0,1,2};
		
		for(int i = 0; i< a.length; i++ ){
			System.out.println("i = " +i + " val " + a[i] );
		}
		
		
		
		int minInd = a[0];
		int maxInd = a[0];
		
		for(int i = 0; i< a.length; i++) {
			
			if(a[minInd] >= a[i]) {
				minInd = i;
			}
			
			if( a[maxInd] <= a[i]) {
				maxInd = i;
			}			
		}
		
		int tmp = a[minInd];
		a[minInd] = a[maxInd];
		a[maxInd] = tmp;
		
		for(int j = 0; j< a.length; j++ ){
			System.out.println("j = " +j + " val " + a[j] );
		}
	}

}
