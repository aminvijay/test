package com.array;

import java.util.Arrays;

public class RotatteArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Rotate Array from n position
		
		int a[] = {1,3,5,7,8,9,2};
		int pos = 3;
		int len = a.length;
		
		/*while (pos != a.length) {
			
			int posVal = a[pos];
			
			for(int i = pos; i > 0; i--){
				a[i] = a[i-1];	
				
				System.out.println(" aa new array " + Arrays.toString(a) + " pos = " + pos + " posVal " + posVal + " i " + i);
			}
			a[0] = posVal;
			pos = pos+1;
			
			System.out.println(" bb new array " + Arrays.toString(a) + " pos = " + pos + " posVal " + posVal );
		}
		
		System.out.println(" new array " + Arrays.toString(a));
		
		*/
		
		
		while (pos != a.length) {
			
			int lastVal = a[len-1];
			
			for(int i = len-1; i > 0; i--){
				a[i] = a[i-1];	
				
				System.out.println(" aa new array " + Arrays.toString(a) + " pos = " + pos + " lastVal " + lastVal + " i " + i);
			}
			a[0] = lastVal;
			pos = pos+1;
			
			System.out.println(" bb new array " + Arrays.toString(a) + " pos = " + pos + " lastVal " + lastVal );
		}
		
		System.out.println(" new array " + Arrays.toString(a));

	}

}
