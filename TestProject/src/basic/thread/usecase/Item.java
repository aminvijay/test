/**
 * 
 */
package basic.thread.usecase;

/**
 * @author VINAY
 * 
 */
public class Item {

	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}

	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String description;
	private String name;
}
