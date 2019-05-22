package com.test.design.creational.factory;

public class ShapeFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.getShape("Square");
		shape.draw();
		
		shape = factory.getShape("Triangle");
		shape.draw();
		
		shape = factory.getShape("Circle");
		shape.draw();
	}
}
