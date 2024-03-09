package com.training.bankapp.model;

public class SavingAccount extends BankAccount {

	private final static double MIN_BALANCE = 10000;

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
	public double withdraw(double amount) {
		double diffAmount=this.getBalance()-amount;
		if(diffAmount>=MIN_BALANCE) {
			this.setBalance(diffAmount);
		}else {
			System.out.println("Please try with another amount"
					+ "ensure minimum balance is maitained in account");
		}		
		
		return this.getBalance();
	}

	
}
