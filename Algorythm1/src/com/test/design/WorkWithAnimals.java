package com.test.design;

import java.util.ArrayList;
import java.util.List;

public class WorkWithAnimals {

	public static void main(String[] args) {
		
		String favFood = "aa";
		
		Dog dog = new Dog();
		dog.setFavFood(favFood);
		
		System.out.println("in WorkWithAnimals class fav food is " + favFood );
		
		WorkWithAnimals aa = new WorkWithAnimals();
		aa.changeDogFavFood(dog);
		
		System.out.println("in WorkWithAnimals after change class fav food is " + dog.getFavFood() );
		
		
		List<String> li = new ArrayList<String>();
		li.add("dog1");
		li.add("dog3");
		li.add("dog2");
		li.add("ameri");
		li.add("japan");
		
		//System.out.println("in WorkWithAnimals class li is " + li );
		dog.setTypes(li);
		
		//System.out.println("in WorkWithAnimals class li after is " + li );

	}
	
	private void changeDogFavFood(Dog dog1) {
		
		System.out.println("in WorkWithAnimals class changeDogFavFood method before change class fav food is " + dog1.getFavFood() );
		
		dog1.setFavFood("abcd");		
	}

}

