package com.training.demo;

import java.util.Iterator;
import java.util.Scanner;

import com.training.demo.model.BankAccount;
import com.training.demo.model.SalaryAccount;
import com.training.demo.model.SavingAccount;

// We will create 3 bankaccount object
// where we are asking details from the user using Scanner
public class Main {

	public static void main(String[] args) {
		//Using Array and For Loop 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter no. of Accounts to be created");
		int noAccounts = Integer.parseInt(scanner.nextLine());
		BankAccount[] accountsList = new BankAccount[noAccounts];

		for (int i = 0; i < accountsList.length; i++) {
			System.out.println("Please select type of account");
			System.out.println("\n1. SavingAccount");
			System.out.println("2. SallaryAccount");
			int accType = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter Acc Name");
			String accName = scanner.nextLine();
			System.out.println("Enter Opening balance");
			String s_balance = scanner.nextLine();

			BankAccount account = null;
			switch (accType) {
			case 1:
				account = new SavingAccount(accName, Double.parseDouble(s_balance));
				break;
			case 2:
				account = new SalaryAccount(accName, Double.parseDouble(s_balance));
				break;
			default:
				account = new BankAccount(accName, Double.parseDouble(s_balance));
			}
			accountsList[i] = account;
		}
		
		System.out.println("Display all the bankaccounts:");
		for(BankAccount account:accountsList) {
			System.out.println(account);
		}
		boolean loop=true;
		while(loop) {
			System.out.println("Enter your accNo");
			int accNo=Integer.parseInt(scanner.nextLine());
			System.out.println("Choose the transaction");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			int transaction=Integer.parseInt(scanner.nextLine());
			System.out.println("Enter the amount ");
			double amount=Double.parseDouble(scanner.nextLine());
			BankAccount account=null;
			for(BankAccount a:accountsList) {
				if(a.getAccNo()==accNo) {
					account=a;
					break;
				}
			}
			String msg="";
			switch(transaction) {
			case 1: 
				msg=account.deposit(amount);
				break;
			case 2:
				msg=account.withdraw(amount);
				break;
			default: 
				msg="Current balance is"+account.getBalance();
				break;
			}
			System.out.println(msg);
			System.out.println("Do you want to continue:y/n");
			if(scanner.nextLine().equalsIgnoreCase("n")) {
				loop=false;
			}			
		}
		
		scanner.close();
	}

}
