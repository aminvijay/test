package com.test.design.creational.factory;

public class ShapeFactory {

	public Shape getShape(String name){
		
		Shape shape = null;
		
		if(name == "Square"){
			shape = new Square();
			
		}else if(name == "Triangle"){
			shape = new Triangle();
			
		}else if(name == "Circle"){
			shape  = new Circle();
		}
		
		return shape;
	}
}
