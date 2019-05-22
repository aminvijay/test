package com.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aa {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		//["A:B,C,D", "B:A,D,E", "C:B,E", "E:F"], "A" =>  ["B,C,D", "E", "F"]
		
		// not work ["A:B,C,D", "B:A,E", "C:B,E", "E:F"]
		
		String str [] = {"A:B,C,D", "B:A,D,E", "C:B,E", "E:F"};
	    String inputKey = "A";
	    List li = Arrays.asList(str);
	    
	    
	    Map map = new HashMap();
	    
	    for(int  i = 0; i < li.size(); i++) {
	        
	        String abc = str[i];
	        
	        String inputKeyArray[] = abc.split(":");
	        
	        String key = inputKeyArray[0];
	        String val = inputKeyArray[1];
	        
	        map.put(key, val);
	        
	    }
	    
	    System.out.println((String) map.get(inputKey));
	    
	    String inputKeyVal = (String) map.get(inputKey);
	    String inputKeyValArray [] = inputKeyVal.split(",");
	    
	    List internalIst =Arrays.asList(inputKeyValArray);
	    
	    StringBuffer sb = new StringBuffer();
	    sb.append("[");
	    sb.append(inputKeyVal);
	    
	    Set set = map.keySet();
	    
	   Iterator it1 =   set.iterator();
	   Iterator it = map.keySet().iterator();
	    
	   while(it.hasNext()) {
		   String kk = (String)it.next();
		   
		   if(kk.equals(inputKey)) {
			   
		   }else {
			   String kkVal = (String) map.get(kk);
			   if(kkVal != null && kkVal.length() > 1) {
				   String kkValArry[] = kkVal.split(",");
				   for(int j = 0; j<kkValArry.length; j++){
					   String aa = kkValArry[j];
					   if(! internalIst.contains(aa)) {
						   sb.append(","+aa);
						   System.out.println( " in if " + aa);
						   //internalIst.add(aa);
					   }
				   }
			   }else {
				   System.out.println( " in else " + kkVal);
				   if(! internalIst.contains(kkVal)) {
					   sb.append(","+kkVal);
					   //internalIst.add(kkVal);
				   }
			   }
		   }
		   System.out.println( " sb " + sb.toString());
	   }
	    
	}

}
