package com.training.bankapp.model;

public class Main {

	public static void main(String[] args) {
		IBankService service=null;
		System.out.println("Saving Account operations:");
		service=new SavingAccount("Amit", 199999.00);
		System.out.println(service.deposit(10000.00));
		System.out.println(service.withdraw(10000.00));
		System.out.println(service.withdraw(199999.00));
		System.out.println("Salary Account operations:");
		service=new SalaryAccount("Amit", 199999.00);
		System.out.println(service.deposit(10000.00));
		System.out.println(service.withdraw(10000.00));
		System.out.println(service.withdraw(299999.00));
	}

}
