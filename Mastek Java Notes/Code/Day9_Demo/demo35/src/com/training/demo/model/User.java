package com.training.demo.model;

import java.util.Objects;

public class User {

	private int id;
	private String userName;
	private String emailid;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String userName, String emailid) {
		super();
		this.id = id;
		this.userName = userName;
		this.emailid = emailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", emailid=" + emailid + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailid, id, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		
		return  this.id==other.id&&this.userName.equals(other.userName)&&this.emailid.equals(other.emailid);
	}
	
	
}
