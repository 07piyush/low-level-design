package launcher;

import java.util.HashMap;
import java.util.Map;

import entities.DeliveryPartner;
import entities.Location;
import entities.Menu;
import entities.MenuItem;
import entities.OrderRequest;
import entities.Restaurant;
import entities.User;
import managers.DeliveryPartnerManager;
import managers.OrderManager;
import managers.RestaurantManager;
import managers.UserManager;

public class start {

	public static void main(String[] args) {
		//1. create some users.
		
		User u1 = new User(0, "sam", "street 1 abc", new Location(10.10, 20.20), 5);
		User u2 = new User(1, "rick", "street 2 boulevard", new Location(50.10, 80.20), 4);
		
		UserManager.getInstance().addUser(u1);
		UserManager.getInstance().addUser(u2);
		//2. create some restaurants and their menu.
		Menu caMenu = new Menu();
		Menu macsMenu = new Menu();
		
		//3. create some menueItems
		MenuItem caBurger = new MenuItem(0, "caBurger", 225.25);
		MenuItem caPizza = new MenuItem(0, "caPizza", 425.35);
		MenuItem caFrenchFries = new MenuItem(0, "caFrenchFries", 95.95);
		
		MenuItem macsBurger = new MenuItem(0, "macsBurger", 325.25);
		MenuItem macsPizza = new MenuItem(0, "macsPizza", 725.35);
		MenuItem macsFrenchFries = new MenuItem(0, "macsFrenchFries", 225.95);
		
		caMenu.addItem(caBurger);
		caMenu.addItem(caFrenchFries);
		caMenu.addItem(caPizza);
		
		macsMenu.addItem(macsFrenchFries);
		macsMenu.addItem(macsPizza);
		macsMenu.addItem(macsBurger);
		
		//each restaurant 'has-a' menu. Must be a composition, as individual restaurant may have varying prices and available
		//menu items. hence unregister the menu when restaurant in unregistered.
		Restaurant chefsAlcove = new Restaurant(0, "chef's alcove", new Location(77.70, 80.20), 5, caMenu);
		Restaurant macs = new Restaurant(0, "macs pizza place", new Location(47.70, 80.20), 5, macsMenu);
		
		
		//4. create some delivery partners
		DeliveryPartner sumit = new DeliveryPartner(0, "Sumit s", 5);
		DeliveryPartner vijay = new DeliveryPartner(1, "vijay e", 4);
		
		DeliveryPartnerManager deliveryManager = DeliveryPartnerManager.getInstance();
		deliveryManager.addDeliveryPartner(vijay);
		deliveryManager.addDeliveryPartner(sumit);
		
		//5. Register the restaurants.
		RestaurantManager restaurantManager = RestaurantManager.getRestaurantManager();
		restaurantManager.addRestaurant(macs);
		restaurantManager.addRestaurant(chefsAlcove);
		
		//6. create an order request.
		OrderRequest order = new OrderRequest();
		Map<MenuItem, Integer> orderDetails = new HashMap<>();
		orderDetails.put(macsFrenchFries, 2);
		orderDetails.put(macsBurger, 2);
		orderDetails.put(macsPizza, 1);
		
		order.setOrderDetails(orderDetails);
		order.setDropLocation(u1.getLocation());
		order.setOrderedBy(u1);
		order.setRestaurant(macs);
		
		
		OrderManager ordermanager = OrderManager.getOrderManager();
		ordermanager.placeOrder(order);
	}

}
