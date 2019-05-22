package net.javabeat.articles.spring.batch.examples.repeat;

public class DbUpdater{
	
	private int counter = 0;
	
	public void update(){
		
		System.out.println("Update database...");
	}
	
	public boolean isFinished(){
	
		boolean finishCondition;

		if (counter == 5){
			finishCondition = true;
		}else{
			finishCondition = false;
		}
		
		counter++;
		
		if (finishCondition){
			return true;
		}		
		return finishCondition;
	}
}