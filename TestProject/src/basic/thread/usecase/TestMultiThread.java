/**
 * 
 */
package basic.thread.usecase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author VINAY
 * 
 */
public class TestMultiThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread one = new Thread(new ItemAdder());
		Thread two = new Thread(new ItemModifier());
		/*Thread three = new Thread(new ItemReModify());
		Thread four = new Thread(new ItemRemover());*/

		one.start();
		two.start();
		/*three.start();
		four.start();*/

	}

}
