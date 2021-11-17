package com.arun.services;

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailServiceImpl implements MailService {
	
	@Autowired
	private JavaMailSender javaMailsender;
	
	@Override
	public void send(String fromAddress, String[] toAddress, String subject, String content) throws Exception {
		 MimeMessage mimeMessage = javaMailsender.createMimeMessage();
		 MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
		 mimeMessageHelper.setFrom(fromAddress);
		 mimeMessageHelper.setTo(toAddress);
		 mimeMessageHelper.setSubject(subject);
		 mimeMessageHelper.setText(content,true);
		 mimeMessageHelper.setSentDate(new Date());
		 javaMailsender.send(mimeMessage);
		 
		
	}

}
