package com.training.bankapp;

import com.training.bankapp.model.BankAccount;

public class Main {

	public static void main(String[] args) {
		//insert into bankaccount values(1,'Amit',20000);
		BankAccount account1=new BankAccount(1,"Amit",20000.00);
		System.out.println(account1);
	}
}
