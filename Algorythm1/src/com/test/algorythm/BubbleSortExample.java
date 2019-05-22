package com.test.algorythm;

public class BubbleSortExample {

	public static void main(String[] args) {
		
		int a[] = {3,5,2,1,7,4};
		int total = a.length;
		
		for(int i = 0 ; i < total-1;i++){
			
			for (int j = 0; j< total-1; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < a.length;i++){
			System.out.println(" index  "  + i + " no  "  + a[i]);
			
		}
		

	}

}
