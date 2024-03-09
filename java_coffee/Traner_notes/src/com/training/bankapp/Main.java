package com.training.bankapp;

import com.training.bankapp.model.BankAccount;
import com.training.bankapp.model.PayTmAccount;
// import com.training.bankapp.model.SavingAccount;

/*
 * when class is invoked static block is called first and then constructor is called.
 * if object is created then constructor is called.
 * static block is called only once when class is loaded.
 */

public class Main {
    int numMain = 10;
    static int numStaMain = 11;

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Foo", 1);
        BankAccount account2 = new BankAccount("Bar", 2);
        BankAccount account3 = new BankAccount("owe", 3);
        // BankAccount account2 = new BankAccount(1, "John", 1000);

        BankAccount[] accounts = { account1, account2, account3 };
        for (BankAccount account : accounts) {
            System.out.println(account);
        }

        // System.out.println(account1.getCounter());
        System.out.println(BankAccount.getCounter());


        // System.out.println(numMain);  // Error: non-static variable numMain cannot be referenced from a static context
        System.out.println(numStaMain); 
        /*
            * static keyword is applicable to variable, mehods and nested classes.
            * static function can work with static variable/datamember only.
            * if want to access non-static variable in static function, then we need to create object of class and then access the variable.
            * we can get static variable in static/non-static function. using obj.variablename or classname.variablename or directly variablename. 
        */

		final PayTmAccount payTmAccount=new PayTmAccount(account1);
		final String msg=payTmAccount.transferMoneyTo(account2, 10000);
		System.out.println(msg);
    }

}
