package com.training.bankapp;

import com.training.bankapp.model.BankAccount;
import com.training.bankapp.model.SalaryAccount;
import com.training.bankapp.model.SavingAccount;

public class Main {

	public static void main(String[] args) {
		BankAccount account=null;
		//account pointing to object 1
		account=new SavingAccount("Amit", 20000.00);
		System.out.println(((SavingAccount)account).withdraw(10000));
		System.out.println(((SavingAccount)account).withdraw(10000));//try with another amount
		System.out.println(account.deposit(100000.00));
		//account pointing object2 
		account=new SalaryAccount("Ajit", 10000.00);
		System.out.println(((SalaryAccount)account).withdraw(10000));
		System.out.println(((SalaryAccount)account).withdraw(10000));//insuffient
		System.out.println(account.deposit(100000.00));
		
	}

}
