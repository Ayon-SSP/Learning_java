package com.training.bankapp;

import com.training.bankapp.model.BankAccount;
import com.training.bankapp.model.PayTmAccount;
import com.training.bankapp.model.SavingAccount;

public class Main {

	public static void main(String[] args) {
		final BankAccount account1=new SavingAccount("Amit",20000.00);
		final BankAccount account2=new SavingAccount("Amit",40000.00);
		final PayTmAccount payTmAccount=new PayTmAccount(account1);
		final String msg=payTmAccount.transferMoneyTo(account2, 10000);
		System.out.println(msg);
	}

}
