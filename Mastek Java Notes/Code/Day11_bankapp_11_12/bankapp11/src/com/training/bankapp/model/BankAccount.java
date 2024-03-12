package com.training.bankapp.model;

public abstract class BankAccount implements IBankService {

	protected int accNo;
	protected String accName;
	protected double balance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNo;
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
		BankAccount other = (BankAccount) obj;
		if (accNo != other.accNo) {
			return false;
		}
		return true;
	}
	@Override
	public String deposit(double amount) {
		this.balance=this.balance+amount;
		return amount +" credited to "
				+this.accNo+" current balance is "
		+this.balance;
		
	}
	

	
}
