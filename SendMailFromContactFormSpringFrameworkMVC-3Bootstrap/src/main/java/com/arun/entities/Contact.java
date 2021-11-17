package com.arun.entities;

public class Contact {
	private String name;
	private String phone;
	private String email;
	private String[] toEmail;//string array for multiple emails collection
	private String Address;
	private String subject;
	private String content;
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
	
}
