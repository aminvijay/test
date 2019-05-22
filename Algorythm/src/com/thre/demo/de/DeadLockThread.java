package com.thre.demo.de;

public class DeadLockThread extends Thread {
	
	public DeadLockThread(String name){
		super(name);
	}
	
	private String str1 = "str1";
	private String str2 = "str2";
	
	
	public void run() {
		
		for(int i = 0 ; i < 10; i++) {
			
			if(this.getName().equalsIgnoreCase("firstThread")) {
			
				System.out.println("firstThread is running ");
				synchronized(str1){
					System.out.println("firstThread is running with str1 block.");
					synchronized(str2){
						System.out.println("firstThread is running with str2 block.");
						try {
							Thread.sleep((int) Math.random()*1000);
						}catch(Exception e){
							e.printStackTrace();
						}
					}
				}
				
			}else {
				System.out.println("secondThread is running ");
				synchronized(str2){
					System.out.println("secondThread is running with str2 block.");
					synchronized(str1){
						System.out.println("secondThread is running with str1 block.");
						try {
							Thread.sleep((int) Math.random()*1000);
						}catch(Exception e){
							e.printStackTrace();
						}
					}
				}
			}
		}
		
	}

}
