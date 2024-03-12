package com.training.bankapp;

import com.training.bankapp.model.IBankService;
import com.training.bankapp.model.SavingAccount;
import com.training.bankapp.util.InsufficientBalanceException;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main starts");	
		
		IBankService account = new SavingAccount(1, "Ajinkya", 12000.00);
		try {
			System.out.println(10/0);
			System.out.println("Line 12:" + account.withdraw(2000));
			// System.out.println("Line 13:" + account.withdraw(2000));
			
		} catch (InsufficientBalanceException e) {
			System.out.println("Line 15:");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("Line 18:");
			e.printStackTrace();
		} 
		catch (Exception e) {
			System.out.println("Line 22:");
			e.printStackTrace();
		}
		System.out.println("Main ends");
	}

}
