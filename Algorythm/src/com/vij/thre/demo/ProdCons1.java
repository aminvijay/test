package com.vij.thre.demo;

public class ProdCons1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shared s = new Shared ();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		p.start();
		c.start();
	}
}
