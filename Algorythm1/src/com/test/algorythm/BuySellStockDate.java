package com.test.algorythm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BuySellStockDate {

	//there are prediction for stock price for whole month. You can buy and sell stock only one time. Write a program for best buying and celling date.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// you have given HashMap for date/price prediction
		
		Map<Integer, Integer> preictedMap = new HashMap<Integer, Integer>();
		preictedMap.put(1, 28);
		preictedMap.put(2, 38);
		preictedMap.put(3, 22);
		preictedMap.put(4, 23);
		preictedMap.put(5, 24);
		preictedMap.put(6, 29);
		preictedMap.put(7, 37);
		preictedMap.put(8, 33);
		preictedMap.put(9, 31);
		preictedMap.put(10, 27);
		
		preictedMap.put(11, 32);
		preictedMap.put(12, 37);
		preictedMap.put(13, 26);
		preictedMap.put(14, 28);
		preictedMap.put(15, 32);
		preictedMap.put(16, 34);
		preictedMap.put(17, 27);
		
		System.out.println(" preictedMap " + preictedMap);
		
		List<Entry<Integer, Integer>> list = shortMapByPrice(preictedMap);
		
		/*for(Entry<Integer, Integer> entry: list){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}*/
		
		System.out.println(" list " + list);
		
		int i = 0;
		int j = list.size()-1;
		Entry<Integer, Integer> maxDate = (Entry<Integer, Integer> ) list.get(i);
		Entry<Integer, Integer> minDate = (Entry<Integer, Integer> ) list.get(j);
		
		//System.out.println(" maxDate " + maxDate + " minDate " + minDate);
		
		// check weather max price date is < min price date
		// if yes then we can't use them so check for previous max price
		while(maxDate.getKey() < minDate.getKey() && maxDate.getValue() > minDate.getValue()){
			i++;
			maxDate = (Entry<Integer, Integer> ) list.get(i);
			//System.out.println("in  compare maxDate " + maxDate + " minDate " + minDate + " i " + i);
		}
		if(i > 0) {
			i--;
		}
		
		maxDate = (Entry<Integer, Integer> ) list.get(i);
		System.out.println("after compare maxDate " + maxDate + " minDate " + minDate + " i " + i);
		
		int profit1 = 0;
		
		if(minDate.getKey() < maxDate.getKey() && maxDate.getValue() > minDate.getValue()){
			profit1 =  maxDate.getValue() - minDate.getValue();
		}
		
		System.out.println("profit1 = " + profit1);
		
		
		//reset values for i, maxDate1,minDate1 and check for previous min price
		
		i = 1;
		Entry<Integer, Integer> maxDate1 = (Entry<Integer, Integer> ) list.get(i);
		Entry<Integer, Integer> minDate1 = (Entry<Integer, Integer> ) list.get(j);
		System.out.println("after reset maxDate1 " + maxDate1 + " minDate1 " + minDate1 + " i " + i);
		
		while(maxDate1.getKey() < minDate1.getKey() && maxDate1.getValue() > minDate1.getValue()){
			j--;
			minDate1 = (Entry<Integer, Integer> ) list.get(j);
			System.out.println("11 in  compare maxDate1 " + maxDate1 + " minDate1 " + minDate1 + " j " + j);
		}
		System.out.println("11 after compare maxDate1 " + maxDate1 + " minDate1 " + minDate1 + " j " + j);
		
		int profit2 = 0;
		
		if(minDate1.getKey() < maxDate1.getKey() && maxDate1.getValue() > minDate1.getValue()){
			profit2 =  maxDate1.getValue() - minDate1.getValue();
		}
		
		System.out.println("profit2 = " + profit2);
		
		if(profit1 > profit2) {
			System.out.println("best purchase date " + minDate.getKey() + " price " + minDate.getValue() + " best sell date " + maxDate.getKey() + " price " + maxDate.getValue()   + " profit = " + profit1 );
		}else {
			System.out.println("best purchase date " + minDate1.getKey() + " price " + minDate1.getValue() + " best sell date " + maxDate1.getKey() + " price " + maxDate1.getValue()   + " profit = " + profit2 );
		}
		
	}
	
	private static List<Entry<Integer, Integer>> shortMapByPrice(Map<Integer, Integer> preictedMap) {
		
		Set<Entry<Integer, Integer>> entrySet = preictedMap.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(entrySet);
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>> (){
			
			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				
				return (o2.getValue()).compareTo(o1.getValue());
			}
			
		});
		
		return list;
	}

}
