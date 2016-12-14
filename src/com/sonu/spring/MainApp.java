package com.sonu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Message obj = (Message) context.getBean("messageBean");

		obj.setMessage("Hello World!");
		obj.getMessage();
		
		Message obj1 = (Message) context.getBean("messageBean");
		obj1.getMessage();

	}
}