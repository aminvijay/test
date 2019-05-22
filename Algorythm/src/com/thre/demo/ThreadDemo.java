package com.thre.demo;

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//MyThread mt = new MyThread();
		//mt.start();
		
		Thread t = new Thread(new MyRunnable());
		t.start();
		for (int i = 0; i < 5; i++)
	           System.out.println ("i = " + i + ", i * i = " + i * i);
		

	}

}
