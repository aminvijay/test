package com.vij.thre.demo.wa;

public class Consumer extends Thread {
	private Shared s;

	   Consumer (Shared s)
	   {
	      this.s = s;
	   }

	   public void run ()
	   {
	      char ch;

	      do
	      {
	         try
	         {
	            Thread.sleep ((int) (Math.random () * 4000));
	         }
	         catch (InterruptedException e) {}

	         ch = s.getSharedChar ();
	         System.out.println (ch + " consumed by consumer.");
	      }
	      while (ch != 'Z');
	   }
}
