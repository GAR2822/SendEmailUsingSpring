package com.arun.services;

import java.io.File;

import javax.mail.Address;

public interface MailService {
	public void send(String fromAddress,String[] toAddress,String[] CC,String[] BCC,String subject,String content/*,File file2*/) throws Exception;
}
