package com.test.colle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDecendening {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello1", "abc", "sfs", "ttse", "abc", "bcd", "ABC", "BCD");
		Collections.sort(list);
		
		System.out.println("ascending order " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("decending order " + list);
		
		//case incensative
		
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("case no censative " + list);
	}

}
