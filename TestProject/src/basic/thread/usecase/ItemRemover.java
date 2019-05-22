/**
 * 
 */
package basic.thread.usecase;

import java.util.List;
import java.util.Random;

/**
 * @author VINAY
 * 
 */
public class ItemRemover implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see basic.thread.usecase.IModifyItems#modify()
	 */
	public void modify() {

		ItemHandler itemHandler = ItemHandler.getInstance();
		if (itemHandler.getItemList().isEmpty()) {
			System.out.println("ItemRemover.............Empty");
			synchronized (itemHandler) {
				try {
					itemHandler.wait();
				} catch (InterruptedException ie) {
				}
			}
		} else {

			Random r = new Random();
			itemHandler.getItemList().remove(
					itemHandler.getItemList().get(
							r.nextInt(itemHandler.getItemList().size())));
		}
		
		System.out.println(Thread.currentThread().getName() + " : items : "
				+ itemHandler.getItemList());
	}

	public void run() {
		modify();
	}
}
