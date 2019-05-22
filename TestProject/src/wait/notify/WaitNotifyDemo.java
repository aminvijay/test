package wait.notify;

public class WaitNotifyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WaitNotify tw = new WaitNotify();
		
		Thread t1 = new Thread(tw, "OtherThread");
		t1.start();
		synchronized(tw) {
			try{
				System.out.println(" start waiting ");
				tw.wait();
				System.out.println(" end waiting ");
			}catch(InterruptedException e ){
				e.printStackTrace();
			}
		}
		System.out.println("totral " + tw.total);		
	}
}
