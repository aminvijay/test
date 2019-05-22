package com.vij.algorythm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("vijay", "amin", 1);
		Person p2 = new Person("ajay", "patel", 4);
		Person p3 = new Person("amit", "shah", 7);
		Person p4 = new Person("rahul", "jain", 2);
		
		List<Person> li = new ArrayList<Person>();
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		
		sortByID(li);
		
		//System.out.println(" li " + li);
		sortByLname(li);
		System.out.println(" sortByLname " + li);
		
	}
	
	
	private static void sortByID(List<Person> li){
		
		Collections.sort(li, new Comparator<Person>(){
			
			public int compare(Person p1, Person p2){
				return p1.getId()-p2.getId();
			}
		});
	}
	
	private static void sortByLname(List<Person> li) {
		
		Collections.sort(li, new Comparator<Person>() {
			
			public int compare(Person p1, Person p2){
				return (p1.getLname().compareTo(p2.getLname()));
			}
			
		});
		
	}

}
