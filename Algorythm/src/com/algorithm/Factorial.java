package com.algorithm;

import java.util.Arrays;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" factorial of 5 is " + fact(5));
		System.out.println("aa factorial of 5 is " + fact1(5));
		
		
		int fibArray [] = new int[12];
		fibArray[0] = 0;
		fibArray[1] = 1;
		
		for (int i = 2; i < fibArray.length; i++){
			fibArray[i] = fibArray[i-1] + fibArray[i-2];
		}
		
		System.out.println(" fibonic no " + Arrays.toString(fibArray));
		
		//Write a Java program that prints the numbers from 1 to 50. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz"

		for(int i = 1; i < 50; i++){
			if(i % 15 == 0){
				System.out.print("FizzBuzz");
			}else if(i % 5 == 0){
				System.out.print("Fizz");
			}else if(i % 3 == 0){
				System.out.print("Buzz");
			}else {
				System.out.print(i);
			}
		}
	}
	
	private static long fact(long n){
		if(n == 1) {
			return 1;			
		}
			
		return n* fact(n-1);
		
	}
	
	private static int fact1(int no){
		
		int fact =1;
		for(int i = 1; i <= no; i++){
			fact = fact*i;
		}
		return fact;
	}

}
