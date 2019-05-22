/**
 * 
 */
package basic.thread.usecase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vputtaiah
 * 
 */
public class ItemHandler {
	private static ItemHandler itemHandler = new ItemHandler();
	private List<Item> itemList;

	private ItemHandler() {
		itemList = new ArrayList<Item>();
	}

	public static ItemHandler getInstance() {
		return itemHandler;
	}

	public synchronized void addItem(Item item) {
		itemList.add(item);
	}

	public synchronized void removeItem(Item item) {
		itemList.remove(item);
	}

	public List<Item> getItemList() {
		return itemList;
	}
}
