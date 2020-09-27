package com.tirmizee.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SendMailServiceImpl implements SendMailService {

	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public void sendSimpleMail(String to, String title, String content) {
		
		MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper;
        
        try {
			helper = new MimeMessageHelper(message, true ,"UTF-8");
	        helper.setTo(to);
	        helper.setSubject(title);
	        helper.setText(content, false);
	        mailSender.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sendSimpleMailTemplate(String to, String title, String content) {
		
	}
	
	@Override
	public void sendSimpleMailWithAttachments(String to, String title, String content) {
		
	}

}
