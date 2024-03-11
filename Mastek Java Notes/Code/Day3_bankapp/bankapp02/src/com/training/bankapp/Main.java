package com.training.bankapp;
import com.training.bankapp.model.BankAccount;
public class Main {
	public static void main(String[] args) {
		//When ever you are creating an object of account type 
		//ensure to call BankAccount(accName,balance)
		//because we want to assign accNo automatically to the  account
		System.out.println("Before creating any Account: "+BankAccount.getCounter());
		BankAccount account1=new BankAccount("Amit",234567.00);
		System.out.println(account1);
		System.out.println("After creating accoutn 1: "+BankAccount.getCounter());		
		BankAccount account2=new BankAccount("Ajit",234567.00);
		System.out.println(account2);		
		System.out.println("After creating accoutn 2: "+BankAccount.getCounter());
		//value of counter 
		System.out.println(account1.getCounter());
		System.out.println(account2.getCounter());
		BankAccount account3=new BankAccount("Ankit",234567.00);
		System.out.println(account3);
		BankAccount account4=new BankAccount("Sumit",234567.00);
		System.out.println(account4);
		System.out.println("After creating accoutn 4: "+BankAccount.getCounter());
	}
}
