package com.arun.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arun.entities.Contact;
import com.arun.services.MailService;

@Controller
@RequestMapping("contact")
public class ContactController {
	
	@Autowired
	private MailService mailService;
	
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
			 mailService.send(contact.getEmail(),"ginnaramak92@gmail.com",contact.getSubject(), content);
			 modelmap.put("msg", "Done");
		} catch (Exception e) {
			 modelmap.put("errors", e.getMessage());
		} 
		
		return "contact/index";
	}
	
}
