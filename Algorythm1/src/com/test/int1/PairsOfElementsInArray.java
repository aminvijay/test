package com.test.int1;

import java.util.Arrays;

public class PairsOfElementsInArray {

	public static void main(String[] args) {
		int a [] =  {-1,-4,1,7,2,4, 6, 11,14,5, -10, 8, 5, 20};
		int no = 10;
		
		System.out.println("a " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sort " + Arrays.toString(a));
		
		int i = 0;
		int j = a.length-1;
		
		while (i< j){
			
			if(a[i] + a[j] == no){
				System.out.println(" Pair is " + a[i] + " " + a[j]);
				i++;
				j--;
			} else if(a[i] + a[j] < no){
				i++;
			} else if(a[i] + a[j] > no){
				j--;
			}
		}
	} 

}
