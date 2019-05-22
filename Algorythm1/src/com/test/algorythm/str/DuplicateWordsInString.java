package com.test.algorythm.str;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "This sentence contains two words, one and two and one and three.";		
		Set<String> dupSet  = getDuplicateWors(test);
		System.out.println("dupSet = " +dupSet);
	}
	
	private static Set<String> getDuplicateWors(String str){
		if(str == null || str.length() == 0) {
			return Collections.EMPTY_SET;			
		}
		
		String [] words  = str.split(" ");
		Set<String> noDup = new HashSet<String>();
		Set<String> dupSet = new HashSet<String>();
		
		for(String word: words){
			if(!noDup.add(word)){
				dupSet.add(word);
			}
		}
		return dupSet;
	}
}