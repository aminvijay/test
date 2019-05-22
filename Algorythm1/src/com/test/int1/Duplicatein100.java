package com.test.int1;

import java.util.ArrayList;
import java.util.List;

public class Duplicatein100 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<7;i++){
            numbers.add(i);
        }
        numbers.add(5);
        System.out.println(" array " + numbers);
        System.out.println("Duplicate Number: "+getDuplicate(numbers));
	}
	
	private static int getSum(List<Integer> number){
		int total = 0;
		for(Integer in: number){
			total = total + in;
		}
		return total;
	}
	
	private static int getDuplicate(List<Integer> numbers) {
		
		int highestNo = numbers.size() -1;
		System.out.println("highestNo " + highestNo	);
		int sum = getSum(numbers);
		
		System.out.println("sum " + sum	);
		
		System.out.println(" calculation " + highestNo*(highestNo+1)/2);
		return sum - (highestNo*(highestNo+1)/2) ;
		
	}

}
