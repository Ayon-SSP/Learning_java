package com.training.bankapp;

import com.training.bankapp.model.BankAccount;

// init blocks in java 
// a. static block=> it when class is loaded 
//				  => initialise static variable	
// b. non static => jab jab object created
//				 => initialise object data member
public class Main {

	public static void main(String[] args) {
			
		BankAccount account1=new BankAccount();
		BankAccount account2=new BankAccount("Amit",123456.00);
//		BankAccount account3=new BankAccount(1,"Ajit",123456.00);
		BankAccount account3=new BankAccount("Ajit",123456.00);
		BankAccount account4=new BankAccount("Ankit",123456.00);
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		System.out.println(account4);

	}

}
