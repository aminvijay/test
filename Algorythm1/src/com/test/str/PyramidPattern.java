package com.test.str;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawPyramid(5);

	}
	
	private static void drawPyramid(int no){
		
		for(int i = 1; i<=no; i++){
			for(int j = 1; j <=i; j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
