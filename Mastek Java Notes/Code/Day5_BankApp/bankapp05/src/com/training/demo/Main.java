package com.training.demo;

import com.training.demo.model.BankAccount;
import com.training.demo.model.SavingAccount;

public class Main {

	public static void main(String[] args) {
		BankAccount account=new SavingAccount("Amit",10000.00);
		System.out.println("Bank Account Details");
		System.out.println(account);
		
		System.out.println("Withdraw 10000.00");
		String msg=account.withdraw(10000.00);
		System.out.println(msg);
		

	}

}
