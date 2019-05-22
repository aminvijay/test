package com.vij.thre.demo;

public class ThreadDemo {
	
	public static void main(String args[]) {
		
		MyThread mt = new MyThread();
		
		MyRunnable rb = new MyRunnable();
		Thread t =  new Thread(rb);
		t.start();
		
		//mt.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(" main thread.");
			try {
				Thread.sleep(30);
				//mt.join();
				t.join();
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
