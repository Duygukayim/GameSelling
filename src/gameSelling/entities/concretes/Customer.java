package gameSelling.entities.concretes;

import java.time.LocalDate;

import gameSelling.entities.abstracts.Entity;

public class Customer implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private LocalDate yearOfBirth;
	private String identityNumber;

	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, LocalDate yearOfBirth, String identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(LocalDate yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

}
