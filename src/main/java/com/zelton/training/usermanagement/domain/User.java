package com.zelton.training.usermanagement.domain;

public class User {
	
	private String id;
	private String name;
	private int age;
	private String merchantId;	
	
	@SuppressWarnings("unused")
	private User() {
		
	}
	
	public User(String id, String name, int age, String merchantId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.merchantId = merchantId;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
		

}
