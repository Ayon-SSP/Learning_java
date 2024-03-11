package com.training.demo.model;

public class Contact {

	//field -: they are data of the object
	private int id;
	private String name;
	private String phoneNo;
	private String email;
	
	public Contact() {
	}
	//this key word is used for current object for which we are calling the
	//constructor
	public Contact(int id, String name, String phoneNo, String email) {
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
        return this.getId()+", "+this.getName()+", "+this.getEmail()+", "+this.getPhoneNo();
    }
}
