package com.training.demo;

import com.training.demo.model.EmailSender;
import com.training.demo.model.User;

public class Main {

	public static void main(String[] args) {
		User user=new User("John Doe","johndoe@example.com");
		EmailSender emailSender=new EmailSender();
		emailSender.sendNotificationEmail(user.getEmail(),"Welcome to example.com ");
	}

}
