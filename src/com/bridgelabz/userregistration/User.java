package com.bridgelabz.userregistration;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String password;

	
	public User() {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setMobileNumber(mobileNumber);
		this.setPassword(password);
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}