package strategies;

import entities.DeliveryPartner;
import entities.OrderRequest;
import interfaces.IDeliveryPartnerMatchingStrategy;
import managers.DeliveryPartnerManager;

public class LocationBasedDeliveryPartnerMatchingStrategy implements IDeliveryPartnerMatchingStrategy{

	@Override
	public DeliveryPartner getPartner(OrderRequest orderReq) {
		System.out.println("Obtaining DeliveryPartner on basis of time...");
		return DeliveryPartnerManager.getInstance().getDeliveryPartner(1);
	}

}
