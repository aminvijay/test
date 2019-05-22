package com.algorithm;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a [] = {2,4,7,1,1,5,3};
		
		for(int i = 0; i < a.length-2; i++){
			
			int minInd = i;
			
			for(int j = i+1; j < a.length; j++){
				if(a[j] < a[minInd]){
					minInd = j;
				}
			}
			
			int tmp = a[i];
			a[i] = a[minInd];
			a[minInd] = tmp;
		}
		
		for(int i = 0; i< a.length; i++ ){
			System.out.println("i = " +i + " val " + a[i] );
		}
	}

}
