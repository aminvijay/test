package com.test.int1;

import java.util.Arrays;

public class ArmstrongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 + 125 + 27  = 153
		
		System.out.println("isArmStrong 153  " + isArmStrong(153));
		
	}
	
	
	private static boolean isArmStrong(int no) { 
	
		int result = 0;
		int original = no;
		
		while(no != 0){
			int remind = no%10;
			result = result + remind*remind*remind;
			no = no/10;
		}
		
		if(result == original){
			return true;
		}else {
			return false;
		}
	}

	
}
