package com.test.design.strategy;

public class Animal {

	
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	// Instead of using an interface in a traditional way
		// we use an instance variable that is a subclass
		// of the Flys interface.
		
		// Animal doesn't care what flyingType does, it just
		// knows the behavior is available to its subclasses
		
		// This is known as Composition : Instead of inheriting
		// an ability through inheritance the class is composed
		// with Objects with the right ability
		
		// Composition allows you to change the capabilities of 
		// objects at run time!
	public Flys flyingType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public Flys getFlyingType() {
		return flyingType;
	}

	// If you want to be able to change the flyingType dynamically
	
	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}
	
	public String tryToFly () {
		return flyingType.fly();
	}
	
}
