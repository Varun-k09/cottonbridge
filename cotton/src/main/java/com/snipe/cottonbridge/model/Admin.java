package com.snipe.cottonbridge.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	
	@Id
	private int id;
	private String fullName;
	private String emailId;
	private String password;
	private String category;
	
	
	
	public Admin() {
		super();
	}



	public Admin(int id, String fullName, String emailId, String password, String category) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.emailId = emailId;
		this.password = password;
		this.category = category;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	


	
	
}
