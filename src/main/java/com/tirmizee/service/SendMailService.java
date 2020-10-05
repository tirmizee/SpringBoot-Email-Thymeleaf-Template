package com.tirmizee.service;

import java.io.IOException;
import java.util.List;

import com.tirmizee.template.model.CustomerInfo;

public interface SendMailService {
	
	public void sendSimpleMail(String to, String title, String content);
	
	public void sendMailTemplate(String to, String title, String templateName, CustomerInfo customerInfo);
	
	public void sendMailTemplateIncludeImage(String to, String title, CustomerInfo customerInfo) throws IOException;
	
	public void sendMailTemplateForList(String to, String title, String templateName, List<CustomerInfo> customers);
	
	public void sendMailWithAttachments(String to, String title, String templateName);

}
