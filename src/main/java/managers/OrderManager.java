package managers;

import java.util.HashMap;
import java.util.Map;

import entities.OrderRequest;
import interfaces.IDeliveryPartnerMatchingStrategy;

public class OrderManager {

	private static OrderManager manager;
	private Map<String, OrderRequest> orders;
	
	private OrderManager() {
		orders = new HashMap<>();
	}
	
	public static OrderManager getOrderManager() {
		if(null == manager) {
			synchronized(OrderManager.class) {
				if(null == manager)
					manager = new OrderManager();
			}
		}
		return manager;
	}
	
	public void placeOrder(OrderRequest request) {
		//do multiple task for this order.
		//1. notify restaurant manager.
		manageOrder(request.getOrderId());
		//2. notify deliveryPartnerManager
		maangeDeliver(request.getOrderId());
		//3. update customer.
	}
	
	private void maangeDeliver(String orderId) {
		OrderRequest orderRequest = orders.get(orderId);
		DeliveryPartnerManager deliveryManager = DeliveryPartnerManager.getInstance();
		StrategyManager strategyManager = StrategyManager.getInstance();
		IDeliveryPartnerMatchingStrategy strategy = strategyManager.getStrategy(orderRequest);
		
		//Notify delivery partner.
		
	}
	
	private void manageOrder(String orderId) {
		//notify restaurant for order.
		
	}
}
