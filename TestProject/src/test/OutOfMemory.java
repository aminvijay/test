package test;

public class OutOfMemory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] char1 = new char[20000000];
		
		String s = new String (char1);
		
		System.out.println(" s.length " + s.length());
		
		StringBuilder sb = new StringBuilder(s);

	}

}
