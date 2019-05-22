package com.thre.demo.executor;

public class TestTwo implements Runnable{
	
	public void run() {
		
		
		while(true) {
			
			System.out.println("in Two run ");
			try {
				Thread.sleep((int) Math.random() *10);
			}catch(InterruptedException e) {
				
			}
			
		}
	}

}
