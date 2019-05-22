package com.algorithm;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "20160417-13";
		System.out.println(" str1 " + str1); 
		
		System.out.println(" str1 11  " + str1.substring(9)); 
		
		System.out.println(" str1 22  " + str1.substring(9, 11)); 
		
		int aa [] = {1,3,5,7,9,12,15,17,25,30};
		
		for(int i = 0; i < aa.length; i++ ) {
			
			String str = "";
			
			if(aa[i] % 3 == 0) {
				str = "abc";
			}
			
			if(aa[i] % 5 == 0) {
				str = str + "pqr";
			}
			
			if(str != null && str.trim().length() > 0) {
				System.out.println(str);
			}			
		}
	}
}
