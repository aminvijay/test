import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int[] list = new int[10];
	    for (int i=0; i<10; i++){
	        int n = (int)(Math.random()*100000 + 1);
	        list[i] = n;
	        System.out.println(list[i] + " ");
	    }
	    /*List<Integer> li = Arrays.asList(list);
	    System.out.println(" li = " + li);
	    Collections.sort(li);
	    System.out.println(" sorted li = " + li + " last no " + li.get(li.size()-1));*/

	}
	
	public static int[] getInts() {
		
		int[] list = new int[10];
	    for (int i=0; i<10; i++){
	        int n = (int)(Math.random()*100000 + 1);
	        list[i] = n;
	        System.out.println(list[i] + " ");
	    }
	    
	    return list;
	}

}
