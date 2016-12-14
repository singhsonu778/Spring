package com.sonu.spring;

public class HelloCountry {

	private String name;
	private String message;
	private String currency;

	public void getName() {
		System.out.println("HelloCountry name : " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getMessage() {
		System.out.println("HelloCountry message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getCurrency() {
		System.out.println("HelloCountry currency : " + currency);
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
