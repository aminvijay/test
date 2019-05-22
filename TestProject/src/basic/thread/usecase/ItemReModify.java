/**
 * 
 */
package basic.thread.usecase;

import java.util.Collections;
import java.util.List;

/**
 * @author VINAY
 * 
 */
public class ItemReModify implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see basic.thread.usecase.IModifyItems#modify()
	 */
	public void modify() {
		ItemHandler itemHandler = ItemHandler.getInstance();
		Collections.reverse(itemHandler.getItemList());
		
		if (itemHandler.getItemList().isEmpty()) {
			System.out.println("ItemReModify.............Empty");
			synchronized (itemHandler) {
				try {
					itemHandler.wait();
				} catch (InterruptedException ie) {
				}
			}
		} else {

			System.out.println("ItemReModify.............Else");
			for (Item item : itemHandler.getItemList()) {
				System.out.println("ItemReModify.............For");
				item.setName("Modify - " + item.getName());
				item.setDescription("Modify by " + item.getDescription());
			}
		}
		System.out.println(Thread.currentThread().getName() + " : items : "+itemHandler.getItemList());
	}

	public void run() {
		modify();
	}
}
