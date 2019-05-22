package com.test.design.strategy;

public class AnimalPlay {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		System.out.println("dog " + dog.flyingType.fly());
		System.out.println("cat " + cat.flyingType.fly());
		
		//make dog flying
		
		dog.setFlyingType(new CanFly());
		System.out.println("dog " + dog.flyingType.fly());
	}

}
