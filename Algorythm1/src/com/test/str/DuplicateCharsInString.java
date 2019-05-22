package com.test.str;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		String str = "abcdbefdgh";
		char cha[] = str.toCharArray();
		Set<Character> set = new TreeSet<Character>();
		for(char ch: cha){
			if(!set.add(ch)){
				System.out.println("duplicate is " + ch);
			}
		}

	}

}
