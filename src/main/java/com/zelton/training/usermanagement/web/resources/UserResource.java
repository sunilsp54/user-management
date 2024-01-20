package com.zelton.training.usermanagement.web.resources;

import com.zelton.training.usermanagement.domain.Merchant;

public class UserResource {
	
	private String id;
	private String name;
	private int age;	
	private Merchant merchant;
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}	
	
}


