package com.test.int1;

public class NoaddTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" total 12345 " + total(12345));
		System.out.println(" total1 12345 " + total1(12345));

	}
	
	private static int total(int no){
		
		if(no == 0){
			return no;
		}
		
		return total(no/10)+no%10;
	}
	
	private static int total1(int no){
		
		int total = 0;
		
		while(no != 0){
			int remind = no%10;
			total = total+remind;
			no = no/10;
		}
		
		return total;
	}

}
