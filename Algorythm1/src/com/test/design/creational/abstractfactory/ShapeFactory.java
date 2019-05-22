package com.test.design.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String name) {

		Shape shape = null;
		
		if(name.equals("Square")){
			shape = new Square();
			
		}else if(name.equals("Triangle")){
			shape = new Triangle();
			
		}else if(name.equals("Circle")){
			shape = new Circle();
		}		
		return shape;		
	}

	@Override
	Color getColor(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
