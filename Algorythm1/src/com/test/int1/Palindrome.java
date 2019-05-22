package com.test.int1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" isPalindrome 121 " + isPalindrome(121));
		
		System.out.println(" isPalindrome 125 " + isPalindrome(125));

	}
	
	private static boolean isPalindrome(int no){
		
		int original = no;
		int reverse = 0;
		
		while(no != 0){
			int remider = no%10;
			reverse = reverse*10+remider;
			no = no/10;
		}
		
		if(original == reverse){
			return true;
		}else {
			return false;
		}		
	}

}
