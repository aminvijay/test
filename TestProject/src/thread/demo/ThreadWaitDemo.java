package thread.demo;

public class ThreadWaitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadWait tw = new ThreadWait();
		Thread t = new Thread(tw);
		t.start();
		
		synchronized(tw){
			try{
				System.out.println(" start calling main ");
				tw.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		System.out.println("total = " + tw.total);

	}

}
