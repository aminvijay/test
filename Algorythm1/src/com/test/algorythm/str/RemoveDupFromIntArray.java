package com.test.algorythm.str;

import java.util.Arrays;

public class RemoveDupFromIntArray {

	public static void main(String[] args) {
		int j = 0;
        int i = 1;
        
       // int[] input = {2,3,6,6,8,9};
        int[] input = {2,3,6,6,8,9,10,10,10,12,12};
        System.out.println(" arrays as string " + Arrays.toString(input));
        
        
        
        while(i < input.length){
        	System.out.println(" i = " + i + " j " + j + "  input i ["+i+"] " + input[i] + " input j ["+j+"] " + input[j]);
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }  
            
            System.out.println(" after i = " + i + " j " + j);
        }
        
       
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
            
            System.out.println(" k = " + k + " input[k] "  + input[k]);  
        }
        
        
        for(int k=0; k<output.length; k++){
        	System.out.println(output[k]);
        	
        }
        
        
        for(int k=0; k<input.length; k++){
        	 System.out.println(" k = " + k + " input[k] "  + input[k]); 
        	
        }


	}

}
