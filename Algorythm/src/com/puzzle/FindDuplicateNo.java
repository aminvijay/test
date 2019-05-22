package com.puzzle;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(5);
		numbers.add(8);
		numbers.add(3);
		numbers.add(5);
		numbers.add(2);
		numbers.add(1);
		numbers.add(7);
		numbers.add(7);
		numbers.add(5);
		
		int highestNumber  = numbers.size()-1;
		int total = getSom(numbers);
		int duplicate = total - (highestNumber * (highestNumber +1)/2);
		
		System.out.println("duplicate " + duplicate + " ffffffffffffffff >>>>.");
		
		List<Integer> dupNo = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.size(); i ++) {
			
			for(int j = i+1; j < numbers.size(); j++) {
				
				if(numbers.get(i) == numbers.get(j)){
					dupNo.add(i);
					break;
				}
			}
		}
		
		for(int i = 0; i < dupNo.size(); i ++) {
			int dupIndex = dupNo.get(i);
			int dupN = numbers.get(dupIndex);
			System.out.println("duplicate "  + dupN);
		}
	}
	
	private static int getSom(List<Integer> numbers) {
		int sum = 0;
		
		for(int num:numbers){
			sum += num;
		}
		return sum;
	}
}
