package com.desig.builder;

public class Computer {
	
	// required param
	private String hdd;
	private String ram;
	
	// optional param
	private String mouse;
	private String keyboard;
	
	public String getHdd() {
		return hdd;
	}
	public String getRam() {
		return ram;
	}
	public String getMouse() {
		return mouse;
	}
	public String getKeyboard() {
		return keyboard;
	}
	
	private  Computer (ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.mouse = builder.mouse;
		this.keyboard = builder.keyboard;		
	}
	
	public static class ComputerBuilder {		

		// required param
		private String hdd;
		private String ram;
		
		// optional param
		private String mouse;
		private String keyboard;
		
		public ComputerBuilder(String hdd, String ram){
			this.hdd = hdd;
			this.ram = ram;
		}

		public ComputerBuilder setMouse(String mouse) {
			this.mouse = mouse;
			return this;
		}

		public ComputerBuilder setKeyboard(String keyboard) {
			this.keyboard = keyboard;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}		
	}	
}
