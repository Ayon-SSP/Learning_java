package com.training.bankapp.util;
 
import java.util.ArrayList;
import java.util.List;
 
import com.training.bankapp.model.BankAccount;
 
public class BankAccountList implements IList<BankAccount> {
 
	static final List<BankAccount> accounts = new ArrayList<>();
 
	public BankAccountList() {
		super();
 
	}
 
	@Override
	public BankAccount add(BankAccount t) {
		if (accounts.contains(t)) {
			return null;
		}
		accounts.add(t);
		return t;
	}
 
	@Override
	public BankAccount findById(int id) {
		for (BankAccount account : accounts) {
			if (account.getAccNo() == id) {
				return account;
			}
		}
		return null;
	}
 
	@Override
	public List<BankAccount> findAll() {
		
		return accounts;
	}
 
	@Override
	public boolean update(int id, BankAccount t) {
		for (BankAccount account : accounts) {
			if (account.getAccNo() == id) {
				account.setAccName(t.getAccName());
				account.setBalance(t.getBalance());
				return true;
			}
		}
		return false;
	}
 
	@Override
	public boolean deete(int id) {
		for(BankAccount account:accounts) {
			if(account.getAccNo()==id) {
				accounts.remove(account);
				return true;
			}
		}
		return false;
	}
 
}