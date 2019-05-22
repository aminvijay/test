package com.test.str;

public class FizzBuzzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();
	}

	private static void method1() {
		
		for(int i = 1; i <= 50; i++){
			if(i % 15 == 0) {
				System.out.println(" i = + " + i + "FizzBuzz");
			}else if(i%5 == 0){
				System.out.println(" i = + " + i +  "Fizz");
			}else if(i%3 == 0){
				System.out.println(" i = + " + i +  "Buzz");
			}else {
				System.out.println(" i = + " + i );
			}
		}
	}
	
	private static void method2() {
		
		for(int i = 1; i <= 50; i++){
			String str="";
			if(i% 5 == 0){
				str = "Fizz";
				
			}
			
			if(i% 3 == 0){
				str = str+"Buzz";
				
			}
			System.out.println(" i = + " + i +  str);
			
		}
		
	}
}
