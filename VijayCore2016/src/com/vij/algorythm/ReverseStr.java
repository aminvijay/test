package com.vij.algorythm;

import java.util.Arrays;

public class ReverseStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abcdef";
		
		System.out.println(" reverse string " + new StringBuffer().append(str).reverse().toString());
		System.out.println(" reverse string recursion " + reverse(str));
		System.out.println(" reverse string byForLoop " + byForLoop(str));

	}
	
	private static String byForLoop(String str) {
		
		char cha[] = str.toCharArray();
		int start = 0;
		int end = cha.length-1;
		
		while(end > start) {
		
			char tmp = cha[start];
			cha[start] = cha[end];
			cha[end] = tmp;
			start++;
			end--;
		}
		
		return Arrays.toString(cha);
		
	}
	
	private static String reverse(String str) {
		
		if(str.length() <2){
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
