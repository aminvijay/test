package com.desig.factory;

public class ShapeFactory {
	
	public Shape getShape(String type){
		
		Shape shape = null;
		
		if(type.equals("Circle")){
			shape = new Circle();
		}else if(type.equals("Square")){
			shape = new Square();
		}else if(type.equals("Rectangle")){
			shape = new Rectangle();
		}		
		return shape;		
	}

}
