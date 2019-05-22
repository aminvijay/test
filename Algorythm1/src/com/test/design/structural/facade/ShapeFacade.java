package com.test.design.structural.facade;

public class ShapeFacade {
	
	private Shape circle;
	private Shape square;
	private Shape triangle;
	
	public ShapeFacade() {
		circle = new Circle();
		square = new Square();
		triangle = new Triangle();
	}
	
	public void drawCrcle(){
		circle.draw();
	}
	
	public void drawSquare(){
		square.draw();
	}
	
	public void drawTriangle(){
		triangle.draw();
	}

}
