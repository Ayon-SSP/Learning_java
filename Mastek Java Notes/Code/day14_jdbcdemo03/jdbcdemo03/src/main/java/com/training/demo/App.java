package com.training.demo;

import java.util.List;
import java.util.Scanner;

import com.training.demo.collection.UserList;
import com.training.demo.dao.UserDao;
import com.training.demo.model.User;
import com.training.demo.service.UserService;
import com.training.demo.util.DBConnection;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		DBConnection dbConnection = DBConnection.getDbConnnection();
		UserDao userDao = new UserDao(dbConnection);
		UserList userList = new UserList(userDao);
		UserService userService = new UserService(userList);
		Scanner sc = new Scanner(System.in);
		boolean test = true;
		try {
			while (test) {
				System.out.println("Choose the operation");
				System.out.println("1. Display All Users");
				System.out.println("2. Displa User details by userId");
				System.out.println("3. Update user");
				System.out.println("4. Delete User");
				System.out.println("5. Create User");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					final List<User> users = userService.findAll();
					users.forEach(p -> System.out.println(p));
					break;
				case 2:
					final User user = userService.findOne(3);
					System.out.println(user);
					break;
				case 3:
					final User updateUser = new User(3, "Amit", "amit@sample.com");
					if(userService.update(3, updateUser))
						System.out.println(updateUser+" is updated ");;
						break;
				case 4:
					if(userService.delete(31)) {
						System.out.println("userid="+3+" is deleted ");;
					}break;
				case 5:
					final User newUser = new User(0, "ayushi", "ayushi@sample.com");
					if(userService.create(newUser)!=null) {
						System.out.println(newUser+ " added to the record");
					}
					break;
				default:
					System.out.println("Choose something between 1 to 5");
					break;

				}
				System.out.println("Do you want to continue?y/n");
				if(sc.nextLine().equalsIgnoreCase("n")) {
					test=false;
				}

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
