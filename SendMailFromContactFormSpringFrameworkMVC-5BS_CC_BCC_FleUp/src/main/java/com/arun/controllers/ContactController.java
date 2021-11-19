package com.arun.controllers;

import java.io.File;

import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arun.entities.Contact;
import com.arun.services.MailService;

@Controller
@RequestMapping("/")
public class ContactController {
	
	@Autowired
	private MailService mailService;
	
	@Autowired
	private JavaMailSender javaMailsender;
	
	@RequestMapping(method=RequestMethod.GET)
	public String sindex(ModelMap modelmap) {
		 modelmap.put("contact",new Contact());
		return "contact/index";
	}

	@RequestMapping(value="send", method=RequestMethod.POST)
	public String send(@ModelAttribute("contact") Contact contact, ModelMap modelmap) {
		try {
			String content = "Name: "+contact.getName();
			 content += "<br>Phone: "+contact.getPhone();
			 content += "<br>Address: "+contact.getAddress();
			 content += "<br>Subject: "+contact.getSubject();
			 content += "<br>Message: "+contact.getContent();
//			 content += "<br>File: "+contact.getFile1();
			 
//			 Multipart multipart = new MimeMultipart();
//			 MimeBodyPart attachpart = new MimeBodyPart();
//			 attachpart.attachFile(contact.getFile1());
//			 multipart.addBodyPart(attachpart);
			 
			 mailService.send(contact.getEmail(),contact.getToEmail(),contact.getCC(),contact.getBCC(),contact.getSubject(),content/*,contact.getFile2()*/);
			 modelmap.put("msg", "Done");
			 
		} catch (Exception e) {
			 modelmap.put("errors", e.getMessage());
		} 
		
		return "contact/index";
	}
	
}
