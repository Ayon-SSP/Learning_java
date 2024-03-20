package com.training.demo.model;

public class User implements Comparable<User> {

	private int userId;
	private String userName;
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public User(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}


	public User(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}


	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
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

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		if (userId != other.userId) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
	}


	@Override
	public int compareTo(User o) {
	
		return this.userId-o.userId;
	}

}
