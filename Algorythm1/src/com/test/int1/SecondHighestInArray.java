package com.test.int1;

public class SecondHighestInArray {

	public static void main(String[] args) {
		
		int a[] = {3,5,1,8,9,22,16,2,4,17,14};
		
		int fl = 0;
		int sl = 0;
		
		//first check which is higher no in first two number
		
			
		if(a[0] > a[1]){
			fl = a[0];
			sl = a[1];
		}else {
			fl = a[1];
			sl = a[0];
		}
		
		// because we already compare 0 and element, so next iteration must start from 2
		
		for(int i = 2; i < a.length; i++){
			
			//next no is higher then first highest no
			if(a[i] > fl){
				sl = fl;
				fl = a[i];
			}else if(a[i] < fl && a[i] > sl){
				// no is lesser than first highest no but greater than second highest no
				sl = a[i];
			}
		}
		
		System.out.println(" first highst no " + fl + " Secon Highest no " + sl);

	}

}
