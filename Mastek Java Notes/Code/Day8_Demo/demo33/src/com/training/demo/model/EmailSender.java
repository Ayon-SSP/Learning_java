package com.training.demo.model;

public class EmailSender {

	public EmailSender() {
		super();
	}
	
	public void sendNotificationEmail(String email,String message) {
		System.out.println("Sending Notification email to: "+email);
		System.out.println("Message: "+message);
	}
	
	
}
