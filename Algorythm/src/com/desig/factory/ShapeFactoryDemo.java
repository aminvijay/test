package com.desig.factory;

public class ShapeFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.getShape("Circle");
		shape.draw();
		
		shape = factory.getShape("Square");
		shape.draw();
		
		shape = factory.getShape("Rectangle");
		shape.draw();

	}

}
