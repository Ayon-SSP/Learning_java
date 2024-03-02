package com.training.bankapp.model;

public class BankAccount {
    // Fields
    private int accNo;
    private String accName;
    private double balance;
    private static int counter = 0;

    // Constructors
    public BankAccount() {
        super();
    }
    public BankAccount(String accName, double balance) {
        super();
        this.accNo = ++counter;
        this.accName = accName;
        this.balance = balance;
    }
    public BankAccount(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    // static block are called only once when class is loaded
    static {
        System.out.println("Static block is called");
        counter = 100;
    }
    
    // Methods
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
    }

}
