package com.Trax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Trax.utils.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
@RequestMapping("/sendEmail") 
	public String sendEmail(@RequestParam("to") String to,@RequestParam("subject") String subject,@RequestParam("body") String body,ModelMap model)
{
	emailService.sendSimpleMessage(to, subject, body);
	model.addAttribute("msg", "emailSent");	
	return"compose_email";
}
}
