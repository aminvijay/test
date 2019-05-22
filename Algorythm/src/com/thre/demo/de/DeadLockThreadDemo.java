package com.thre.demo.de;

public class DeadLockThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DeadLockThread dt1 = new DeadLockThread("firstThread");
		DeadLockThread dt2 = new DeadLockThread("secondThread");
		
		dt1.start();
		dt2.start();
	}
}
