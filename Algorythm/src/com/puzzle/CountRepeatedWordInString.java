package com.puzzle;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedWordInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String ss = "aa bb cc dd aa bb cc dd aa ee ff";
		
		Map<String, Integer> ma = new HashMap<String, Integer>();
		
		for(String s:ss.split(" ")) {
			Integer count = ma.get(s);
			if(count == null) {
				ma.put(s, 1);
			}else{
				ma.put(s, count+1);
			}
		}
		System.out.println("map " + ma);
	}

}
