package com.test.algorythm.str;

public class UniqCharString {
	
	static String  abc = "vijay";
	static String pqr ="ajay";

	public static void main(String[] args) {
		
		String str = "abcdefg";		
		char ch[] = str.toCharArray();
		
		boolean isStrUniq = true;
		
		for(int i = 0; i < ch.length; i++){
			
			for(int j = i+1; j<ch.length; j++){
				if(ch[i] == ch[j]) {
					isStrUniq = false;
					break;
				}
			}
		}
		
		System.out.println("isStrUniq = " + isStrUniq);
		
		boolean isStrUniq1 = true;
		
		boolean [] char_set = new boolean [256];
		for(int i = 0; i< str.length(); i++){
			
			int val = str.charAt(i);
			
			if(char_set[val]) {
				isStrUniq1 = false;
				break;
			}
			char_set[i] = true;			
		}
		
		
		System.out.println("isStrUniq1 = " + isStrUniq1);
		
		System.out.println("abc  = " + abc);
		System.out.println("pqr   = " + pqr.charAt(1));
		
		System.out.println("isStrUniq1 11 = " + isStrUniq1);

	}

}
