package strategies;

import entities.DeliveryPartner;
import entities.OrderRequest;
import interfaces.IDeliveryPartnerMatchingStrategy;
import managers.DeliveryPartnerManager;

public class RatingBasedDeliveryPartnerMatchingStrategy implements IDeliveryPartnerMatchingStrategy{

	@Override
	public DeliveryPartner getPartner(OrderRequest orderReq) {
		System.out.println("Obtaining delivery partner on basis of partner ratings...");
		return DeliveryPartnerManager.getInstance().getDeliveryPartner(0);
	}

}
