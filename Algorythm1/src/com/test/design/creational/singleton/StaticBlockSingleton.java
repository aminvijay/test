package com.test.design.creational.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	static{
		try {
			instance = new StaticBlockSingleton();
		}catch(Exception e){
			System.out.println(" Exception while creating instance in static block.");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
