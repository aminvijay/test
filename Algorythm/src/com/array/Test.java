package com.array;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		String str = "abcdb";
		str.replace('b', 'g');
		System.out.println(str);
	}

}
