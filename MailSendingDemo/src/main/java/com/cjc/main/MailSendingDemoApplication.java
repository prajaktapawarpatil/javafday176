package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailSendingDemoApplication {

	public static void main(String[] args) {
		
		System.out.println("This is Mail Service");
		SpringApplication.run(MailSendingDemoApplication.class, args);
	}

}
