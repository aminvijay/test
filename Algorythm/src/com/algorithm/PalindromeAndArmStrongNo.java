package com.algorithm;

public class PalindromeAndArmStrongNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Palindrome is ? = " + Palindrome(1221));
		
		System.out.println(" Armstrong is ? = " + isArmStrong(153));

	}
	
	private static boolean Palindrome (int number) {
		int palindrome = number; // copied number into variable
        int reverse = 0;

		while(palindrome != 0) {
			int reminder = palindrome%10;
			reverse = reverse*10+reminder;
			palindrome = palindrome/10;
			
			System.out.println(" reminder " + reminder + " reverse " + reverse + " palindrome " + palindrome);
		}
		
		//System.out.println("  palindrome " + palindrome + " number " + number);
		
		if(reverse == number){
			return true;
		}else {
			return false;
		}
	}
	
	//to its number. For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or   1+125+27=153
	private static boolean isArmStrong(int no){
		int armNo = no;
		int result = 0;
		
		while(armNo != 0 ){
			int reminder  = armNo %10;
			result = result + reminder*reminder*reminder;
			armNo = armNo/10;
		}
		
		if(result == no){
			return true;
		}else {
			return false;
		}
	}

}
