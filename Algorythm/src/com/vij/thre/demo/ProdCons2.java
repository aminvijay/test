package com.vij.thre.demo;

public class ProdCons2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shared1 s = new Shared1 ();
		Producer1 p = new Producer1(s);
		Consumer1 c = new Consumer1(s);
		
		p.start();
		c.start();

	}

}
