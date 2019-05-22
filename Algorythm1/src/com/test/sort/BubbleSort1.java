package com.test.sort;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {
		//int iArr[] = {5,8,3,8,11,27,4,32,6};
		//int iArr[] = {5,8,3,1,7};
		//int iArr[] = {1,3,7,2,5,4};
		int iArr[] = {2,7,4,1,5,3};
		System.out.println("unsorted arry " + Arrays.toString(iArr));
		
		//move largest no to last
		
		for(int i = 0; i < iArr.length-1; i++) {
			
			//by flag we can stop looping after 4th round
			int flag = 0;
			
			for(int j = 0; j < iArr.length-1-i; j++){
				
				if(iArr[j] > iArr[j+1]){
					int tmp = iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = tmp;
					flag = 1;
				}				
			}
			
			if(flag == 0) {
				break;
			}
			
			System.out.println(" i =  " + i + " sorted arry " + Arrays.toString(iArr));
		}
		System.out.println("sorted arry " + Arrays.toString(iArr));

	}

}
