package test.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortingObject {

	public static void main(String[] args) {
		int[] intArray = {1,4,7,2};
		System.out.println("intArray " + Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("intArray " + Arrays.toString(intArray));
		
		List<String> list = new ArrayList<String> ();
		
		list.add("2");
		list.add("4");
		list.add("21");
		list.add("1");
		System.out.println("intArray " + list);
		Collections.sort(list);
		System.out.println("intArray " + list);
		
		for(String str:list){
			System.out.println("intArray " + str);
		}
		
	}

}
