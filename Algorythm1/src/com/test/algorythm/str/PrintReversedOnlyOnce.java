package com.test.algorythm.str;

import java.util.HashSet;
import java.util.Set;

public class PrintReversedOnlyOnce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//input type = aaabcaaccadddaaee
		//output = eadcb
		
		String str = "aaabcaaccadddaaee";
		byStringBuilder(str);
		bySet(str);
		byStringBuilderNoReverse(str);
		
	}
	
	private static void byStringBuilder(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i >= 0; i--){
			
			if(! sb.toString().contains(str.substring(i, i+1))) {
				sb.append(str.substring(i, i+1));
			}
		}
		
		System.out.println(" sb is " + sb.toString());
	}
	
	private static void bySet(String str){
		
		Set<Character> set = new HashSet<Character>();
		String reversed = "";
		
		for(int i = str.length()-1; i>=0; i--){
			
			Character ch = str.charAt(i);
			
			if(!set.contains(ch)){
				set.add(ch);
				reversed = reversed + ch;
			}
		}
		System.out.println(" bySet is " + reversed);
		
	}
	
	private static void byStringBuilderNoReverse(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length()-1; i++){
			
			if(! sb.toString().contains(str.substring(i, i+1))) {
				sb.append(str.substring(i, i+1));
			}			
		}
		
		System.out.println(" sb byStringBuilderNoReverse is " + sb.toString());
	}

}
