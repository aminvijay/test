package com.test.algorythm.str;

import java.util.ArrayList;
import java.util.List;

public class RemoveDupIntArray {

	public static void main(String[] args) {
		
		int[] input = {1, 2, 3, 3, 3, 4, 4, 10, 13, 15, 15, 17};
		
		int i = 1;
		int j = 0;
		
		while(i<input.length){			
			//this is duplicate element
			if(input[i] == input[j]) {
				i++; //skip this element
			}else {
				input[++j] = input[i++]; //shifting element
			}
		}
		
		int output [] = new int [j+1];
		for(int k = 0; k < output.length; k++){
			output[k] = input[k];
			 System.out.println(output[k]);
		}
		
		List<Integer> myList = new ArrayList<Integer>();		
		int[] input1 = {1, 2, 3, 3, 3, 4, 4, 10, 13, 15, 15, 17};
		for(int k = 0; k < input1.length; k++){
			if(!myList.contains(new Integer(input1[k]))){
				myList.add(input1[k]);
			}
		}
		System.out.println(myList);
	}

}
