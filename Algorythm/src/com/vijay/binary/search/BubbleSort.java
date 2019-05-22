package com.vijay.binary.search;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int inArry [] = {3,8,4,0,1,2};
		int n = inArry.length;
		
		for(int i = 0;i<n-1;i++){ 
			
			for (int j = 0; j < n-1; j++){
				if(inArry[j] > inArry[j+1]){
					int tmp = inArry[j];
					inArry[j] = inArry[j+1];
					inArry[j+1] = tmp;
				}
			}
		}
		
		for(int a = 0; a< inArry.length; a++ ){
			System.out.println("a = " +a + " val " + inArry[a] );
		}

	}

}
