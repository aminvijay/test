package com.test.design.creational.builder;

public class Computer {
	
	//mandatory param	
	private String hdd;
	private String ram;
	
	// non-mandatory param	
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
	
	private Computer(ComputerBuilder computerBuilder) {
		this.hdd = computerBuilder.hdd;
		this.ram = computerBuilder.ram;
		this.mouse  = computerBuilder.mouse;
		this.keyboard = computerBuilder.keyboard;
	}
	
	public static class ComputerBuilder {
		//mandatory param
		private String hdd;
		private String ram;
		
		public ComputerBuilder(String hdd, String ram){
			this.hdd = hdd;
			this.ram = ram;
		}
		
		// non-mandatory param		
		private String mouse;
		private String keyboard;
		
		public ComputerBuilder setKeyboard(String keyboard) {
			this.keyboard = keyboard;
			return this;
		}

		public ComputerBuilder setMouse(String mouse) {
			this.mouse = mouse;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}		
	}
}
