package com.test.algorythm.str;

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

public class FileWorkdCount {

public static void main(String[] args) {
		
		Map<String, Integer> wordMap = buildWordMap("c:\\wordCount.txt");
		List<Entry<String, Integer>> list = sortByWordCount(wordMap);
		
	}
	
	private static Map<String, Integer> buildWordMap(String fileName) {
		
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		
		FileInputStream fi= null;
		DataInputStream ds= null;
		BufferedReader br = null;
		
		try {
			fi = new FileInputStream(fileName);
			ds = new DataInputStream(fi);
			br = new BufferedReader(new InputStreamReader(ds));
			
			Pattern pattern = Pattern.compile("\\s+");
			String line = null;
			while( (line = br.readLine()) != null){
				line = line.toLowerCase();
				String [] words = pattern.split(line);
				
				for(String word: words){
					if(wordMap.containsKey(word)){
						wordMap.put(word, wordMap.get(word) + 1 );
					}else{
						wordMap.put(word, 1 );
					}
				}
			}			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				br.close();
				ds.close();
				fi.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		return wordMap;
		
	}
	
	private static List<Entry<String, Integer>> sortByWordCount(Map<String, Integer> wordMap ){
		
		Set<Entry<String, Integer>> entries = wordMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>> (entries);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		
		return list;		
		
	}

}
