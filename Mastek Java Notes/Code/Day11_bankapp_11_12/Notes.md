

Must Read: https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html

[11:11 AM] Dhanashree Jawle
Discuss and come up with the solutions where you have implmented 
inteface
abstract class
concrete class
Custom exception
Handling exception 
 
[11:11 AM] Dhanashree Jawle
for your project.



```java

[11:55 AM] Dhanashree Jawle
package com.training.bankapp.util;
 
import java.util.List;
 
public interface IList<T> {
	// CRUD
	// CREATE
	T add(T t);
 
	// RETRIVE - Based on unique id
	T findById(int id);
 
	// RETRIVE - All objects
	List<T> findAll();
 
	// UPDATE
	boolean update(int id, T t);
 
	// DELETE
	boolean delete(int id);
 
}
 
[11:55 AM] Dhanashree Jawle
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
//		if (accounts.contains(t)) {
//			return null;
//		}else {
//		accounts.add(t);
//		return t;
//		}
		if(!accounts.contains(t)) {
			accounts.add(t);
			return t;
		}
		return null;
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
	public boolean delete(int id) {
		for(BankAccount account:accounts) {
			if(account.getAccNo()==id) {
				accounts.remove(account);
				return true;
			}
		}
		return false;
	}
 
}
 
[11:55 AM] Dhanashree Jawle
package com.training.bankapp;
 
import com.training.bankapp.model.BankAccount;
import com.training.bankapp.model.SavingAccount;
import com.training.bankapp.util.BankAccountList;
 
public class Main {
 
	public static void main(String[] args) {
		System.out.println("Main starts");
		BankAccountList bankAccountList=new BankAccountList();		
		System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
		System.out.println("Create Bank Accounts ");
		bankAccountList.add(new SavingAccount(1,"Amit",1000000.00));
		bankAccountList.add(new SavingAccount(2,"Ajit",1000000.00));
		bankAccountList.add(new SavingAccount(3,"Sumit",1000000.00));
		bankAccountList.add(new SavingAccount(3,"Sumit",1000000.00));
		System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
		System.out.println("Lets check bankaccount list ");
		for(BankAccount a:bankAccountList.findAll()) {
			System.out.println(a);
		}
		System.out.println("Find the details of account using accNo:");
		BankAccount account=bankAccountList.findById(3);
		System.out.println(account);
		System.out.println("Lets do the deposit and withdraw operations");
		account.withdraw(99999);
		System.out.println("Called account.withdraw(99999)");
		System.out.println("After withdraw"+account);
		System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
		System.out.println("Lets check bankaccount list ");
		for(BankAccount a:bankAccountList.findAll()) {
			System.out.println(a);
		}
		System.out.println("Lets delete account ");
		bankAccountList.delete(3);
		System.out.println("Lets check bankaccount list ");
		for(BankAccount a:bankAccountList.findAll()) {
			System.out.println(a);
		}
		
		System.out.println("Main ends");
	}
 
}
 
[11:56 AM] Dhanashree Jawle
package com.training.bankapp;
 
import com.training.bankapp.model.BankAccount;
import com.training.bankapp.model.SavingAccount;
import com.training.bankapp.util.BankAccountList;
import com.training.bankapp.util.InsufficientBalanceException;
 
public class Main {
 
	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			BankAccountList bankAccountList=new BankAccountList();		
			System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
			System.out.println("Create Bank Accounts ");
			bankAccountList.add(new SavingAccount(1,"Amit",1000000.00));
			bankAccountList.add(new SavingAccount(2,"Ajit",1000000.00));
			bankAccountList.add(new SavingAccount(3,"Sumit",1000000.00));
			bankAccountList.add(new SavingAccount(3,"Sumit",1000000.00));
			System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
			System.out.println("Lets check bankaccount list ");
			for(BankAccount a:bankAccountList.findAll()) {
				System.out.println(a);
			}
			System.out.println("Find the details of account using accNo:");
			BankAccount account=bankAccountList.findById(3);
			System.out.println(account);
			System.out.println("Lets do the deposit and withdraw operations");
			account.withdraw(99999);
			System.out.println("Called account.withdraw(99999)");
			System.out.println("After withdraw"+account);
			System.out.println("Number of accounts:  "+bankAccountList.findAll().size());
			System.out.println("Lets check bankaccount list ");
			for(BankAccount a:bankAccountList.findAll()) {
				System.out.println(a);
			}
			System.out.println("Lets delete account ");
			bankAccountList.delete(3);
			System.out.println("Lets check bankaccount list ");
			for(BankAccount a:bankAccountList.findAll()) {
				System.out.println(a);
			}
		} catch (InsufficientBalanceException  e) {
			e.printStackTrace();
		}
		
		System.out.println("Main ends");
	}
 
}
 
package com.training.demo.model;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
 
import com.training.demo.util.People;
 
public class Main {
 
	public static void main(String[] args) {
		People people=new People();
		Set<Person> peopleSet=people.findAll();
		peopleSet.add(new Person(1, "Amit", 17));
		peopleSet.add(new Person(2, "Ajit", 17));
		peopleSet.add(new Person(3, "Ajit", 17));
		peopleSet.add(new Person(4, "Ajit", 17));
		peopleSet.add(new Person(5, "Ajit", 17));
		peopleSet.add(new Person(6, "Ajit", 17));
		peopleSet.add(new Person(7, "Ajit", 17));
		peopleSet.add(new Person(8, "Ajit", 17));
		peopleSet.add(new Person(9, "Ajit", 17));
		peopleSet.add(new Person(10, "Ajit", 17));
		peopleSet.add(new Person(11, "Ajit", 18));
		peopleSet.add(new Person(12, "Ajit", 18));
		peopleSet.add(new Person(11, "Ajit", 19));
		peopleSet.add(new Person(12, "Ajit", 19));
		peopleSet.add(new Person(13, "Ajit", 20));
		peopleSet.add(new Person(14, "Ajit", 20));
		peopleSet.add(new Person(15, "Ajit", 20));
		peopleSet.add(new Person(16, "Ajit", 20));
		peopleSet.add(new Person(17, "Ajit", 20));
		peopleSet.add(new Person(18, "Ajit", 20));
		peopleSet.add(new Person(19, "Ajit", 20));
		peopleSet.add(new Person(20, "Ajit", 20));
		peopleSet.add(new Person(21, "Ajit", 22));
		peopleSet.add(new Person(22, "Ajit", 22));
		peopleSet.add(new Person(23, "Ajit", 25));
		peopleSet.add(new Person(24, "Ajit", 25));
		peopleSet.add(new Person(25, "Ajit", 25));
		peopleSet.add(new Person(26, "Ajit", 25));
		peopleSet.add(new Person(27, "Ajit", 25));
		peopleSet.add(new Person(28, "Ajit", 30));
		peopleSet.add(new Person(29, "Ajit", 30));
		peopleSet.add(new Person(30, "Ajit", 30));
 
		for(Person p: peopleSet) {
			System.out.println(p);
		}
		//step 1 : extract the age in some collection
		final List<Integer> ageList=new ArrayList<>();
		//step 2  : extract age from person
		for(Person p: peopleSet) {
			ageList.add(p.getAge());
		}
		//step 3: do the iteration ove agelist and get the sum
		int sum=0;
		for(int age:ageList) {
			sum=sum+age;
		}
		final double averageAge=sum/ageList.size();
		System.out.println("Average age : "+averageAge);


        // use lambda expression to find the average age and 
        // use lambda expression to find the average age using for each
        final double averageAge1=peopleSet.stream().filter(p->p.getAge()>20).mapToInt(p->p.getAge()).average().orElse(0.0);

        // sort the peopleSet based on age
        peopleSet.stream().sorted((p1,p2)->p1.getAge()-p2.getAge()).forEach(System.out::println);
        // sort the peopleSet based on age and name
        peopleSet.stream().sorted((p1,p2)->p1.getAge()-p2.getAge()).sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(System.out::println);
        // stream:
        /*
         * 1. stream does not store the data
         * 2. lazy evaluation(right -> left ) call on demand
         * 3. parallel processing
         * 4. filter, map, reduce, collect
         * 5. stream is not reusable
         * 6. stream is not thread safe, serializable, cloneable
         * 7. 
         * 
         * All reduction operations: collect, count, max, min, reduce, sum & average replace the for loop
        */

        // get the min age
        final int minAge=peopleSet.stream().mapToInt(p->p.getAge()).filter(age->age>20).min().getAsInt(); // output 21

        // use groupingby
        peopleSet.stream().collect(Collectors.groupingBy(p->p.getAge())).forEach((age,p)->System.out.println(age+" "+p));

        Map<Integer, List<Person>> map=peopleSet.stream().collect(Collectors.groupingBy(p->p.getAge()));

        // use reduce
        final int sumOfAge=peopleSet.stream().mapToInt(p->p.getAge()).reduce(0, (a,b)->a+b);
        final int sumOfAge=peopleSet.stream().mapToInt(p->p.getAge()).reduce(0, Integer::sum);
		
	}
 
}
 ```
TODO: Need to complet lambda pdf.