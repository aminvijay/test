package com.algorithm;

public class Sorting {

	/**
	 * @param args
	 */
	
	
	static int a[] = {2,4,7,1,5,3};
	static int a1[] = {2,4,7,1,5,3};
	static int a2[] = {2,4,7,1,5,3};
	
	public static void main(String[] args) {
		
		//insertion sort
		int val;
		int j;
		for(int i = 1; i < a.length ; i++) {
			val = a[i];
			j = i-1;
			
			while(j>=0 && val < a[j]){
				swap(j, j+1, a);
				j--;
			}			        
		}
		for(int i = 0; i< a.length; i++ ){
			System.out.println(" insertion sort i = " +i + " val " + a[i] );
		}
		
		
		
		//selection sort	
		
		for(int i = 0; i< a1.length; i++ ){
			System.out.println(" before  seection sort i = " +i + " val " + a1[i] );
		}
		
		int minInd;		
		for(int i = 0; i < a1.length-2; i++){
			minInd = i;
			for(int k = i+1; k < a1.length; k++) {
				if(a1[minInd] > a1[k]){
					minInd = k;
				}
			}
			swap(i, minInd, a1);
		}
		
		for(int i = 0; i< a1.length; i++ ){
			System.out.println(" after  seection sort i = " +i + " val " + a1[i] );
		}
		
		
		// bubble sort
		
		for(int i = 0; i< a2.length; i++ ){
			System.out.println(" before  bubble sort i = " +i + " val " + a2[i] );
		}
		
		for(int m = a2.length-1;  m>1; m--){
		
			for(int n = 0; n<m; n++){
				//System.out.println(" m = " + m + " n " + n + " a2[n] " + a2[n] + " a2[n+1] " + a2[n+1]);
				if(a2[n] > a2[n+1]){
					//System.out.println(" in if m = " + m + " n " + n + " a2[n] " + a2[n] + " a2[n+1] " + a2[n+1]);
					swap(n, n+1,a2);
				}
			}
		}
		
		for(int i = 0; i< a2.length; i++ ){
			System.out.println(" after  bubble sort i = " +i + " val " + a2[i] );
		}
		
	}
	
	private static void swap(int a, int b, int ar[]){
		int tmp = ar[a];
		ar[a] = ar[b];
		ar[b] = tmp;
	}
	
	
	
	 

}
