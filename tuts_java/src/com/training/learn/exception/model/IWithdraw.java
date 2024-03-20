package com.training.learn.exception.model;

import com.training.learn.exception.util.InsufficientBalanceException;

public interface IWithdraw {

	String withdraw(double amount) throws InsufficientBalanceException;
}
