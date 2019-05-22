package com.test.algorythm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		  personList.add(new Person("1", "Kevin", "kevin@email.com"));
		  personList.add(new Person("2", "Brian", "brian@email.com"));
		  personList.add(new Person("3", "Steve", "steve@email.com"));
		  personList.add(new Person("4", null, "bill@email.com"));
		  personList.add(new Person("5", "Obama", "obama@email.com"));
		  
		  PersonSort sortExample = new PersonSort();
		  System.out.println("Before sorting:" + personList);
		  sortExample.sortPersonByEmailId(personList);
		  System.out.println("After sorting:" + personList);

	}
	
	private void sortPersonByEmailId(List<Person> list) {
		
		Collections.sort(list, new Comparator<Person> () {

			@Override
			public int compare(Person p1, Person p2) {
				
				return (p1.getEmail().compareTo(p2.getEmail()));
			}
			
		});
	}

}
