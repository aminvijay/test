package com.thre.demo.executor;

public class TestOne implements Runnable {

	public void run() {
		
		
		while(true){
			
			System.out.println("in Test One");
			
			try {
				Thread.sleep((int) Math.random()*10);
			}catch(InterruptedException e) {
				
			}
		}
	}

}
