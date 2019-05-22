package com.test.design.creational.singleton;

public class DoubleLockSingleton {
	
	private static DoubleLockSingleton instance;
	
	private DoubleLockSingleton() {}
	
	public static synchronized DoubleLockSingleton getInstance() {
		
		if(instance == null){
			synchronized (DoubleLockSingleton.class) {
				if(instance == null){
					instance = new DoubleLockSingleton();
				}
			}
		}
		
		return instance;
	}
	

}
