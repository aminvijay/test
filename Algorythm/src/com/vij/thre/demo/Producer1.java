package com.vij.thre.demo;

public class Producer1 extends Thread {

	private Shared1 sh;
	
	public Producer1(Shared1 sh) {
		this.sh = sh;
	}
	
	public void run () {
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			try {
				Thread.sleep((int) Math.random() * 10);
			}catch(InterruptedException e){
				
			}
			
			sh.setSharedChar(ch);
			System.out.println (ch + " produced by producer.");
		}
		
	}
}
