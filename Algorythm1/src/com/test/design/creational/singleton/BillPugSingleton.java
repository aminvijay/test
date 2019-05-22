package com.test.design.creational.singleton;

public class BillPugSingleton {
	
	private BillPugSingleton () {}
	
	private static class SingletonHelper  {
		private static final  BillPugSingleton INSTANCE = new BillPugSingleton();
	}
	
	public static BillPugSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
