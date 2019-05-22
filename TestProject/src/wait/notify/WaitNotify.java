package wait.notify;

public class WaitNotify implements Runnable {

	int total;
	
	public void run() {
		synchronized(this) {
			for(int i=0; i<100 ; i++){
	            total += i;
	        }
			notify();
		}
	}
}
