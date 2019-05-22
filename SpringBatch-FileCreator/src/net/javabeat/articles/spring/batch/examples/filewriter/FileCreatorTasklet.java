package net.javabeat.articles.spring.batch.examples.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

 public class FileCreatorTasklet implements Tasklet{  

	 private String filePath;
	 private String content;  

	 
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public void setContent(String content) {  
		 this.content = content;  
	 }  

//	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		
		 FileWriter fileWriter = null;
		 BufferedWriter bWriter = null;
		 
		 try{			 
			 fileWriter = new FileWriter(filePath);
			 bWriter = new BufferedWriter(fileWriter);			 
			 bWriter.write(content);
		 }catch (Exception e){
			 e.printStackTrace();
			 throw e;
		 }finally{
			 if (bWriter != null){
				 bWriter.close();
			 }
			 if (fileWriter != null){
				 fileWriter.close();
			 }
		 }		
		return RepeatStatus.FINISHED;
	}  
}