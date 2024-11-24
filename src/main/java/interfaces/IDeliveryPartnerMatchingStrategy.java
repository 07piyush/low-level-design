package interfaces;

import entities.DeliveryPartner;
import entities.OrderRequest;

public interface IDeliveryPartnerMatchingStrategy {

	DeliveryPartner getPartner(OrderRequest orderReq);
	
}
