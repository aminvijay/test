package com.test.sort;

import java.util.Arrays;

public class MergeSort1 {

	public static void main(String[] args) {
		int iArr[] = {5,8,3,8,11,27,4,32,6};		
		//devide array in 2.... parts sort them an then merge		
		System.out.println("unsorted arry " + Arrays.toString(iArr));
		mergeSort(iArr);
		System.out.println("sorted arry " + Arrays.toString(iArr));
	}
	
	private static void mergeSort(int a[]){
		
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
		
		for(int i = midInd, j =0; i < len; i++,j++){
			//System.out.println(" all 2 array  i = " + i + " j = " + j + " len " + len + " midInd =  " + midInd);
			ra[j] = a[i];
			
		}
		
		//System.out.println(" all 2 array la " + Arrays.toString(la) + " ra " + Arrays.toString(ra) + " a = " + Arrays.toString(a));
		
		mergeSort(la);
		mergeSort(ra);
		merge(la,ra,a);
	}
	
	
	private static void merge(int la[], int ra[], int a[]){
		
		int ln = la.length;
		int rn = ra.length;		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < ln && j < rn){
			
			if(la[i] <= ra[j]){
				a[k] = la[i];
				i = i+1;
			}else{
				a[k] = ra[j];
				j = j+1;
			}
			k = k+1;
		}
		
		while(i < ln){
			a[k] = la[i];
			i = i+1;
			k = k+1;
		}
		while(j < rn){
			a[k] = ra[j];
			j = j+1;
			k = k+1;
		}
	}

}
