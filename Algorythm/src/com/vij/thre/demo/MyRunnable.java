package com.vij.thre.demo;

public class MyRunnable implements Runnable{

	public void run () {
		for(int i = 0; i < 10; i++) {
			System.out.println(" runnabe thread.");
			try {
				Thread.sleep(30);
				//mt.join();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
