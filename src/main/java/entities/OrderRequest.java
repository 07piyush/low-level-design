package entities;

import java.util.Map;

public class OrderRequest {

	private User orderedBy;
	private Restaurant restaurant;
	private Map<MenuItem, Integer> orderDetails;
	private Location dropLocation;
	private Location pickupLocation;
	
	
}
