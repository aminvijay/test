package com.algorithm;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {2,4,7,1,5,3};
		
		for(int i = a.length-1; i >1; i--){
			
			for(int j = 0; j< i; j++){
				
				if(a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		
		for(int i = 0; i< a.length; i++ ){
			System.out.println("i = " +i + " val " + a[i] );
		}
		

	}

}
