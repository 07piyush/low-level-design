package libraryManagementLLD.entities;

import libraryManagementLLD.datatypes.Person;
import libraryManagementLLD.enums.AccountStatus;

public class Account {

	private String id;
	private AccountStatus status;
	private Person person;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public AccountStatus getStatus() {
		return status;
	}
	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
