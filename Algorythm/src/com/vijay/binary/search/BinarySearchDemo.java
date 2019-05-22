package com.vijay.binary.search;

public class BinarySearchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int inArry [] = {0,1,2,3,5,8,12,15,17,18,19,22,34,56,78};
		int index = findIndex(inArry, inArry.length, 8);
		
		System.out.println("index = " +index  );
		System.out.println(" no is " + inArry[index] );
	}
	
	private static int findIndex(int intArry[], int size, int no){
		
		int startNo = 0;
		int lastNo = size;
		
		while(startNo <= lastNo){
			
			int midNo = (startNo + lastNo)/2;
			
			if(no == intArry[midNo]){
				return midNo;
			}else if(no > intArry[midNo]){
				startNo = midNo+1;
			}else{
				lastNo = midNo-1;
			}			
		}
		return -1;
	}

}
