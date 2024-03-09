package com.training.bankapp.model;

public class PayTmAccount {

	private int paytmAccNo;
	private BankAccount account;
	private static int counter=0;
	{this.paytmAccNo=++counter;}

	public PayTmAccount() {
		super();	
	}
	public PayTmAccount(int paytmAccNo, BankAccount account) {
		super();
		this.paytmAccNo = paytmAccNo;
		this.account = account;
	}
	
	public PayTmAccount(BankAccount account) {
		super();
		this.account = account;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	public int getPaytmAccNo() {
		return paytmAccNo;
	}
	
	/**
	 * 
	 * @param payee
	 * @param amount
	 * @return
	 */
	public String transferMoneyTo(BankAccount payee,double amount) {
		//1. from account amount will be deducted
		this.account.withdraw(amount);
		//2. amount will be added to transfer account
		payee.deposit(amount);
		String msg=amount+" istransfered to "+payee;
		return msg;
	}
	
}
