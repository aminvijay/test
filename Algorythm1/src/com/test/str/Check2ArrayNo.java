package com.test.str;

import java.util.Arrays;
import java.util.List;

public class Check2ArrayNo {

	public static void main(String[] args) {
		int ar1[] = {1,2,3,4,5};
		int ar2 [] = {2,3,1,0,5};
				
		System.out.println("ar1 " + Arrays.toString(ar1));
		System.out.println("ar2 " + Arrays.toString(ar2));
		
		String str = Arrays.toString(ar2);
		
		for(int i = 0 ; i<ar1.length; i++){
			int ind = str.indexOf(ar1[i]);
			System.out.println(" missing no " +  ar1[i] + " str " + str + " ind " + ind + " str len " + str.length()); 
			if(ind == -1){
				
			}
		}

	}

}
