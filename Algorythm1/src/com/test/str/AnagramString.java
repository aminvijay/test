package com.test.str;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		System.out.println("first method " + method1( "sbc", "bsc"));
		System.out.println("second method " + method1( "abc", "bsc"));

	}
	
	private static boolean method1(String str1, String str2){
		
		char ch1[] = str1.toCharArray();
		StringBuffer sb = new StringBuffer(str2);
		
		for(char ch: ch1){
			if( sb.indexOf(""+ch) == -1){
				return false;
			}else {
				sb.deleteCharAt(sb.indexOf(""+ch));
			}			
		}
		
		return sb.length() == 0 ? true:false;		
	}
	
	private static boolean method2(String str1, String str2){
		char ch1 [] = str1.toCharArray();
		char ch2 [] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}

}
