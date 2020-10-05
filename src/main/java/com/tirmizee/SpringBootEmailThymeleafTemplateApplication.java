package com.tirmizee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.github.javafaker.Faker;
import com.tirmizee.service.SendMailService;
import com.tirmizee.service.SendMailServiceImpl;
import com.tirmizee.template.model.CustomerInfo;

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
//		testSendMailTemplateIncludeImage(sendMailService);
//		testSendMailTemplateForList(sendMailService);
//		testSendMailTemplate(sendMailService);
		testSendMailWithAttachments(sendMailService);
		
	}

	private void testSendMailTemplateIncludeImage(SendMailService sendMailService) throws IOException {
		CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.setCusName("Pratya Yeekhaday");
		customerInfo.setCusAddress("470 Phetchaburi Rd, Thanon Phetchaburi, Ratchathewi, Bangkok 10400");
		sendMailService.sendMailTemplateIncludeImage("zee_pratya@hotmail.com", "Test images", customerInfo);
	}

	private void testSendMailTemplateForList(SendMailService sendMailService) {
		Faker faker = Faker.instance();
		List<CustomerInfo> customerInfos = new ArrayList<CustomerInfo>();
		for (int i = 0; i < 10; i++) {
			CustomerInfo customerInfo = new CustomerInfo();
			customerInfo.setCusNo(faker.code().ean8());
			customerInfo.setCusName(faker.name().fullName());
			customerInfo.setCusTel(faker.phoneNumber().phoneNumber());
			customerInfo.setCusAddress(faker.address().fullAddress());
			customerInfos.add(customerInfo);
		}
		sendMailService.sendMailTemplateForList("zee_pratya@hotmail.com", "Test List", "EMAIL_TEMPLATE_LIST", customerInfos);
	}

	private void testSendMailTemplate(SendMailService sendMailService) {
		// Example case send simple mail
		sendMailService.sendSimpleMail("zee_pratya@hotmail.com", "Test", "Hello world");
		CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.setCusName("Pratya Yeekhaday");
		customerInfo.setCusAddress("470 Phetchaburi Rd, Thanon Phetchaburi, Ratchathewi, Bangkok 10400");
		sendMailService.sendMailTemplate("zee_pratya@hotmail.com", "Test", "EMAIL_TEMPLATE_01", customerInfo);
		
	}

	private void testSendMailWithAttachments(SendMailService sendMailService) {
		sendMailService.sendMailWithAttachments("zee_pratya@hotmail.com", "Test Attachments", "EMAIL_TEMPLATE_02");
	}

}
