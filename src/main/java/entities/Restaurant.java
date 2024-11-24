package entities;

public class Restaurant {

	private long id;
	private String name;
	private Location location;
	private int rating;
	private Menu menu;
	
	
	public Restaurant(long id, String name, Location location, int rating, Menu menu) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.menu = menu;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
}
