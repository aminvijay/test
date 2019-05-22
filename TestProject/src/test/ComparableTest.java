package test;

import java.util.Arrays;

public class ComparableTest  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits = {"Apple", "Banana", "Mango"};
		
		Arrays.sort(fruits);
		
		for(String fr:fruits){
			System.out.println(fr);
		}

	}

}
