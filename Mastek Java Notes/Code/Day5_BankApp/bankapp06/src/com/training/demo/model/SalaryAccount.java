package com.training.demo.model;

public class SalaryAccount extends BankAccount {

	public SalaryAccount() {
		super();

	}

	public SalaryAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);

	}

	public SalaryAccount(String accName, double balance) {
		super(accName, balance);

	}

	@Override
	public String withdraw(double amount) {
		final double diffBalance=this.getBalance()-amount;
		if(diffBalance>=0) {
			this.setBalance(diffBalance);
			return this.getAccNo()
					+" is debited with "
					+amount
					+". Current balance is "
					+this.getBalance();
		}
		return "Insufficient Balance";
	}

	
}
