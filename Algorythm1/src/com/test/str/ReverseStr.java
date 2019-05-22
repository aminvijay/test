package com.test.str;

import java.util.Arrays;

public class ReverseStr {

	public static void main(String[] args) {
		System.out.println("Reverse String method1 " + method1("abcdef") );
		
		StringBuffer sb = new StringBuffer("abcdef");
		//System.out.println(" sub string " + sb.substring(1));
		sb.reverse();
		//System.out.println(" sb reverse " + sb);	
		
		reverseRecursively("abcd");
		
		String aa = reverseRecurse("abcdefg");
		//System.out.println(" aa " + aa);
		
		System.out.println("Reverse String recurStr " + recurStr("abcdef") );
	}
	
	private static String method1(String str) {
		char ch[] = str.toCharArray();
		char tmp;
		int len = ch.length-1;
		
		for(int i = 0; i < len; i++){
			
			tmp = ch[len];
			ch[len] = ch[i];
			ch[i] = tmp;
			len--;
		}
		
		return Arrays.toString(ch);
	}
	
	public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
		//System.out.println("  --------------- ");
		//System.out.println("  str " + str);
        if (str.length() < 2) {
            return str;
        }
      //  System.out.println("  str.substring(1)  " + str.substring(1) + " str.charAt(0) " + str.charAt(0));
        
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
	
	public static String reverseRecurse(String str){
		
		if(str.length() < 2) {
			return str;
		}
		
		return reverseRecurse(str.substring(1)) + str.charAt(0);
			
	}


	public static String recurStr(String str){
		
		if(str.length() < 2){
			return str;
		}
		
		return recurStr(str.substring(1) ) + str.charAt(0);
	}


}
