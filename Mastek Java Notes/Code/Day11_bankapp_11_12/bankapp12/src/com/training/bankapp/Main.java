package com.training.bankapp;

import com.training.bankapp.model.IBankService;
import com.training.bankapp.model.SavingAccount;
import com.training.bankapp.util.InsufficientBalanceException;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main starts");

		IBankService account = new SavingAccount(1, "Ajinkya", 12000.00);

		try {
			System.out.println("Line 12:" + account.withdraw(2000));
			System.out.println("Line 13:" + account.withdraw(2000));
		} catch (InsufficientBalanceException e) {			
			e.printStackTrace();
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			System.out.println("Finally called ");
		} 

		System.out.println("Main ends");
	}
}
