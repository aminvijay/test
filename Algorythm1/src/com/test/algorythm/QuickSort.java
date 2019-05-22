package com.test.algorythm;

import java.util.Arrays;

public class QuickSort {

	 
	public static void main(String[] args) {
		//int a[] = {7,2,1,6,8,5,3,4};
		int a[] = {7,5,2,8,4,3,6};
		//int a[] = {7,2,1};
		//int a[] = {7,2,1,6};
		//int a[] = {7,2};
		QSort(a, 0, a.length-1);	
		
		System.out.println("Quick sort array " + Arrays.toString(a));
	}

	private static void QSort(int a[], int start, int end) {
		
		if(start < end){
			
			System.out.println(" before QSort  " + Arrays.toString(a) + " start " + start + " end " + end );
			
			int pIndex = getPindex(a, start, end);
			
			System.out.println(" after QSort  " + Arrays.toString(a) + " start " + start + " end " + end + " pIndex " + pIndex);
			
			QSort(a, start, pIndex-1);
			QSort(a, pIndex+1, end);
		}		
	}
	
	private static int getPindex(int a[], int start, int end) {		
		//System.out.println(" getPindex  " + Arrays.toString(a) + " start " + start + " end " + end);		
		int pivet = a[end];
		int pIndex = start;
		
		for ( int i = start; i < end-1; i++){
			if(a[i] <= pivet){
				int temp = a[pIndex];
				a[pIndex] = a[i];
				a[i] = temp;
				pIndex = pIndex+1;
			}
		}
		
		System.out.println(" before swap getPindex  " + Arrays.toString(a) + " start " + start + " end " + end + " pivet " + pivet + " pIndex " + pIndex);
		
		int temp = a[pIndex];
		a[pIndex] = a[end];
		a[end] = temp;
		
		System.out.println(" after swap getPindex  " + Arrays.toString(a) + " start " + start + " end " + end + " pivet " + pivet + " pIndex " + pIndex);
		
		return pIndex;
	}
}
