package net.javabeat.articles.spring.batch.examples.retry;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.batch.retry.policy.SimpleRetryPolicy;
import org.springframework.batch.retry.support.RetryTemplate;

public class RetryTest {

	public static void main(String[] args) throws Exception {
		
		RetryTemplate template = new RetryTemplate();
		
		SimpleRetryPolicy policy = new SimpleRetryPolicy();
		policy.setMaxAttempts(10);
		
		Collection<Class<? extends Throwable>> retryableExceptions = new ArrayList<Class<? extends Throwable>>();
		retryableExceptions.add(ConnectionFailureException.class);
		retryableExceptions.add(Exception.class);
		policy.setRetryableExceptionClasses(retryableExceptions);

		Collection<Class<? extends Throwable>> fatalExceptionClasses = new ArrayList<Class<? extends Throwable>>();
		fatalExceptionClasses.add(ResourceNotAvailableException.class);
		
		policy.setFatalExceptionClasses(fatalExceptionClasses);
		
		template.setRetryPolicy(policy);
				
		ConnectionRetryCallback callback = new ConnectionRetryCallback();
		template.execute(callback);
	}
}
