package com.tirmizee.service;

public interface SendMailService {
	
	public void sendSimpleMail(String to, String title, String content);
	
	public void sendSimpleMailTemplate(String to, String title, String content);
	
	public void sendSimpleMailWithAttachments(String to, String title, String content);

}
