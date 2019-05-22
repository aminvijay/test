package net.javabeat.articles.spring.batch.examples.repeat;

import org.springframework.batch.repeat.RepeatCallback;
import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.RepeatStatus;

public class MyRepeatCallback implements RepeatCallback{
	
	private DbUpdater updater;

	public void setDbUpdater(DbUpdater updater){
		this.updater = updater;		 
	}
	
	public RepeatStatus doInIteration(RepeatContext context) throws Exception {
		
		boolean finished = updater.isFinished();
		if (finished){
			return RepeatStatus.FINISHED;
		}
		
		updater.update();		
		return RepeatStatus.CONTINUABLE;
	}

}
