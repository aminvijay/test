package com.desig.singl;

public class SingletonDemo {
	
	private static final SingletonDemo singletonDemo = new SingletonDemo();
	private SingletonDemo() {
		
	}
	
	public static SingletonDemo getInstance(){
		return singletonDemo;
	}

}
