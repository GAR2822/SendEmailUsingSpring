package com.arun.services;


import java.io.File;
import java.util.Date;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailServiceImpl implements MailService {
	
	@Autowired
	private JavaMailSender javamailsender;
	
	public void send(String fromAddress, String[] toAddress,String[] CC,String[] BCC, String subject, String content /*,String file2*/) throws Exception {
	
		 MimeMessage mimeMessage = javamailsender.createMimeMessage();
		 MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
		 mimeMessageHelper.setFrom(fromAddress);
		 mimeMessageHelper.setTo(toAddress);
		 mimeMessageHelper.setSubject(subject);
		 mimeMessageHelper.setText(content,true);//Check use of this
		 mimeMessageHelper.setSentDate(new Date());
		 mimeMessageHelper.setCc(CC);
		 mimeMessageHelper.setBcc(BCC);
		 
//		 mimeMessageHelper.addAttachment(file2.getName(), null);
//		 mimeMessageHelper.addAttachment(file2.getName(), file2);
		 
//		 FileSystemResource file = new FileSystemResource(file1);
//		 
//		 mimeMessageHelper.addAttachment(file.getFilename(), file);
		 
//		 
		 javamailsender.send(mimeMessage);
		 
		 
		 
		
	}

}

//MimeMessagePreparator preparator = new MimeMessagePreparator() 
//{
//    public void prepare(MimeMessage mimeMessage) throws Exception 
//    {
//    	mimeMessage.setRecipients(Message.RecipientType.TO, toAddress);
//        mimeMessage.setFrom(new InternetAddress(fromAddress));
//        mimeMessage.setSubject(subject);
//        mimeMessage.setText(content);
//         
//        FileSystemResource file = new FileSystemResource(new File(file1));
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
//        helper.addAttachment(file1, file);
//    }
//};
//
//try {
//    mailsender.send(preparator);
//}
//catch (MailException ex) {
//    System.err.println(ex.getMessage());
//}