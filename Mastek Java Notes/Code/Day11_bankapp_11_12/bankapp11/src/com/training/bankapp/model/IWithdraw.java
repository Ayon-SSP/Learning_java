package com.training.bankapp.model;

import com.training.bankapp.util.InsufficientBalanceException;

public interface IWithdraw {

	String withdraw(double amount) throws InsufficientBalanceException;
}
