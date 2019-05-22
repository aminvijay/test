package com.test.design.strategy;

//Class used if the Animal can't fly

public class NoFly implements Flys {

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Can't Fly.";
	}

}
