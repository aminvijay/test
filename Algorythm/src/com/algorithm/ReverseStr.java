package com.algorithm;

import java.util.Arrays;

public class ReverseStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abcde";;
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		System.out.println(sb.toString());
		
		System.out.println("byForLoop = " + Arrays.toString( byForLoop(str)));
		
		System.out.println("recurse = " +  recurse(str));
	}
	
	private static char []  byForLoop(String str){
		
		char chA [] = str.toCharArray();
		int strt = 0;
		int end = chA.length-1;
		
		while(end>strt) {
			
			char tmp = chA[strt];
			chA[strt] = chA[end];
			chA[end] = tmp;
			strt++;
			end--;

		}
		
		return chA;
	}
	
	private static String recurse(String str){
		System.out.println(" str = " + str  + " str.substring(1) " + str.substring(1) + " str.charAt(0) " + str.charAt(0));
		if(str.length() < 2){
			return str;
		}
		
		return recurse(str.substring(1)) + str.charAt(0);
	}

}
