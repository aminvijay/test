package com.test.algorythm;

import java.util.Arrays;

public class Sorting {

	static int a[] = {3,8,2,7,5,4,6,9};
	static int a1[] = {3,8,2,7,5,4,6,9};
	static int a2[] = {3,8,2,7,5,4,6,9};
	
	public static void main(String[] args) {
		
		int aa = 7;
		System.out.println(7/2);
		
		//bubble sort
		for(int i=a.length-1;i>1; i--){
			//System.out.println(" i "  + i );
			
			for(int j =0; j <i; j++){
				
				//System.out.println(" i "  + i + " j " + j + "  a[j] " + a[j] + "  a[j+1] " +  a[j+1]);
				if(a[j] > a[j+1]){
					//System.out.println("in if  i "  + i + " j " + j + "  a[j] " + a[j] + "  a[j+1] " +  a[j+1]);
					swap(j, j+1, a);
				}
			}
		}

		System.out.println(" a after bubbole sort " + Arrays.toString(a));
		
		
		
		//selection sort
		System.out.println(" a1 before  selection sort " + Arrays.toString(a1));
		int smallImd;
		for(int i = 0; i<a1.length-2; i++) {
			smallImd = i;
			for(int j = i+1; j < a1.length; j++){
				if(a1[smallImd] > a1[j]){
					smallImd = j;
				}
			}
			swap(smallImd, i,a1);			
		}
		
		System.out.println(" a1 after  selection sort " + Arrays.toString(a1));
		
		//selection sort
		System.out.println(" a2 before  insertion sort " + Arrays.toString(a2));
		
		int key;
		int val;
		for(int i = 1; i < a2.length; i++){
			key = i;
			val = a2[i];
			
			while(key > 0 && a2[key-1] > val){
				swap(key-1, key, a2);
				key = key-1;
			}
			a2[key] = val;			
		}
		System.out.println(" a2 after  insertion sort " + Arrays.toString(a2));
		
		
		
		System.out.println(" fib no of 7 " + Arrays.toString(fib(7)));
		System.out.println(" fact no of 5 " + fact(5));
	}
	
	private static void swap(int a, int b, int z []) {
		int tmp = z[a];
		z[a] = z[b];
		z[b] = tmp;
	}
	
	private static int[] fib(int no){
		
		int [] fibSer = new int[no];
		
		if(no == 0){
			
		}else if(no <= 1) {
			fibSer[0] = 0;  
		} else {
			fibSer[0] = 0;
			fibSer[1] = 1;
			
			for(int i = 2; i < no; i++){
				fibSer[i] = fibSer[i-2] + fibSer[i-1] ;
			}
		}		
		return fibSer;
	}
	
	
	private static int fact(int no){
		
		if(no <1) {
			return 1;			
		}else {
			return  no * fact(no-1);
		}
	}
	

}
