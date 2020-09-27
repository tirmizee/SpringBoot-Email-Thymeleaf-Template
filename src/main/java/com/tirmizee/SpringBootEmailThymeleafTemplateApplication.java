package com.tirmizee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

@SpringBootApplication
public class SpringBootEmailThymeleafTemplateApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailThymeleafTemplateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SpringTemplateEngine templateEngine = applicationContext.getBean(SpringTemplateEngine.class);
		System.out.println(templateEngine != null);
	}

}
