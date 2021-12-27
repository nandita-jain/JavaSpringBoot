package com.example.mailsending;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	private JavaMailSender javamailsender;
	
	public EmailService(JavaMailSender javamailsender) {
		this.javamailsender=javamailsender;
	}
	
	public void sendMail(SimpleMailMessage simplemailmessage) {
		javamailsender.send(simplemailmessage);
	}

}
