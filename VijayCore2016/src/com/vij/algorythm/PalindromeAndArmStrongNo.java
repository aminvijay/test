package com.vij.algorythm;

public class PalindromeAndArmStrongNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" is isPalindrome " + isPalindrome(112211));
		System.out.println(" is isArmstrong " + isArmstrong(153));
	}
	
	private static boolean isPalindrome (int no){
		
		int reverse = 0;
		int palindrome = no;
		
		while(palindrome != 0) {
			
			int reminder = palindrome %10;
			reverse = reverse*10+reminder;
			palindrome = palindrome/10;
		}
		
		
		if(reverse == no){
			return true;
		}else {
			return false;
		}
	}
	
	private static boolean isArmstrong(int no){
		
		int armNo = no;
		int result = 0;
		
		while(armNo != 0) {
			
			int remind = armNo%10;
			result = result + (remind*remind*remind);
			armNo = armNo/10;
		}
		
		if(no == result) {
			return true;
		}else {
			return false;
		}
	}

}
