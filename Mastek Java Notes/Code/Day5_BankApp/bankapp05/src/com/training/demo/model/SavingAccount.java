package com.training.demo.model;

public class SavingAccount extends BankAccount {

	private static final double MIN_BALANCE = 10000;

	public SavingAccount() {
		super();

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
		if(diffBalance>=MIN_BALANCE) {
			this.setBalance(diffBalance);
			return this.getAccNo()+" debited with "
			 +amount+".Current balnace is :"
			 +this.getBalance();
		}
		return "Insufficient balance in account";
	}
	
	
}
