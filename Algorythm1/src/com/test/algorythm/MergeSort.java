package com.test.algorythm;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = {2,4,1,6,8,5,3,7,11};		
		MergeSort(a);
		System.out.println("merge sort array " + Arrays.toString(a));
	}
	
	private static void MergeSort(int b []){			
		int len = b.length;
		if(len <2 ) {
			return;
		}else {
			int midInd = len/2;
			int lA [] = new int[midInd];
			int rA[] = new int[len-midInd];
			
			//System.out.println(" else merge sort array bbbbb " + Arrays.toString(b) + " midInd " + midInd + " lA len " + lA.length + " rA len " + rA.length);
			
			for(int i = 0 ; i < midInd; i++){
				lA[i] = b[i];
			}
			
			for(int i = midInd; i < len; i++){
				rA[i-midInd] = b[i];
			}
			
			//System.out.println("aaaaa MergeSort method  lA " + Arrays.toString(lA) +  " rA "+ Arrays.toString(rA) );
			
			
			MergeSort(lA);
			MergeSort(rA);
			Merge(lA,rA,b);
			
			//System.out.println("merge sort array bbbbb " + Arrays.toString(b));
		}
	}
	
	private static void  Merge(int lA[], int rA[], int A[]){
		
		int lLen = lA.length;
		int rLen = rA.length;
		int i= 0;
		int j = 0;
		int k = 0; 
		
		//System.out.println("Merge method  lA " + Arrays.toString(lA) +  " rA "+ Arrays.toString(rA) + " A " + Arrays.toString(A));
		
		while ( i < lLen && j < rLen) {
			if(lA[i] <= rA[j]) {
				A[k] = lA[i];
				i = i+1;
			}else {
				A[k] = rA[j];
				j = j+1;
			}
			k = k+1;
		}
		
		while(i<lLen){
			A[k] = lA[i];
			i = i+1;
			k = k+1;
		}
		
		while(j < rLen){
			A[k] = rA[j];
			j = j+1;
			k = k+1;
		}
	}

}
