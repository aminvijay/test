package com.test.design.creational.singleton;

public class EagerInitializedSingleton {
	
	//http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-with-examples
	
	private static final EagerInitializedSingleton singleton = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {}
	
	public static EagerInitializedSingleton getInstance() {
		return singleton;
	}

}
