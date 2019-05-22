package com.vij.thre.demo;

public class FinTrans2 {

	private String transName;
	private int amt;
	
	public synchronized void update(String transName, int amt) {
		this.transName = transName;
		this.amt = amt;
		System.out.println (this.transName + " " + this.amt);
	}
}
