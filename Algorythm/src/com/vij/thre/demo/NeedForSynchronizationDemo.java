package com.vij.thre.demo;

public class NeedForSynchronizationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FinTrans ft = new FinTrans();
		
		TransThread tt1 = new TransThread(ft, "Deposit Thread");
		TransThread tt2 = new TransThread(ft, "Withdrawal Thread");
		
		tt1.start();
		tt2.start();
		
		
		//FinTrans2 ft2 = new FinTrans2();
		
		//TransThread2 tt3 = new TransThread2(ft2, "Deposit Thread");
		//TransThread2 tt4 = new TransThread2(ft2, "Withdrawal Thread");
		
		//tt3.start();
		//tt4.start();
		

	}

}
