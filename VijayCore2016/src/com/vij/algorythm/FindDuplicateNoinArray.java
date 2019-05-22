package com.vij.algorythm;

public class FindDuplicateNoinArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,6,7,8};
		
		int total =  getTotal(a);
		int len = a.length;
		
		int duplicate = total - (len * (len-1)/2);
		
		System.out.println("duplicate " + duplicate);
	}
	
	private static int getTotal (int a[]) {
		
		int total = 0;
		
		for(int i = 0; i < a.length; i++ ) {
			total = total + a[i];			
		}
		
		return total;
	}

}
