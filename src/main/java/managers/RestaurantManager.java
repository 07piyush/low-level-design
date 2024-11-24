package managers;

import java.util.LinkedHashMap;
import java.util.Map;

import entities.Restaurant;

public class RestaurantManager {

	private static RestaurantManager manager;
	private Map<Long, Restaurant> restaurants;

	private RestaurantManager() {
		restaurants = new LinkedHashMap<Long, Restaurant>();
	}

	public RestaurantManager getRestaurantManager() {
		if(null == manager) {
			synchronized (RestaurantManager.class) {
				if(null == manager) {
					manager = new RestaurantManager();
				}
			} 
		}
		return manager;
	}

	public void addRestaurant(Restaurant newRestaurant) {
		restaurants.put(newRestaurant.getId(), newRestaurant);
	}
}
