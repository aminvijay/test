package com.test.colle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapiterator {

	public static void main(String[] args) {
		
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("key1", "value1");
		testMap.put("key3", "value3");
		testMap.put("key2", "value2");
		testMap.put("key5", "value2");
		testMap.put("key4", "value4");
		
		method1(testMap);
		method2(testMap);
		method3(testMap);
		sortMap(testMap);
		
	}
	
	private static void method1(Map<String, String> map) {
		
		for(String str: map.keySet()){
			System.out.println(" key " + str + " val " + map.get(str));
		}
	}
	
	private static void method2(Map<String, String> map) {
		
		Set<String> keys = map.keySet();
		Iterator iterator = keys.iterator();
		String key = null;
		while(iterator.hasNext()){
			key = (String)iterator.next();
			System.out.println("2ne method key " + key + " val " + map.get(key));
		}
	}
	
	private static void method3(Map<String, String> map) {
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		for(Map.Entry<String, String> ent: entrySet) {
			System.out.println(" methd3 key " + ent.getKey() + " val  " + ent.getValue());
		}
	}
	
	
	
	private static void sortMap(Map<String, String> map) {
		System.out.println(" ------------- ");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(entrySet);
		
		Collections.sort(list, new Comparator<Map.Entry<String, String>> () {
			
			public int compare(Map.Entry<String, String> o1, Map.Entry<String, String>o2){
				return (o1.getValue().compareTo(o2.getValue())) ;
			}
		});
		
		for(Map.Entry<String, String> ent: list){
			System.out.println(" methd4 key " + ent.getKey() + " val  " + ent.getValue());
		}
		
	}
}
