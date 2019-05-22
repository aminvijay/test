package com.test.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		//int iArr[] = {5,8,3,8,11,27,4,32,6};
		//int iArr[] = {5,8,3,1,7};
		int iArr[] = {1,3,7,2,5,4};
		
		//keeping minimum no at first
		
		System.out.println("unsorted arry " + Arrays.toString(iArr));
		
		for(int i = 0; i < iArr.length-1; i++){
			
			//first find minumum index
			int minInd = i; 
			for (int j = i+1; j<iArr.length; j++){
				
				if(iArr[j] < iArr[minInd]) {
					minInd = j;
				}				
			}
			
			//swap array			
			int tmp = iArr[i];
			iArr[i] = iArr[minInd];
			iArr[minInd] = tmp;
			System.out.println(" i = " + i + " sorted arry " + Arrays.toString(iArr));
		}
		
		System.out.println("sorted arry " + Arrays.toString(iArr));

	}

}
