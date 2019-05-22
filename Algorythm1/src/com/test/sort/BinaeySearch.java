package com.test.sort;

public class BinaeySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1, 2, 3, 4, 5, 7};
		int no = 6;
		System.out.println(" is exist " + findNo(a,no));		
		
	}
	
	private static int findNo(int a[],int no ) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start <= end ){
			
			int mid = (start+end)/2;
			
			if(a[mid] == no) {
				return mid;
			}else if( no < a[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		return -1;
		
	}

}
