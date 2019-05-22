package com.test.design.creational.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton () {}
	
	public static synchronized ThreadSafeSingleton getinstance() {
		
		if(instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

}
