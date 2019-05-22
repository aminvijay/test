package net.javabeat.articles.spring.batch.examples.filewriter;

import org.springframework.batch.core.launch.support.CommandLineJobRunner;

public class Main {

	public static void main(String[] args) {
		
		CommandLineJobRunner.main(new String[]{"fileWritingJob.xml", "fileWritingJob"});
	}
}
