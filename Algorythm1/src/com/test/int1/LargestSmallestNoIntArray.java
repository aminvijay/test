package com.test.int1;

public class LargestSmallestNoIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inArray [] = {4,14,58,12,2,21,23};
		int smallestNo =inArray[0];
		int largestNo =inArray[0];
		
		for(int i:inArray){
			
			if(i<smallestNo){
				smallestNo = i;
			}
			
			if(i>largestNo){
				largestNo = i;
			}
		}		
		System.out.println("smallestNo = " + smallestNo + " largestNo = " + largestNo);
	}

}
