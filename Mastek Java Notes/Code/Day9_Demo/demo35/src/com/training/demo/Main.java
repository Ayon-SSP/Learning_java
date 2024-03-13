package com.training.demo;

import com.training.demo.model.User;

public class Main {

	public static void main(String[] args) {
		User user1=new User(1,"John Doe", "johndoe@example.com");
		User user2=new User(1,"John Doe", "johndoe@example.com");
		User user3=user1;
		System.out.println("user1==user2: "+(user1==user2)); // false
		System.out.println("user1==user3: "+(user1==user3)); // true
		System.out.println("user1.equals(user2): " + user1.equals(user2)); // true
		System.out.println("user1.equals(user3): " + user1.equals(user3)); // true
		stringEqualityCheck();
	}

	private static void stringEqualityCheck() {
		String name1="Dhanashree";		
		String name2="Dhanashree";
		String name3=new String("Dhanashree1");
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println("hashcode value is unique");
		System.out.println("name1.hashCode():"+name1.hashCode());
		System.out.println("name2.hashCode():"+name2.hashCode());
		System.out.println("name3.hashCode():"+name3.hashCode());
		
		System.out.println("name1==name2=>"+(name1==name2)); // true
		System.out.println("name1==name3=>"+(name1==name3)); // false
		
		System.out.println("name1.equals(name2)=>"+name1.equals(name2)); // true
		System.out.println("name1.equals(name3)=>"+name1.equals(name3)); // false
		System.out.println("-------------------------------------");
	}

}
