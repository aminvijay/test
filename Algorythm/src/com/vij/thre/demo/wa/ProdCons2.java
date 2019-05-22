package com.vij.thre.demo.wa;

public class ProdCons2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shared s = new Shared ();
	      new Producer (s).start ();
	      new Consumer (s).start ();


	}

}
