package com.thre.demo.executor;

import java.util.List;

public class MultiRunable implements Runnable{
	
	private  final List<Runnable> listRunnable;
	
	public MultiRunable(List<Runnable> listRunnable) {
		this.listRunnable = listRunnable;
	}
	
	public void run() {
		
		for(Runnable runnable: listRunnable) {
			new Thread(runnable).start();
			
		}
	}

}
