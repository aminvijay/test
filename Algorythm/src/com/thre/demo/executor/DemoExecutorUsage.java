package com.thre.demo.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {
	
	private static ExecutorService executor = null;
	private static volatile Future taskOne = null;
	private static volatile Future taskSecond = null;

	public static void main(String[] args) {
		
		executor = Executors.newFixedThreadPool(2);
		
		while(true){
			try{
				checkTask();
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
	private static void checkTask() throws Exception {
		
		if(taskOne == null || taskOne.isCancelled() || taskOne.isDone()) {
			taskOne = executor.submit(new TestOne());
		}
		
		if(taskSecond == null || taskSecond.isCancelled() || taskSecond.isDone()) {
			taskSecond = executor.submit(new TestTwo());
		}
	}
	
}
