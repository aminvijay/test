package com.test.algorythm.str;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListRemoveDuplicate {

	
		public static void main(String[] args) {
			
			int [] inarry = {3,4,6,8};
			System.out.println(" inarry 1 = " + inarry);
			
			
			List<Integer> dupList = new ArrayList<Integer>();
			dupList.add(5);
			dupList.add(2);
			dupList.add(4);
			dupList.add(6);
			dupList.add(5);
			dupList.add(7);
			dupList.add(2);
			
			System.out.println("list of prime numbers : " + dupList);
			
			Set<Integer> noDupSet = new LinkedHashSet<Integer>(dupList);
			dupList.clear();
			dupList.addAll(noDupSet);
			
			System.out.println("3*0.1 = " + 3*0.1);
			
			System.out.println("list of prime numbers : " + dupList);
			
			Integer[] aa = (Integer[])dupList.toArray();
			System.out.println("list of prime numbers : " + aa);
			int a = aa.length;
			dupList.size();
			
			
			dupList.subList(1, 3);
			
		}

	}
