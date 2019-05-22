package com.algorithm;

import java.util.Arrays;

//Big o notation is way to measure how well a computer algorithm scale when amount of data involved increase.
public class BigONotation {

	private int[] theArray;
	private int arraySize;
	private int itemsInArray = 0;
	private long startTime;
	private long endTime;
	
	
	//0(1) An algorithm that execute in same amount of time no matter how big array is.
	
	BigONotation(int size) {
		arraySize = size;
		theArray = new int[size];
	}
	
	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 1000) + 10;
		}
		itemsInArray = arraySize - 1;
	}
	
	public void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}
	
	public static void main(String[] args) {
		
		// 0(1) 
		BigONotation test = new BigONotation(5);
		test.addItemToArray(test.arraySize);
		System.out.println(Arrays.toString(test.theArray));
		
		BigONotation testAlgo2 = new BigONotation(1000000);
		testAlgo2.generateRandomArray();

		BigONotation testAlgo3 = new BigONotation(2000000);
		testAlgo3.generateRandomArray();

		BigONotation testAlgo4 = new BigONotation(3000000);
		testAlgo4.generateRandomArray();

		BigONotation testAlgo5 = new BigONotation(4000000);
		testAlgo5.generateRandomArray();
		
		
		//0(N) An algorithm thats the search time is direct propotional to size of array.
		testAlgo2.linearsearch(20);
		testAlgo3.linearsearch(20);
		testAlgo4.linearsearch(20);
		testAlgo5.linearsearch(20);
		
		
		
	}
	
	
	public void addItemToArray(int newItem) {
		theArray[itemsInArray++] = newItem;
	}
	
	public void linearsearch(int value) {
		
		boolean valueFound = false;
		String indexs = "";
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i<arraySize; i++ ){
			if(theArray[i] == value) {
				valueFound = true;
				indexs = indexs + i + " ,";
			}
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println(" valueFound " + valueFound + " Time taken " + (endTime-startTime));
	}

}
