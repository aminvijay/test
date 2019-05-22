/**
 * 
 */
package basic.thread.usecase;

import java.util.List;

/**
 * @author VINAY
 * 
 */
public class ItemModifier implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see basic.thread.usecase.IModifyItems#modify()
	 */
	public void modify() {
		ItemHandler itemHandler = ItemHandler.getInstance();
		if (itemHandler.getItemList().isEmpty()) {
			System.out.println("ItemModifier.............Empty");
			synchronized (itemHandler) {
				try {
					itemHandler.wait();
				} catch (InterruptedException ie) {
				}
			}
		} else {

			System.out.println("ItemModifier.............Else");
			for (Item item : itemHandler.getItemList()) {
				System.out.println("ItemModifier.............For");
				item.setName("Modify - " + item.getName());
				item.setDescription("Modify by " + item.getDescription());
			}
		}

		System.out.println(Thread.currentThread().getName() + " : items : "
				+ itemHandler.getItemList());
	}

	public void run() {
		System.out.println("ItemModifier.............");
		modify();
	}
}
