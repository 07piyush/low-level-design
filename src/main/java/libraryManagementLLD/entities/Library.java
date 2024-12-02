package libraryManagementLLD.entities;

import java.util.Map;

import libraryManagementLLD.datatypes.Address;

public class Library {

	private String id;
	private Address address;
	private Map<String, Librarian> librarians;
	private Map<String, BookItem> books;
	private Catalog catalog;

	public void addLibrarian(Librarian librarian) {
		librarians.put(librarian.getId(), librarian);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public void setLibrarians(Map<String, Librarian> librarians) {
		this.librarians = librarians;
	}

	public Map<String, BookItem> getBooks() {
		return books;
	}

	public void setBooks(Map<String, BookItem> books) {
		this.books = books;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

}
