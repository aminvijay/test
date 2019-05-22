package test;


public class BubbleSortExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {25,45,12,18,27};
		
		for(int i:num){
			//System.out.println("i = " + i + " val " + num[i] );
			//System.out.println(i);
		}
		//System.out.println("after sorting");
		
		/*Arrays.sort(num);
		for(int i:num){
			//System.out.println("i = " + i + " val " + num[i] );
			System.out.println(i);
		}*/
		
		int tmpVal;
		boolean flag = true;
		while(flag){
			flag = false;
			for(int i = 0; i<num.length-1; i++){
				if(num[i] > num[i+1]){
					tmpVal = num[i];
					num[i] = num[i+1];
					num[i+1] = tmpVal;
					flag = true;				
				}
			}			
		}
		
		for(int i:num){
			//System.out.println("i = " + i + " val " + num[i] );
			//System.out.println(i);
		}
		
		String s1 = "1";
		String s2 = "1";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		
		
	}

}
