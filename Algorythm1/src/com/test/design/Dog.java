package com.test.design;

import java.util.Collections;
import java.util.List;

public class Dog extends Animal {
	
	public void digHole(){
		
		System.out.println("Dug a hole");
		
	}
	
	
	public void setFavFood(String favFood) {
		
		//favFood = " dog favfood ";
		System.out.println("in dog class fav food is " + favFood );
		super.setFavFood(favFood);
	}
	
	
	
	public void setTypes(List<String> types) {
		//System.out.println("in dog class  before adding types " + types);
		types.add("desi");
		
		//System.out.println("in dog class  after adding types " + types);
		
		Collections.sort(types);
		
	}
	

}
