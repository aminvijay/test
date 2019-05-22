package com.test.design.creational.abstractfactory;

public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FactoryBuilder builder = new FactoryBuilder();
		
		ShapeFactory shapeFactory = (ShapeFactory) builder.getFactory("Shape");
		ColorFactory colorFactory = (ColorFactory) builder.getFactory("Color");
		
		Shape shape = shapeFactory.getShape("Square");
		shape.draw();
		
		shape = shapeFactory.getShape("Triangle");
		shape.draw();
		
		shape = shapeFactory.getShape("Circle");
		shape.draw();
		
		
		Color color = colorFactory.getColor("Red");
		color.feel();
		
		color = colorFactory.getColor("Blue");
		color.feel();
		
		color = colorFactory.getColor("Green");
		color.feel();
			}

}
