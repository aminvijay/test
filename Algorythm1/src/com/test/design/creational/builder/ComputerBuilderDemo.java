package com.test.design.creational.builder;

import com.test.design.creational.builder.Computer.ComputerBuilder;

public class ComputerBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("2 TB HDD", " 10 GB RAM").setMouse("Dell mouse").setKeyboard("Apple keyboard").build();
		
		ComputerBuilder cb = new Computer.ComputerBuilder("2 TB HDD", " 10 GB RAM");
		cb = cb.setKeyboard("");
		cb = cb.setMouse("");
		
		Computer c = cb.build();

	}

}
