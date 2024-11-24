package launcher;

import entities.Location;
import entities.Menu;
import entities.MenuItem;
import entities.Restaurant;
import entities.User;
import managers.UserManager;

public class start {

	public static void main(String[] args) {
		//1. create some users.
		
		User u1 = new User(0, "sam", "street 1 abc", new Location(10.10, 20.20), 5);
		User u2 = new User(1, "rick", "street 2 boulevard", new Location(50.10, 80.20), 4);
		
		UserManager.getInstance().addUser(u1);
		UserManager.getInstance().addUser(u2);
		//2. create some restaurants
		Menu caMenu = new Menu();
		MenuItem caBurger = new MenuItem(0, "caBurger", 225.25);
		MenuItem caPizza = new MenuItem(0, "caPizza", 425.35);
		MenuItem caFrenchFries = new MenuItem(0, "caFrenchFries", 95.95);
		
		caMenu.addItem(caBurger);
		caMenu.addItem(caFrenchFries);
		caMenu.addItem(caPizza);
		
		Restaurant r1 = new Restaurant(0, "chef's alcove", new Location(77.70, 80.20), 5, caMenu);
		
		
		//3. create some menueItems
		
		//4. create some delivery partners
		
		//5. 

	}

}
