package net.javabeat.articles.spring.batch.examples.retry;

import org.springframework.batch.retry.RetryCallback;
import org.springframework.batch.retry.RetryContext;

public class ConnectionRetryCallback implements RetryCallback<MyConnection>{

	private int retryCount = 0;
	
	public MyConnection doWithRetry(RetryContext context) throws Exception {

		retryCount ++;
		
		System.out.println("In Retry " + retryCount);
		if (retryCount == 10){
			return new MyConnection("SUCCESS");
		}else if (retryCount == 7){			
			throw new ResourceNotAvailableException();
		}else if (retryCount == 5){
			throw new ConnectionFailureException();
		}
		
		throw new Exception();
	}

}

class MyConnection{
	
	public MyConnection(String status){}
}
