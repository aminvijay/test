package com.vij.thre.demo;

public class Shared1 {
	
	private char ch = '\u0000';
	private boolean writable = true;
	
	
	synchronized void setSharedChar (char c) { 
		
		while(!writable)
			try {
				wait();
			}catch(InterruptedException e){
				
			}
		
		this.ch = c;
		writable = false;		
		notify();
	}
	
	synchronized char getSharedChar () {
		
		while(writable)
			try {
				wait();
			}catch(InterruptedException e){
				
			}
		
		
		writable = true;
		notify();
		return ch;
	}

}
