package libraryManagementLLD.entities;

import libraryManagementLLD.enums.BookStatus;

public class BookItem extends Book{

	private String id;
	private double price;
	private long dateOfPurchase;
	private String barcode;
	private long dateOfPublication;
	private String bookId;
	private Rack placeAt;
	private BookStatus status;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(long dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public long getDateOfPublication() {
		return dateOfPublication;
	}
	public void setDateOfPublication(long dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public Rack getPlaceAt() {
		return placeAt;
	}
	public void setPlaceAt(Rack placeAt) {
		this.placeAt = placeAt;
	}
	public BookStatus getStatus() {
		return status;
	}
	public void setStatus(BookStatus status) {
		this.status = status;
	}
	
}
