package com.demoproject.shopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String firstName;
	String lastName;
	String mobileNumber;
	String email;
	String password;
	int numberOfLogin;
	String userType;
	Byte[] profilePicture;
	
	
	
	
	public User(String firstName, String lastName, String mobileNumber, String email, String password, int numberOfLogin,
			String userType, Byte[] profilePicture) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.numberOfLogin = numberOfLogin;
		this.userType = userType;
		this.profilePicture = profilePicture;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumberOfLogin() {
		return numberOfLogin;
	}
	public void setNumberOfLogin(int numberOfLogin) {
		this.numberOfLogin = numberOfLogin;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Byte[] getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(Byte[] profilePicture) {
		this.profilePicture = profilePicture;
	}
}
