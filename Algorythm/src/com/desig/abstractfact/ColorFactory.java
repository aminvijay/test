package com.desig.abstractfact;

public class ColorFactory extends AbstractFactory {

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

	@Override
	Shape getShape(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
