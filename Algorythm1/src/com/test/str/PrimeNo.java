package com.test.str;

public class PrimeNo {

	public static void main(String[] args) {
		System.out.println("is prime no 9 " + isPrime(9));

	}
	
	private static boolean isPrime(int no){
		
		for(int i = 2; i < no; i++){
			if(no%i == 0){
				return false;
			}
		}
		
		return true;
	}

}
