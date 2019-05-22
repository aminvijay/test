package com.test.design.structural.adapter;

public class Socket {
	
	public Volt getVolts() {
		return new Volt(120);
	}

}
