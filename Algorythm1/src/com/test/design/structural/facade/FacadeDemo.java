package com.test.design.structural.facade;

public class FacadeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFacade facade = new ShapeFacade();
		
		facade.drawCrcle();
		facade.drawSquare();
		facade.drawTriangle();
	}

}
