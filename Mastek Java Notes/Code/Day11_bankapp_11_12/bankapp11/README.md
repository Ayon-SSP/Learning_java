## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Java Package
com.training.bankapp.model
1. BankAccount
2. IBankService
3. IWithdraw
4. IDeposit
5. SavingAccount



```java
package com.training.bankapp.model;
 
public interface IDeposit {
	String deposit(double amount);
}
 
package com.training.bankapp.model;
 
public interface IWithdraw {
 
	String withdraw(double amount);
}
 
package com.training.bankapp.model;
 
public interface IBankService extends IDeposit,IWithdraw {
 
}
 
inherited from the bank class
	@Override
	public String withdraw(double amount) {
		final double diffbalance=this.balance-amount;
		return null;
	}
 
Someone is waiting in the lobby 
package com.training.bankapp.util;
 
public class InsufficientBalanceException extends Exception {
 
	public InsufficientBalanceException(String message) {
		super(message);
	}
 
	
}
 

```