package net.javabeat.articles.spring.batch.examples.repeat;

import org.springframework.batch.repeat.RepeatListener;
import org.springframework.batch.repeat.policy.SimpleCompletionPolicy;
import org.springframework.batch.repeat.support.RepeatTemplate;

public class RepeatTest {

	public static void main(String[] args) {
		
		RepeatTemplate template = new RepeatTemplate();
		
		SimpleCompletionPolicy policy = new SimpleCompletionPolicy();
		policy.setChunkSize(4);
		
		template.setCompletionPolicy(policy);
		
		MyRepeatCallback callback = new MyRepeatCallback();
		DbUpdater updater = new DbUpdater();
		
		callback.setDbUpdater(updater);
		
		RepeatListener[] listeners = {new MyRepeatListener()};
		template.setListeners(listeners);
		
		template.iterate(callback);		
	}
}
