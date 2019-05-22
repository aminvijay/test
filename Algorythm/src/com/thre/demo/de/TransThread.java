package com.thre.demo.de;

public class TransThread extends Thread {
	
	private FinTrans ft;
	private static String anotherLock = "";
	
	TransThread(FinTrans ft, String name) {
		super(name);
		this.ft = ft;
	}
	
	public void run () {
		 for (int i = 0; i < 10; i++) {
			 
			 if(getName().equals("Deposit Thread")) {
				
				 synchronized(anotherLock) {
					 synchronized(ft) {
						 ft.transname = "Deposit";
						 try {
							 Thread.sleep((int) Math.random() * 100);
						 }catch(InterruptedException e){
							 
						 }
						 ft.amount = 25000;
						 System.out.println (ft.transname + " " + ft.amount);
					 } 
				 }
				 
				 
			 }else {
				 synchronized(ft) {
					 synchronized(anotherLock) {
						 ft.transname = "Withdrawal";
						 try {
							 Thread.sleep((int) Math.random() * 100);
						 }catch(InterruptedException e){
							 
						 }
						 ft.amount = 250;
						 System.out.println (ft.transname + " " + ft.amount); 
					 }
					 
				 }
				 
			 }
			 
		 }
	}
	

}
