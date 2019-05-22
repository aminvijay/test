package com.test.int1;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(" fact of 5 " + fact(6));
		System.out.println(" fact2 of 5 " + fact2(6));

	}
	
	private static int fact(int no){
		
		if(no == 1){
			return no;
		}
		
		return no*fact(no-1);
	}
	
	private static int fact2(int no){
		
		if(no < 1) {
			return 1;
		}
		int res = 1;
		
		for(int i = no; i >=1; i--){
			res = res*i;
		}
		return res;
	}

}
