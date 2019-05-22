package com.test.str;

public class FactorialTest {

	public static void main(String[] args) {
		System.out.println("factorial of 6 " + facto(6));
		System.out.println("fact1 of 6 " + fact1(6));

	}
	
	private static int facto(int no) {
		if(no == 0) {
			return 1;
		}
		
		return no*facto(no-1);
	}
	
	private static int fact1(int no){
		
		int fact = 1;
		for(int i = no; i >=1; i--){
			fact = fact*i;
		}
		
		return fact;
	}
	

}
