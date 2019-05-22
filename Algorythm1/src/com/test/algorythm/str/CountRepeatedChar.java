package com.test.algorythm.str;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedChar {

	public static void main(String[] args) {
		String str = "aabcccccaaaddbbb";		
		char ch [] = str.toCharArray();		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		for(int i =0; i<ch.length;i++){
			Integer count = m.get(ch[i]);
			System.out.println(" count " + count +" char " + ch[i]);
			if(count == null){
				System.out.println(" in if " + m);
				m.put(String.valueOf(ch[i]), new Integer(1));
			}else {
				System.out.println(" in else " + m);
				m.put(String.valueOf(ch[i]), count+1);
			}
		}
		
		System.out.println(m);
		
		
		String abc = "";
		int count = 1;
		
		for(int i =0; i<ch.length-1;i++){
			if(ch[i] == ch[i+1]){
				count = count+1;
			}else {
				abc = abc +ch[i] + count;
				count = 1;
			}
			
			if(i == ch.length-2){
				abc = abc +ch[i] + count;
			}
		}
		
		System.out.println("abc = " + abc);
	}

}
