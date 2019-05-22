package com.vijay.binary.search;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int inArry [] = {3,8,4,0,1,2};
		int n = inArry.length;
		
		for(int i = 0;i<n-1;i++){ // we need to do n-2 passes
			int iMin = i;
			for(int j = i+1; j<n;j++){
				if(inArry[j]<inArry[iMin]){
					iMin = j;
				}
			}
			int temp = inArry[i];
			inArry[i] = inArry[iMin];
			inArry[iMin] = temp;
		}
		
		for(int a = 0; a< inArry.length; a++ ){
			System.out.println("a = " +a + " val " + inArry[a] );
		}
		
		
	}
	

}
