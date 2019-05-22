package test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		map.put("1", "arg1");
		map.put("2", "value2");
		
		System.out.println(" map = " + map);
		
		change(map);
		System.out.println(" after change map = " + map);

	}
	
	private static void change(Map m) {
		System.out.println(" in map = " + m);
		
		m.put("3", "value3");
		m = null;
		
		System.out.println("afer in map = " + m);
	}

}
