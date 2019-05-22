package com.vij.thre.demo;

public class TransThread extends Thread {
	
	private FinTrans ft;
	private String anotherLock = "";
	
	public TransThread(FinTrans ft, String name) {
		super(name);
		this.ft = ft;
	}
	
	public void run () {
		
		for(int i = 0 ; i < 10; i++) {
			
			
			if(getName().equals("Deposit Thread")) {
				
				synchronized(anotherLock) {
					synchronized(ft) {
						ft.transName = "Deposit";
						
						try {
							Thread.sleep((int) Math.random() * 10);
						}catch(InterruptedException e) {
							
						}
						
						ft.amt = 2500;
						
						System.out.println (ft.transName + " " + ft.amt);
					}
				}
				
				
				
			}else {
				synchronized(ft) {
					synchronized(anotherLock) {
						ft.transName = "Withdrawal";
						
						try {
							Thread.sleep((int) Math.random() * 10);
						}catch(InterruptedException e){
							
						}
						
						ft.amt = 100;
						System.out.println (ft.transName + " " + ft.amt);
					}
					
				}
				
			}
		}
		
	}

}
