package net.javabeat.articles.spring.batch.examples.repeat;

import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.batch.repeat.listener.RepeatListenerSupport;

public class MyRepeatListener extends RepeatListenerSupport{

	public void after(RepeatContext context, RepeatStatus status) {
		
		System.out.println("After operation called with status " + status.toString());
	}

	public void before(RepeatContext context) {
		
		System.out.println("Before operation called");		
	}
}
