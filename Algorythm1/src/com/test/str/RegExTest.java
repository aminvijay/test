package com.test.str;

import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		String [] str = {"323", "323.44", "233", "15.4"};
		Pattern pattern = Pattern.compile(".*\\D.*");
		
		
		for(String no:str){
			System.out.println("is it no = " + !pattern.matcher(no).matches());
		}

	}

}
