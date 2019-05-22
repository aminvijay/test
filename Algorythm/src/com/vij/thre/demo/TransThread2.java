package com.vij.thre.demo;

public class TransThread2 extends Thread {
	
	private FinTrans2 ft;
	
	public TransThread2(FinTrans2 ft, String name){
		super(name);
		this.ft = ft;
	}
	
	public void run() {
		
		for(int i = 0 ; i < 10; i++) {
			
			if(getName().equals("Deposit Thread")) {
				
				try {
					Thread.sleep((int) Math.random() * 10);
				}catch(InterruptedException e) {
					
				}
				
				ft.update("Deposit", 2500);
			}else {
				try {
					Thread.sleep((int) Math.random() * 10);
				}catch(InterruptedException e) {
					
				}
				
				ft.update("Withdrawal", 10);
			}
		}
		
	}
	

}
