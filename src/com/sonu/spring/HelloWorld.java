package com.sonu.spring;

public class HelloWorld {

	private String name;
	private String message;

	public void getName() {
		System.out.println("HelloWorld name : " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getMessage() {
		System.out.println("HelloWorld message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
