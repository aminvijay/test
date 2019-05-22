package com.test.design.strategy;

public class Dog extends Animal {
	
	public Dog(){
		super();
		//we set the Fly interface Polymorphically
		//this set the behaviour of non fluying
				
		flyingType = new NoFly();
	}

}
