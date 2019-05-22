package com.test.design.creational.abstractfactory;

public class FactoryBuilder {
	
	public AbstractFactory getFactory(String type) {
		
		AbstractFactory factory = null;
		
		if(type.equals("Shape")) {
			factory = new ShapeFactory();
		}else if(type.equals("Color")){
			factory = new ColorFactory();
		}		
		return factory;
	}
}