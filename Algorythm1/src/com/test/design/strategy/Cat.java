package com.test.design.strategy;

public class Cat extends Animal {
	
	public Cat() {
		super();
		
		flyingType = new CanFly();
	}

}
