package com.test.algorythm.str;

public class ReverseStr {

	public static void main(String[] args) {
		
		String str = "hello vijay";
		char ch [] = str.toCharArray();
		
		int i = 0;
		int j = str.length()-1;
		
		while(i<j){			
			char tmp = ch[i];
			ch[i] = ch[j];
			ch[j] = tmp;
			
			i++;
			j--;
		}
		
		for(int k = 0; k <ch.length; k++){
			System.out.print(ch[k]);
		}

	}

}
