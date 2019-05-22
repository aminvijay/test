package com.desig.builder;

public class ComputerBuilderDemo {
	
	//http://www.journaldev.com/1425/builder-design-pattern-in-java

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Computer comp = new Computer.ComputerBuilder("1 TB", "10 GB").setMouse("Dell Mouse").setKeyboard("Micro Keyboard").build();

	}

}
