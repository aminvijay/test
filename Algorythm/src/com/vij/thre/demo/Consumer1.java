package com.vij.thre.demo;

public class Consumer1 extends Thread {
	
	private Shared1 sh;
	
	public Consumer1(Shared1 sh) {
		this.sh = sh;
	}
	
	public void run () {
		
		char ch;
		
		do{
			try {
				Thread.sleep((int) Math.random() * 10);
			}catch(InterruptedException e){
				
			}
			ch = sh.getSharedChar();
			System.out.println (ch + " consumed by consumer.");
			
		}
		while(ch != 'Z');
	}

}
