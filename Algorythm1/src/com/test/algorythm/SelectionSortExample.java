package com.test.algorythm;

public class SelectionSortExample {

	public static void main(String[] args) {
		int a[] = {3,5,2,1,7,4};
		int total = a.length;
		
		for(int i = 0; i < a.length; i++){
			
			for(int j = i+1; j < a.length; j++){
				
				if(a[i] > a[j]){
					
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < a.length;i++){
			System.out.println(" index  "  + i + " no  "  + a[i]);
			
		}
	}

}
