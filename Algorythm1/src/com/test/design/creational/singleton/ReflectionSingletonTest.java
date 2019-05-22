package com.test.design.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton second = null;
		
		
		try {
			Constructor [] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			
			for(Constructor constr: constructors){
				//below code will break singleton 
				constr.setAccessible(true);
				second  = (EagerInitializedSingleton) constr.newInstance(); 
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(" hash code for singleton " + singleton.hashCode());
		System.out.println(" hash code for second " + second.hashCode());

	}

}
