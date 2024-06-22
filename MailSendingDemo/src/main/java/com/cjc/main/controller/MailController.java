package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.serviceI.MailServiceI;

@RestController
public class MailController {
	
	@Autowired MailServiceI mailservice;
	
	@GetMapping("/send-mail/{toEmail}")
	public String  onSendMail(@PathVariable("toEmail")String toEmail)
	{
		mailservice.sendBookingMail(toEmail);
		return "Email Sended";
		
	}
	
}
