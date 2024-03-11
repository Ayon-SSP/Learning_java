package com.training.demo.model;

import java.time.LocalDate;

public class User {
	private String userName;
	private String email;
	private LocalDate registrationDate;
	{this.registrationDate=LocalDate.now();}
	public User() {
		super();
	}
	
	public User(String userName, String email, LocalDate registrationDate) {
		super();
		this.userName = userName;
		this.email = email;
		this.registrationDate = registrationDate;
	}
	public User(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", registrationDate=" + registrationDate + "]";
	}
	
	
	
}
