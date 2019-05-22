package com.thre.demo.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class DemoMultiRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Runnable> listRunnable = new ArrayList<Runnable>();
		listRunnable.add(new TestOne());
		listRunnable.add(new TestTwo());
		
		BlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<Runnable> (10);
		RejectedExecutionHandler rejectionHandler = new RejectedExecutionHandelerImpl();
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2,2,10, TimeUnit.SECONDS, worksQueue, rejectionHandler);
		
		executor.prestartAllCoreThreads();
		
		worksQueue.add( new MultiRunable(listRunnable));
		

	}

}
