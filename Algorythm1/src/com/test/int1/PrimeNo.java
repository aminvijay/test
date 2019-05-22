package com.test.int1;

public class PrimeNo {

	public static void main(String[] args) {
		
		int no = 50;
		//find prime no in 1 to 50
		
		for(int i = 0; i < no; i++){
			
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}
	
	private static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
