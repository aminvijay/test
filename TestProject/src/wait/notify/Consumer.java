package wait.notify;

public class Consumer extends Thread{
	
	Producer producer;
	
	Consumer(Producer p){
		producer = p;
	}
	
	public void run() {
		try{
			while(true){
				String message = producer.getMessages();
				System.out.println("consumer message = " + message);
			}
		}catch(InterruptedException e ){
			e.printStackTrace();
		}		
	}
	
	public static void main(String args[]){
		Producer p = new Producer();
		p.start();
		new Consumer(p).start();
	}

}
