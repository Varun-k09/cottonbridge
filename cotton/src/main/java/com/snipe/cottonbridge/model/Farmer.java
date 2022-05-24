package com.snipe.cottonbridge.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Farmer {
	
	
	@Id
	private int id;
	private String fullName;
	private String age;
	private String product;
	private String quantity;

	
	

	public Farmer() {
		super();
	}

	public Farmer(int id, String fullName, String age, String product, String quantity) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.product = product;
		this.quantity = quantity;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
