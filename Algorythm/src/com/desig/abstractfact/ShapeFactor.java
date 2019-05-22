package com.desig.abstractfact;

public class ShapeFactor extends AbstractFactory {

	@Override
	Color getColor(String name) {
		return null;
	}

	@Override
	Shape getShape(String name) {
		Shape shape = null;
		
		if(name.equals("Circle")){
			shape = new Circle();
		}else if(name.equals("Square")){
			shape = new Square();
		}else if(name.equals("Rectangle")){
			shape = new Rectangle();
		}
		
		return shape;
	}

}
