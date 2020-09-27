package com.tirmizee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tirmizee.service.SendMailService;
import com.tirmizee.service.SendMailServiceImpl;

@SpringBootApplication
public class SpringBootEmailThymeleafTemplateApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailThymeleafTemplateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SendMailService sendMailService = applicationContext.getBean(SendMailServiceImpl.class);
		
		// Example case send simple mail
		sendMailService.sendSimpleMail("zee_pratya@hotmail.com", "Test", "Hello world");
	}

}
