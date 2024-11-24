package managers;

import entities.OrderRequest;
import interfaces.IDeliveryPartnerMatchingStrategy;
import strategies.RatingBasedDeliveryPartnerMatchingStrategy;

public class StrategyManager {

	private static StrategyManager manager;
	
	public static StrategyManager getInstance() {
		if(null == manager) {
			synchronized (StrategyManager.class) {
				if(null == manager) {
					manager = new StrategyManager();
				}
			}
		}
		return manager;
	}
	
	public IDeliveryPartnerMatchingStrategy getStrategy(OrderRequest request) {
		//based on some parameters of request, select a delivery partner choosing strategy.
		//for now just return location based.
		return new RatingBasedDeliveryPartnerMatchingStrategy();
	}
}
