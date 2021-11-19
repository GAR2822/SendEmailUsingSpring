package com.arun.entities;

import java.io.File;

import javax.mail.Address;

import org.springframework.http.codec.multipart.FilePart;

public class Contact {
	private String name;
	private String phone;
	private String email;
	private String[] toEmail;//string array for multiple emails collection
	private String[] CC;
	private String[] BCC;
	private String Address;
	private String subject;
	private String content;
	
	private String file2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String[] getToEmail() {
		return toEmail;
	}
	public void setToEmail(String[] toEmail) {
		this.toEmail = toEmail;
	}
	
	public String[] getCC() {
		return CC;
	}
	public void setCC(String[] cC) {
		CC = cC;
	}
	public String[] getBCC() {
		return BCC;
	}
	public void setBCC(String[] bCC) {
		BCC = bCC;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFile2() {
		return file2;
	}
	public void setFile2(String file2) {
		this.file2 = file2;
	}
	
	
	
	
}
