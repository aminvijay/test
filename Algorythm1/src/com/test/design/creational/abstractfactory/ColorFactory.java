package com.test.design.creational.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColor(String name) {
		Color color = null;
		
		if(name.equals("Red")){
			color = new Red();
		}else if(name.equals("Blue")){
			color = new Blue();
		}else if(name.equals("Green")){
			color = new Green();
		}		
		return color;
	}
}