package com.example.mailsending;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailservice;
	
	@GetMapping("/home")
	public String mailpage(){
		return "home";
	}
	
	@RequestMapping("/register")
	public String sendEmailAfterReg(@RequestParam String email,@RequestParam String subject,@RequestParam String message ) {
		
		SimpleMailMessage mailmessage=new SimpleMailMessage();
		mailmessage.setTo(email);
		mailmessage.setSubject(subject);
		mailmessage.setFrom("jainnandita026@gmail.com");
		mailmessage.setText(message);
		emailservice.sendMail(mailmessage); 
		
		
		
		return "success";
		
	}
	

}
