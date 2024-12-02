package libraryManagementLLD.datatypes;

public class Person {

	private String Name;
	private long dateOfBirth;
	private String phoneNumber;
	private Address address;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(long dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
