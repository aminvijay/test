package com.thre.demo;

public class CalcPI1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 mt = new MyThread1();
		mt.start();
		while(mt.isAlive()) {
			try {
				//Thread.sleep(1);
				mt.join();
			}catch(InterruptedException e){
				
			}
		}
		
		System.out.println ("pi = " + mt.pi);
	}

}
