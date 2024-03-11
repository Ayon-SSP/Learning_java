package com.training.bankapp.model;

public class SavingAccount extends BankAccount {

	private static final double MIN_BAL=10000.00;
	public SavingAccount() {
	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	public SavingAccount(String accName, double balance) {
		super(accName, balance);
	}

	@Override
	public String withdraw(double amount) {
		final double diffBalance=this.getBalance()-amount;
		if(diffBalance>=MIN_BAL) {
			this.setBalance(diffBalance);
			return this.getAccNo()
					+"debited with"
					+amount
					+". Current balance is "
					+this.getBalance();
		}
		return "Insufficient balance";
	}

}
