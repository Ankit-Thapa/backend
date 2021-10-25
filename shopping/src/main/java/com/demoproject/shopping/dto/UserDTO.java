package com.demoproject.shopping.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class UserDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private int mmobileNumber;
	private String email;
	private int numberOfLogin;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public int getMmobileNumber() {
		return mmobileNumber;
	}
	public void setMmobileNumber(int mmobileNumber) {
		this.mmobileNumber = mmobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumberOfLogin() {
		return numberOfLogin;
	}
	public void setNumberOfLogin(int numberOfLogin) {
		this.numberOfLogin = numberOfLogin;
	}
	
	
}
