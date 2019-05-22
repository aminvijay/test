package com.desig.abstractfact;


public class FactoryProducer {
	
	public AbstractFactory getFactory(String type){
		AbstractFactory factory = null;
		
		if(type.equals("Shape")){
			factory = new ShapeFactor();
		}else if(type.equals("Color")){
			factory = new ColorFactory();
		}
		
		return factory;
	}

}
