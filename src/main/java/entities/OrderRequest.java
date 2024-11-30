package entities;

import java.util.Map;

public class OrderRequest {

	private String orderId;
	private User orderedBy;
	private Restaurant restaurant;
	private Map<MenuItem, Integer> orderDetails;
	private Location dropLocation;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public User getOrderedBy() {
		return orderedBy;
	}
	public void setOrderedBy(User orderedBy) {
		this.orderedBy = orderedBy;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Map<MenuItem, Integer> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(Map<MenuItem, Integer> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Location getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(Location dropLocation) {
		this.dropLocation = dropLocation;
	}
		
}
