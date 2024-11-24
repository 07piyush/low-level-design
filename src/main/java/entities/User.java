package entities;

public class User {

	private long userId;
	private String name;
	private String address;
	private Location location;
	private int rating;
	
	
	public User(long userId, String name, String address, Location location, int rating) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
		this.location = location;
		this.rating = rating;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
