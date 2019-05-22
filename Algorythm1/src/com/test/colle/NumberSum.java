package com.test.colle;

public class NumberSum {

	static int sum = 0;
	public static void main(String[] args) {
		System.out.println("sum 3252 " + getNumberSum(3252));
		
		System.out.println("aa sum 3252 " + getSum(3252));
	}
	
	private static int getNumberSum(int no){
		
		if(no == 0){
			return no;
		}else {
			sum = sum+(no%10);
			getNumberSum(no/10);
		}
		return sum;
	}
	
	private static int getSum(int no) {
		
		int sum1 = 0;
		int temp = no;
		while(no > 0) {
			int remind = no % 10;
			sum1 = sum1 + remind;
			no = no/10;
		}
		
		return sum1;
	}

}
