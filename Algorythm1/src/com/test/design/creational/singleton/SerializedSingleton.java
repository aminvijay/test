package com.test.design.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{
	
	private SerializedSingleton () {}
	
	private static final long serializedVersionUD = -1l;
	
	
	private static class SingletonHelper {
		
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	
}
