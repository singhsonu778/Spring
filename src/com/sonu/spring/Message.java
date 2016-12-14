package com.sonu.spring;

public class Message {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Message : " + message);
	}

	public void init() {
		System.out.println("In init method...");
	}

	public void destroy() {
		System.out.println("In destroy method...");
	}
}
