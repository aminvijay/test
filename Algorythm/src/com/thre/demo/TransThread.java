package com.thre.demo;

public class TransThread extends Thread {
	
	private FinTrans fs;
	
	public TransThread(FinTrans fs, String name){
		super(name);
		this.fs = fs;
	}
	
	public void run() {
		
		
		for (int i = 0; i < 5; i++){
			
			if(getName().equals("Deposit Thread")) {
				
				synchronized (fs) {
					fs.transname = "Deposit";
					try {
						Thread.sleep( (int) (Math.random() * 1000 ) );
					}catch(InterruptedException e){
						
					}
					
					fs.amount=20000;
					System.out.println (fs.transname + " " + fs.amount);
				}
				
				
			}else {
				synchronized (fs) {
					fs.transname = "Withdrawal";
					
					try {
						Thread.sleep( (int) (Math.random() * 1000));
					}catch(InterruptedException e) {
						
					}
					
					fs.amount = 250;
					System.out.println (fs.transname + " " + fs.amount);
				}
				
			}
		}
	}
	

}
