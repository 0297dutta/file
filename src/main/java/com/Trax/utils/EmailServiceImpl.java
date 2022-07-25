package com.Trax.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	 @Autowired
	    private JavaMailSender emailSender;

	    public void sendSimpleMessage(
	      String to, String sub, String text) {
	       
	        SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setTo(to); 
	        message.setSubject(sub); 
	        message.setText(text);
	        emailSender.send(message);
	        
	    }

}
