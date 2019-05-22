package com.test.design.creational.abstractfactory;

public abstract class AbstractFactory {
	
	abstract Shape getShape(String name);
	abstract Color getColor(String name);

}
