package net.javabeat.articles.spring.batch.examples.a;

import java.util.List;

import org.springframework.batch.item.support.ListItemReader;

public class StringListItemReader extends ListItemReader<String>{

	public StringListItemReader(List<String> list) {
		super(list);		
	}

	public String read(){
		
		String readData = super.read();
		System.out.println("Reading data " + readData);
		return readData;
	}
}
