package com.algorithm;

public class FindDuplicateInNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a [] = {1,2,3,3,4,5,6};
		int total = getTotal(a);
		System.out.println(" total = " + total);
		int size = a.length-1;
		System.out.println(" size = " + size);
		int duplicate = total - (size*(size+1)/2);
		System.out.println("duplicate = " + duplicate);
		System.out.println("size+1)/2 = " + (size+1)/2);
		
		System.out.println("size+1)/2 aaaaa = " + (size*(size+1)/2));
		

	}
	
	private static int getTotal(int a[]){
		int total = 0;
		for(int i = 0; i< a.length;i++){
			total = total+ a[i];
		}
		return total;
	}
	
	
	

}
