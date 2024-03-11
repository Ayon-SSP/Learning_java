package com.training.bankapp.model;

public class BankAccount {

		private int accNo;
		private String accName;
		private double balance;
		
		public static int counter;
		//non static block initializing block
		{
			System.out.println("non static init block");
			this.accNo=++counter;
			System.out.println("New account number:"+this.accNo+" for "+this.accName);
		}
		static {
			System.out.println("static init block");
			counter=0;
		}
		
		public BankAccount() {
			super();
			// TODO Auto-generated constructor stub
		}
		public BankAccount(String accName, double balance) {
			super();
			this.accName = accName;
			this.balance = balance;
		}
		public BankAccount(int accNo, String accName, double balance) {
			super();
			this.accNo = accNo;
			this.accName = accName;
			this.balance = balance;
		}
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
