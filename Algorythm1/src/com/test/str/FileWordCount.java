package com.test.str;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;


public class FileWordCount {

	public static void main(String[] args) {
		Map<String, Integer> wordMap = getWordMap("C:/wordCount.txt");
		List<Entry<String, Integer>> list =  getSortedList( wordMap);
		
		for(Map.Entry<String, Integer> ent : list){
			System.out.println("Key = " + ent.getKey() + " val " + ent.getValue());
		}

	}
	
	
	private static Map<String, Integer> getWordMap(String fileName) {
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		
		FileInputStream fs = null;
		DataInputStream ds = null;
		BufferedReader br = null;
		
		Pattern pattern = Pattern.compile("\\s+");
		String line = null;
		
		try {
			
			fs = new FileInputStream(fileName);
			ds = new DataInputStream(fs);
			br = new BufferedReader(new InputStreamReader(ds));
			while(  (line = br.readLine()) != null  ) {
				String [] words = pattern.split(line);
				for(String word: words) {
					if(wordMap.containsKey(word)) {
						wordMap.put(word, wordMap.get(word) +1);
					}else {
						wordMap.put(word, 1);
					}
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
			try {
				fs.close();
				ds.close();
				br.close();
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}
		
		return wordMap;
		
	}

	private static List<Entry<String, Integer>> getSortedList(Map<String, Integer> wordMap) {
		
		Set<Entry<String, Integer>> entries = wordMap.entrySet();		
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entries);
		
		Collections.sort(list, new Comparator<Entry<String, Integer>> (){
			
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return ( o1.getValue().compareTo(o2.getValue()) ) ;
				
			}
		});
		
		return list;
	}
}
