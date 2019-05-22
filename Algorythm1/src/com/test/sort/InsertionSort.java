package com.test.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iArr[] = {5,8,3,8,11,27,4,32,6};
		//consider first element is sorted and then insert bigger element at left
		
		System.out.println("unsorted arry " + Arrays.toString(iArr));
		
		for(int i = 1; i < iArr.length; i++){
			
			int val = iArr[i];
			int hole = i;
			
			//check hole is > 0 and then check holes previous element value > first time value
			while(hole > 0 && iArr[hole-1] > val){
				
				// move hole value
				iArr[hole] = iArr[hole-1];
				//move hole
				hole = hole-1;
			}
			//we have alread val which was never changed, just assigned it to hole
			iArr[hole] = val;
			System.out.println(" i =  " + i + " sorted arry " + Arrays.toString(iArr));
		}
		System.out.println("sorted arry " + Arrays.toString(iArr));
		
		
	}

}
