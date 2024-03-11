package com.training.bankapp;

import com.training.bankapp.model.BankAccount;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("Amit", 12345.789);
		
		System.out.println(account);
		
		System.out.println("Depositing 10000.00 ");
		String msg = account.deposit(10000.00);
		System.out.println("After depositing: " + msg);
		
		System.out.println("Withdrawing 10000.00 - 1st time ");
		msg = account.withdraw(10000.00);
		System.out.println("After Withdrawing: " + msg);
		
		System.out.println("Withdrawing 10000.00 - 2nd time ");
		msg = account.withdraw(10000.00);
		System.out.println("After Withdrawing: " + msg);
		
		System.out.println("Withdrawing 10000.00 - 3rd time ");
		msg = account.withdraw(10000.00);
		System.out.println("After Withdrawing: " + msg);
		
	}

}
