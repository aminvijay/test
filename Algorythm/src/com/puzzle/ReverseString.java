package com.puzzle;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "hedrtuv";
		char ch [] = s.toCharArray();
		
		int i = 0;
		int j = ch.length-1;
		
		while(i<j) {
			char t = ch[i];
			ch[i] = ch[j];
			ch[j] = t;
			i++;
			j--;
		}
		
		for(int k = 0; k <ch.length;k++) {
			System.out.println(" k " + k + " char = " + ch[k]);
		}
		
	}

}
