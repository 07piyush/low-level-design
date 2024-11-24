package entities;

import java.util.List;

public class Menu {

	private List<MenuItem> menu;

	public List<MenuItem> getMenu() {
		return menu;
	}

	public void setMenu(List<MenuItem> menu) {
		this.menu = menu;
	}
	
	public Menu addItem(MenuItem item) {
		//Used builder design to keep adding items to a menu.
		menu.add(item);
		return this;
	}
	
}
