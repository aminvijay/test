package com.test.algorythm;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int a[] = {7,5,2,8,4,3,6};
		//selectionSort(a);	
		//bubbleSort(a);
		//insertionSort(a);
		mergeSort(a);
	}
	
	private static void mergeSort(int a[]){
		System.out.println("start a = " + Arrays.toString(a));
		int len = a.length;
		if(len < 2){
			return;
		}
		
		int midInd = len/2;
		
		int la[] = new int[midInd];
		int ra[] = new int[len-midInd];
		
		
		for(int i = 0; i < midInd; i++){
			la[i] = a[i];
		}
		
		for(int i = 0, j = midInd; j < len; i++,j++){
			ra[i] = a[j];
		}
		
		mergeSort(la);
		mergeSort(ra);
		merge(la,ra,a);
		System.out.println("end a =========> " + Arrays.toString(a));
		
	}
	
	private static void merge(int la[], int ra[], int a[]){
		System.out.println("****** la = " + Arrays.toString(la) +  " lb = " + Arrays.toString(ra) + " a = " + Arrays.toString(a));
		int ln = la.length;
		int rn = ra.length;
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < ln && j < rn) {
			
			if(la[i] < ra[j]){
				a[k] = la[i];
				i++;
			}else {
				a[k] = ra[j];
				j++;
			}
			k++;
		}
		
		while(i < ln) {
			a[k] = la[i];
			i++;
			k++;
		}
		
		while(j < rn){
			a[k] = ra[j];
			j++;
			k++;
		}
	}
	
	private static void insertionSort(int a[]){
		
		for (int i = 1;  i < a.length; i++){
			
			int val = a[i];
			int hole = i;
			
			while(hole > 0 && val < a[hole-1]){
				
				a[hole] = a[hole-1];
				hole = hole-1;
				
			}
			
			a[hole] = val;
			System.out.println("insertionSort sorting i = " + i + "  " + Arrays.toString(a));
		}
		System.out.println("insertionSort sorting " + Arrays.toString(a));
	}
	
	private static void bubbleSort(int a[]){
		
		for(int i = 0; i < a.length-1; i++){
			
			boolean isSorted = true;
			
			for(int j = 0; j< a.length-1-i; j++){
				
				if(a[j] > a[j+1]){
					
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					isSorted = false;
				}
				
				
			}
			if(isSorted){
				break;
			}
			System.out.println("bubbleSort sorting i = " + i + "  " + Arrays.toString(a));
		}
		
		System.out.println("bubbleSort sorting " + Arrays.toString(a));
	}
	
	private static void selectionSort(int a[]){
		for(int i = 0; i < a.length-1; i++){
			
			int minInd = i;
			
			for(int j = i+1; j <a.length; j++){
				
				if(a[minInd] > a[j]){
					minInd = j;
				}				
			}
			
			int tmp = a[minInd];
			a[minInd] = a[i];
			a[i] = tmp;
			System.out.println("while sorting i = " + i + "  " + Arrays.toString(a));
		}
		
		System.out.println("after sorting " + Arrays.toString(a));
	}

}
