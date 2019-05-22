package wait.notify;

import java.util.Vector;

public class Producer extends Thread{
	
	public static final int MAX = 5;
	private Vector messages = new Vector();
		
	public void run() {
		try {
			while(true){
				putMessage();
			}
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
	}
	
	public synchronized void putMessage() throws InterruptedException {
		System.out.println(" in put message size " + messages.size());
		while(messages.size() == MAX){
			System.out.println(" messages size reached max, stop adding");
			wait();
			System.out.println("Afterrerrrrrrrrrrrrrrrrrr messages size reached max, stop adding");		
		}
		messages.addElement(new java.util.Date().toString());
		System.out.println("after put messages");
		notify();
	}
	
	public synchronized String getMessages () throws InterruptedException {
		notify();
		System.out.println(" in getMessages message size " + messages.size());
		while(messages.size() == 0 ){
			System.out.println(" messages size is zero, don't delete ");
			wait();
			System.out.println("Afterrrrrrrrrrrrbbbbbbbbbbbbbbb messages size is zero, don't delete ");
		}
		String message = (String) messages.firstElement();
		return message;		
	}

}
