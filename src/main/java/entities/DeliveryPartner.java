package entities;

public class DeliveryPartner {

	private long partnerId;
	private String name;
	private int rating;
	
	public DeliveryPartner(long partnerId, String name, int rating) {
		super();
		this.partnerId = partnerId;
		this.name = name;
		this.rating = rating;
	}
	public long getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(long partnerId) {
		this.partnerId = partnerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
