package com.desig.abstractfact;

public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FactoryProducer producer = new FactoryProducer();
		
		ShapeFactor ShapeFactor = (ShapeFactor) producer.getFactory("Shape");
		ColorFactory ColorFactory = (ColorFactory)producer.getFactory("Color");
		
		Shape shape = ShapeFactor.getShape("Circle");
		shape.draw();
		
		shape = ShapeFactor.getShape("Square");
		shape.draw();
		
		shape = ShapeFactor.getShape("Rectangle");
		shape.draw();
		
		Color color = ColorFactory.getColor("Red");
		color.feel();
		
		color = ColorFactory.getColor("Blue");
		color.feel();
		
		color = ColorFactory.getColor("Green");
		color.feel();
		

	}

}
