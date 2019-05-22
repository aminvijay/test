package com.algorithm;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {7,2,4,1,5,3};
		
		int val;
		int j;
		int tmp;
		for(int i = 1; i< a.length; i++){
			val = a[i];
			j = i-1;
			
			while(j>= 0 && val < a[j]){
				tmp = a[j];
				a[j] = a[j+1];
				a[j+1] = tmp;
				j--;
			}
		}
		
		
		for(int i = 0; i< a.length; i++ ){
			System.out.println("i = " +i + " val " + a[i] );
		}

	}

}
