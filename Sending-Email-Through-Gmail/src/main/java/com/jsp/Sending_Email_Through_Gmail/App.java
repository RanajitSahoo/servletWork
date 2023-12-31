package com.jsp.Sending_Email_Through_Gmail;

import java.util.Random;

import com.jsp.EmailSend.EmailSender;

public class App {
	public static void main(String[] args) {
		EmailSender emailSender = new EmailSender();
		String to = "skabdulkalam13@gmail.com";
		String from = "raja123angul@gmail.com";
		String subject = "verification Code ";
		Random rand=new Random();
		int n=rand.nextInt(999999);
		System.out.println(n);
		String text = String.format("%06d", n);
		boolean isSend = emailSender.sendEmail(to, from, subject, text);
		if (isSend)
			System.out.println("Email is sent successfully");
		else
			System.out.println("there is a problem in sending mail");
	}
}
