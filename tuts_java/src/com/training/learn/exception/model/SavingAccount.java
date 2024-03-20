package com.training.learn.exception.model;

import com.training.learn.exception.util.InsufficientBalanceException;

public class SavingAccount extends BankAccount {

	private static final double MIN_BALANCE = 10000.00;

	public SavingAccount() {

	}

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);

	}

	@Override
	public String withdraw(double amount) throws InsufficientBalanceException {
		final double diffBalance=this.balance-amount;
		if(diffBalance>=MIN_BALANCE) {
			this.balance=diffBalance;
		}else {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		return this.accNo	
				+" debited with "+amount
				+". Current balance is "
				+this.balance;
	}

}
