import java.util.Random;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = getRandomString200();
		System.out.println(" str " + str);
		//char ch[] = str.toCharArray();
		
		int maxPass = findMax(str);
		
		System.out.println( " maxPass " + maxPass);
		
		/*for(int i = 0; i< ch.length; i++){
			
			boolean isInteger = isInteger(ch[i]);
			
			System.out.println("ch[i]  " + ch[i] + " isInteger " + isInteger + " isupper " + Character.isUpperCase(ch[i]));
		}*/
		
		
	}
	
	
	
	public static boolean isInteger(char str) {
	    try {
	        Integer.parseInt(str+"");
	        return true;
	    } catch (NumberFormatException nfe) {}
	    return false;
	}
	
	
	public static String getRandomString200() {
		
		Random generator = new Random();
	    StringBuilder stringBuilder = new StringBuilder();
	    int Length = 200;
	    char tempChar ;
	    for (int i = 0; i < Length; i++){
	        tempChar = (char) (generator.nextInt(96) + 32);
	        stringBuilder.append(tempChar);
	        
	    }
	    
	    return stringBuilder.toString();
	}
	
	public static int findMax(String s) {
		
		char ch[] = s.toCharArray();
		
		boolean containsUpperCase = false;
		
		for(int i = 0; i< ch.length; i++){
			
			if(Character.isUpperCase(ch[i])) {
				containsUpperCase = true;
				break;
			}
		}
		
		if(!containsUpperCase) {
			return -1;
		}
		
		int globalMax =0;
		for(int i= 0; i < s.length(); i++) {
		int leftMax =0;
		int rightMax =0;
		int total = 0;
		if(Character.isUpperCase(s.charAt(i))) {
		for(int j=i; j >=0; j --) {
		if(! isInteger( s.charAt(j))) {
		leftMax ++;
		} else {
		break;
		}
		}
		for(int k=i+1; k < s.length(); k++) {
		if(! isInteger( s.charAt(k))) {
		rightMax ++;
		} else {
		break;
		}
		}
		total = leftMax + rightMax;
		if(globalMax < total) {
		globalMax = total;
		}
		}
		}
		return globalMax;
		}
	
		
}
