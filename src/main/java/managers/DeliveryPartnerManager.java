package managers;

import java.util.LinkedHashMap;
import java.util.Map;

import entities.DeliveryPartner;

public class DeliveryPartnerManager {

	private static DeliveryPartnerManager manager;
	private Map<Long, DeliveryPartner> deliveryPartners;
	
	private DeliveryPartnerManager(){
		deliveryPartners = new LinkedHashMap<Long, DeliveryPartner>();
	}
	
	public static DeliveryPartnerManager getInstance() {
		if(null == manager) {
			synchronized (DeliveryPartnerManager.class) {
				if(null == manager) {
					manager = new DeliveryPartnerManager();
				}
			}
		}
		return manager;
	}
	
	public DeliveryPartner getDeliveryPartner(long id){
		return deliveryPartners.get(id);
	}
	
	public void addDeliveryPartner(DeliveryPartner partner) {
		deliveryPartners.put(partner.getPartnerId(), partner);
	}
}
