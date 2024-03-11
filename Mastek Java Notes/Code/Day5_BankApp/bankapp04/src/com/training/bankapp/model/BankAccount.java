package com.training.bankapp.model;

public class BankAccount {

	private int accNo;
	private String accName;
	private double balance;

	private static int counter;
	static {
		counter = 0;
	}
	{
		this.accNo = ++counter;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String accName, double balance) {
		super();
		this.accName = accName;
		this.balance = balance;
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

	public String withdraw(double amount) {

		final double diffBalance = this.balance - amount;
		if (diffBalance >= 0) {
			this.setBalance(diffBalance);
			return this.accNo + " debited with" + amount + ". Current blance is " + this.balance;
		}
		return "Insufficient Balance in account.";
	}

	public String deposit(double amount) {
		this.balance = this.balance + amount;
		return this.accNo + " credited with" + amount + ". Current blance is " + this.balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}

}
