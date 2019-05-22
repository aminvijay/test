/**
 * 
 */
package basic.thread.usecase;

import java.util.List;

/**
 * @author VINAY
 * 
 */
public class ItemAdder implements Runnable {

	public void run() {
		System.out.println("ItemAdder.............");
		Item item = null;
		ItemHandler itemHandler = ItemHandler.getInstance();
		for (int i = 0; i < 10; i++) {
			System.out.println("ItemAdder.............Invoke");
			item = new Item("JustCreated" + i, "Item Just Created - " + i);
			synchronized (itemHandler) {
				itemHandler.addItem(item);
				itemHandler.notifyAll();
			}
		}
	}
}