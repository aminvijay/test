package com.test.str;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 17868;
		reverseNumber(no);
		revNo(no);
		
		String revNo = new StringBuffer().append(no).reverse().toString();
		String ss = new StringBuffer(Integer.valueOf(no).toString()).reverse().toString();
		
		System.out.println(" by string buffer " +revNo + " ss " + ss );
	}
	
	public static int reverseNumber(int number){
        
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;            
            System.out.println("reverse: "+reverse + " number: "+number );
        }
        return reverse;
    }
	
	
	private static int revNo(int no){
		
		int reverse = 0;
		
		while(no != 0){
			reverse = (reverse*10)+(no%10);
			no = no/10;
		}
		
		System.out.println(" in revNo reverse = " + reverse);
		return reverse;
	}
}
