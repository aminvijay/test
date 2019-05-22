package com.test.colle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderByValueMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entrySet);
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>> (){
        	public int compare(Map.Entry<String, Integer> arg0, Map.Entry<String, Integer> arg1) {
				// TODO Auto-generated method stub
				return (arg1.getValue().compareTo(arg0.getValue()));
        	}
		}); 
        
        for(Map.Entry<String, Integer> ent: list){
        	System.out.println("val " + ent.getValue());
        }
	}

}
