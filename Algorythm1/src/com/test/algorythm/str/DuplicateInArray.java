package com.test.algorythm.str;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		String abc[] = {"hello1","hello2","hello1","hello3","hello4","hello5","hello2","hello1" };
		
		Set set = new HashSet();
		
		for(String str:abc){
			if(set.add(str) == false) {
				System.out.println(str);
			}
		}
		
		Map<String, Integer> nameAndCountMap = new HashMap<String, Integer>();
		
		for(String str:abc){
			Integer count = nameAndCountMap.get(str);
			if(count == null){
				nameAndCountMap.put(str, 1);
			}else {
				nameAndCountMap.put(str, ++count);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = nameAndCountMap.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			
			if(entry.getValue() > 1) {
				System.out.println("Duplicate elements are " + entry.getKey() + " value = " + entry.getValue());
			}
		}
		
	}

}
